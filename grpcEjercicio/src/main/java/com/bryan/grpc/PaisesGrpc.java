package com.bryan.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: geografia.proto")
public final class PaisesGrpc {

  private PaisesGrpc() {}

  public static final String SERVICE_NAME = "Paises";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest,
      com.bryan.grpc.Geografia.capitalResponse> getGetCapitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCapital",
      requestType = com.bryan.grpc.Geografia.paisRequest.class,
      responseType = com.bryan.grpc.Geografia.capitalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest,
      com.bryan.grpc.Geografia.capitalResponse> getGetCapitalMethod() {
    io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest, com.bryan.grpc.Geografia.capitalResponse> getGetCapitalMethod;
    if ((getGetCapitalMethod = PaisesGrpc.getGetCapitalMethod) == null) {
      synchronized (PaisesGrpc.class) {
        if ((getGetCapitalMethod = PaisesGrpc.getGetCapitalMethod) == null) {
          PaisesGrpc.getGetCapitalMethod = getGetCapitalMethod = 
              io.grpc.MethodDescriptor.<com.bryan.grpc.Geografia.paisRequest, com.bryan.grpc.Geografia.capitalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Paises", "getCapital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bryan.grpc.Geografia.paisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bryan.grpc.Geografia.capitalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PaisesMethodDescriptorSupplier("getCapital"))
                  .build();
          }
        }
     }
     return getGetCapitalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest,
      com.bryan.grpc.Geografia.ciudadResponse> getGetCiudadesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCiudades",
      requestType = com.bryan.grpc.Geografia.paisRequest.class,
      responseType = com.bryan.grpc.Geografia.ciudadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest,
      com.bryan.grpc.Geografia.ciudadResponse> getGetCiudadesMethod() {
    io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest, com.bryan.grpc.Geografia.ciudadResponse> getGetCiudadesMethod;
    if ((getGetCiudadesMethod = PaisesGrpc.getGetCiudadesMethod) == null) {
      synchronized (PaisesGrpc.class) {
        if ((getGetCiudadesMethod = PaisesGrpc.getGetCiudadesMethod) == null) {
          PaisesGrpc.getGetCiudadesMethod = getGetCiudadesMethod = 
              io.grpc.MethodDescriptor.<com.bryan.grpc.Geografia.paisRequest, com.bryan.grpc.Geografia.ciudadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Paises", "getCiudades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bryan.grpc.Geografia.paisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bryan.grpc.Geografia.ciudadResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PaisesMethodDescriptorSupplier("getCiudades"))
                  .build();
          }
        }
     }
     return getGetCiudadesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest,
      com.bryan.grpc.Geografia.habitantesResponse> getGetCantidadHabitantesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCantidadHabitantes",
      requestType = com.bryan.grpc.Geografia.paisRequest.class,
      responseType = com.bryan.grpc.Geografia.habitantesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest,
      com.bryan.grpc.Geografia.habitantesResponse> getGetCantidadHabitantesMethod() {
    io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest, com.bryan.grpc.Geografia.habitantesResponse> getGetCantidadHabitantesMethod;
    if ((getGetCantidadHabitantesMethod = PaisesGrpc.getGetCantidadHabitantesMethod) == null) {
      synchronized (PaisesGrpc.class) {
        if ((getGetCantidadHabitantesMethod = PaisesGrpc.getGetCantidadHabitantesMethod) == null) {
          PaisesGrpc.getGetCantidadHabitantesMethod = getGetCantidadHabitantesMethod = 
              io.grpc.MethodDescriptor.<com.bryan.grpc.Geografia.paisRequest, com.bryan.grpc.Geografia.habitantesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Paises", "getCantidadHabitantes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bryan.grpc.Geografia.paisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bryan.grpc.Geografia.habitantesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PaisesMethodDescriptorSupplier("getCantidadHabitantes"))
                  .build();
          }
        }
     }
     return getGetCantidadHabitantesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest,
      com.bryan.grpc.Geografia.capitalResponse> getGetMultiplesCapitalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMultiplesCapital",
      requestType = com.bryan.grpc.Geografia.paisRequest.class,
      responseType = com.bryan.grpc.Geografia.capitalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest,
      com.bryan.grpc.Geografia.capitalResponse> getGetMultiplesCapitalMethod() {
    io.grpc.MethodDescriptor<com.bryan.grpc.Geografia.paisRequest, com.bryan.grpc.Geografia.capitalResponse> getGetMultiplesCapitalMethod;
    if ((getGetMultiplesCapitalMethod = PaisesGrpc.getGetMultiplesCapitalMethod) == null) {
      synchronized (PaisesGrpc.class) {
        if ((getGetMultiplesCapitalMethod = PaisesGrpc.getGetMultiplesCapitalMethod) == null) {
          PaisesGrpc.getGetMultiplesCapitalMethod = getGetMultiplesCapitalMethod = 
              io.grpc.MethodDescriptor.<com.bryan.grpc.Geografia.paisRequest, com.bryan.grpc.Geografia.capitalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Paises", "getMultiplesCapital"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bryan.grpc.Geografia.paisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bryan.grpc.Geografia.capitalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PaisesMethodDescriptorSupplier("getMultiplesCapital"))
                  .build();
          }
        }
     }
     return getGetMultiplesCapitalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaisesStub newStub(io.grpc.Channel channel) {
    return new PaisesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaisesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PaisesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaisesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PaisesFutureStub(channel);
  }

  /**
   */
  public static abstract class PaisesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCapital(com.bryan.grpc.Geografia.paisRequest request,
        io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.capitalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCapitalMethod(), responseObserver);
    }

