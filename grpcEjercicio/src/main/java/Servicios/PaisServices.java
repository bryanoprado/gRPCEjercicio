package Servicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bryan.grpc.Geografia.capitalResponse;
import com.bryan.grpc.Geografia.ciudadResponse;
import com.bryan.grpc.Geografia.habitantesResponse;
import com.bryan.grpc.Geografia.paisRequest;
import com.bryan.grpc.PaisesGrpc.PaisesImplBase;

import grpcEjercicio.Pais;
import io.grpc.stub.StreamObserver;

public class PaisServices extends PaisesImplBase {
	
	List<Pais> paises;
	public PaisServices (){
		paises = new ArrayList();
		Pais guatemala = new Pais("Guatemala","Guatemala", Arrays.asList("Guatemala","Quetzaltenango","Flores"), 17);
		Pais elSalvador = new Pais("El Salvador","El Salvador", Arrays.asList("El Salvador","Santa Tecla"), 8);
		Pais colombia = new Pais("Colombia","Bogota", Arrays.asList("Cali","Bogota", "Medellin"), 50);
		paises.add(guatemala);
		paises.add(elSalvador);
		paises.add(colombia);
	}

	@Override
	public void getCapital(paisRequest request, StreamObserver<capitalResponse> responseObserver) {
		System.out.println("Inside getCapital"); 
		
		capitalResponse.Builder response = capitalResponse.newBuilder();
		
		Pais paisBuscado = findUsingEnhancedForLoop(request.getNombrePais(),paises);
		if (  paisBuscado != null )	{
			response.setNombreCapital(paisBuscado.getCapital());
		}else {
			response.setNombreCapital("No encontrado");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void getCiudades(paisRequest request, StreamObserver<ciudadResponse> responseObserver) {
		System.out.println("Inside getCiudades"); 
		
		Pais paisBuscado = findUsingEnhancedForLoop(request.getNombrePais(),paises);
		if (  paisBuscado != null )	{
			for (String ciudad: paisBuscado.getCiudades()) {
				responseObserver.onNext(
						ciudadResponse.newBuilder().setNombreCiudad(ciudad).build()
						);
			}

		}else {
			ciudadResponse.Builder response = ciudadResponse.newBuilder();
			response.setNombreCiudad("No encontrado");
			responseObserver.onNext(response.build());
		}
			
		responseObserver.onCompleted();

	}

	@Override
	public StreamObserver<paisRequest> getCantidadHabitantes(StreamObserver<habitantesResponse> responseObserver) {
		System.out.println("Inside getCantidadHabitantes"); 
		return new StreamObserver<paisRequest>() {
			
			int sumHabitantes =0;
			
			@Override
			public void onNext(paisRequest value) {
				Pais paisBuscado = findUsingEnhancedForLoop(value.getNombrePais(),paises);
				if (  paisBuscado != null )	{
					sumHabitantes += paisBuscado.getHabitantes();
				}
				
				
			}

			@Override
			public void onError(Throwable t) {
				System.out.println("Error: "+ t.getMessage());
				
			}

			@Override
			public void onCompleted() {
				responseObserver.onNext(habitantesResponse.newBuilder().setHabitantes(sumHabitantes).build());
				responseObserver.onCompleted();
				
			}
		
		};
	}

	@Override
	public StreamObserver<paisRequest> getMultiplesCapital(StreamObserver<capitalResponse> responseObserver) {
		System.out.println("Inside getMultiplesCapital"); 
		return new StreamObserver<paisRequest>() {

			@Override
			public void onNext(paisRequest value) {
				Pais paisBuscado = findUsingEnhancedForLoop(value.getNombrePais(),paises);
				if (  paisBuscado != null )	{
					/*for (String ciudad: paisBuscado.getCiudades()) {
						responseObserver.onNext(
								capitalResponse.newBuilder().setNombreCapital(ciudad).build()
								);
					}*/
					responseObserver.onNext(
							capitalResponse.newBuilder().setNombreCapital(paisBuscado.getCapital()).build()
							);

				}else {
					capitalResponse.Builder response = capitalResponse.newBuilder();
					response.setNombreCapital("No encontrado");
					responseObserver.onNext(response.build());
				}
				
			}

			@Override
			public void onError(Throwable t) {
				System.out.println("Error: "+ t.getMessage());
				
			}

			@Override
			public void onCompleted() {
				responseObserver.onNext(capitalResponse.newBuilder().setNombreCapital("Final").build());
				responseObserver.onCompleted();
				
			}
			
		};
	}
	
	public Pais findUsingEnhancedForLoop(
	  String name, List<Pais> paises) {
	 
	    for ( Pais pais: paises) {
	        if (pais.getName().equals(name)) {
	            return pais;
	        }
	    }
	    return null;
	}

}
