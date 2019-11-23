import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Servicios.PaisServices;
import grpcEjercicio.Pais;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCMain {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		
		Server server = ServerBuilder.forPort(9090).addService(new PaisServices()).build();
		server.start();
		System.out.println("Server running on 9090");
		
		
		
		
		
		server.awaitTermination();

	}

}