    /**
     */
    public void getCiudades(com.bryan.grpc.Geografia.paisRequest request,
        io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.ciudadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCiudadesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.paisRequest> getCantidadHabitantes(
        io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.habitantesResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetCantidadHabitantesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.paisRequest> getMultiplesCapital(
        io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.capitalResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetMultiplesCapitalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCapitalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bryan.grpc.Geografia.paisRequest,
                com.bryan.grpc.Geografia.capitalResponse>(
                  this, METHODID_GET_CAPITAL)))
          .addMethod(
            getGetCiudadesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.bryan.grpc.Geografia.paisRequest,
                com.bryan.grpc.Geografia.ciudadResponse>(
                  this, METHODID_GET_CIUDADES)))
          .addMethod(
            getGetCantidadHabitantesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.bryan.grpc.Geografia.paisRequest,
                com.bryan.grpc.Geografia.habitantesResponse>(
                  this, METHODID_GET_CANTIDAD_HABITANTES)))
          .addMethod(
            getGetMultiplesCapitalMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.bryan.grpc.Geografia.paisRequest,
                com.bryan.grpc.Geografia.capitalResponse>(
                  this, METHODID_GET_MULTIPLES_CAPITAL)))
          .build();
    }
  }

  /**
   */
  public static final class PaisesStub extends io.grpc.stub.AbstractStub<PaisesStub> {
    private PaisesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaisesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaisesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaisesStub(channel, callOptions);
    }

    /**
     */
    public void getCapital(com.bryan.grpc.Geografia.paisRequest request,
        io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.capitalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCapitalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCiudades(com.bryan.grpc.Geografia.paisRequest request,
        io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.ciudadResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCiudadesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.paisRequest> getCantidadHabitantes(
        io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.habitantesResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetCantidadHabitantesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.paisRequest> getMultiplesCapital(
        io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.capitalResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetMultiplesCapitalMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PaisesBlockingStub extends io.grpc.stub.AbstractStub<PaisesBlockingStub> {
    private PaisesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaisesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaisesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaisesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bryan.grpc.Geografia.capitalResponse getCapital(com.bryan.grpc.Geografia.paisRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCapitalMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.bryan.grpc.Geografia.ciudadResponse> getCiudades(
        com.bryan.grpc.Geografia.paisRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCiudadesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaisesFutureStub extends io.grpc.stub.AbstractStub<PaisesFutureStub> {
    private PaisesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PaisesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaisesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PaisesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bryan.grpc.Geografia.capitalResponse> getCapital(
        com.bryan.grpc.Geografia.paisRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCapitalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAPITAL = 0;
  private static final int METHODID_GET_CIUDADES = 1;
  private static final int METHODID_GET_CANTIDAD_HABITANTES = 2;
  private static final int METHODID_GET_MULTIPLES_CAPITAL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaisesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaisesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAPITAL:
          serviceImpl.getCapital((com.bryan.grpc.Geografia.paisRequest) request,
              (io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.capitalResponse>) responseObserver);
          break;
        case METHODID_GET_CIUDADES:
          serviceImpl.getCiudades((com.bryan.grpc.Geografia.paisRequest) request,
              (io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.ciudadResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CANTIDAD_HABITANTES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getCantidadHabitantes(
              (io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.habitantesResponse>) responseObserver);
        case METHODID_GET_MULTIPLES_CAPITAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getMultiplesCapital(
              (io.grpc.stub.StreamObserver<com.bryan.grpc.Geografia.capitalResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PaisesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaisesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bryan.grpc.Geografia.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Paises");
    }
  }

  private static final class PaisesFileDescriptorSupplier
      extends PaisesBaseDescriptorSupplier {
    PaisesFileDescriptorSupplier() {}
  }

  private static final class PaisesMethodDescriptorSupplier
      extends PaisesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaisesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PaisesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaisesFileDescriptorSupplier())
              .addMethod(getGetCapitalMethod())
              .addMethod(getGetCiudadesMethod())
              .addMethod(getGetCantidadHabitantesMethod())
              .addMethod(getGetMultiplesCapitalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
