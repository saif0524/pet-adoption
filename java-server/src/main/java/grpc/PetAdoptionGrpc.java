package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: pet-adoption.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PetAdoptionGrpc {

  private PetAdoptionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "petadoption.PetAdoption";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.PetAdoptionProto.RegisterPetRequest,
      grpc.PetAdoptionProto.RegisterPetResponse> getRegisterPetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPet",
      requestType = grpc.PetAdoptionProto.RegisterPetRequest.class,
      responseType = grpc.PetAdoptionProto.RegisterPetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.PetAdoptionProto.RegisterPetRequest,
      grpc.PetAdoptionProto.RegisterPetResponse> getRegisterPetMethod() {
    io.grpc.MethodDescriptor<grpc.PetAdoptionProto.RegisterPetRequest, grpc.PetAdoptionProto.RegisterPetResponse> getRegisterPetMethod;
    if ((getRegisterPetMethod = PetAdoptionGrpc.getRegisterPetMethod) == null) {
      synchronized (PetAdoptionGrpc.class) {
        if ((getRegisterPetMethod = PetAdoptionGrpc.getRegisterPetMethod) == null) {
          PetAdoptionGrpc.getRegisterPetMethod = getRegisterPetMethod =
              io.grpc.MethodDescriptor.<grpc.PetAdoptionProto.RegisterPetRequest, grpc.PetAdoptionProto.RegisterPetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.PetAdoptionProto.RegisterPetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.PetAdoptionProto.RegisterPetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PetAdoptionMethodDescriptorSupplier("RegisterPet"))
              .build();
        }
      }
    }
    return getRegisterPetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.PetAdoptionProto.SearchPetRequest,
      grpc.PetAdoptionProto.SearchPetResponse> getSearchPetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchPet",
      requestType = grpc.PetAdoptionProto.SearchPetRequest.class,
      responseType = grpc.PetAdoptionProto.SearchPetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.PetAdoptionProto.SearchPetRequest,
      grpc.PetAdoptionProto.SearchPetResponse> getSearchPetMethod() {
    io.grpc.MethodDescriptor<grpc.PetAdoptionProto.SearchPetRequest, grpc.PetAdoptionProto.SearchPetResponse> getSearchPetMethod;
    if ((getSearchPetMethod = PetAdoptionGrpc.getSearchPetMethod) == null) {
      synchronized (PetAdoptionGrpc.class) {
        if ((getSearchPetMethod = PetAdoptionGrpc.getSearchPetMethod) == null) {
          PetAdoptionGrpc.getSearchPetMethod = getSearchPetMethod =
              io.grpc.MethodDescriptor.<grpc.PetAdoptionProto.SearchPetRequest, grpc.PetAdoptionProto.SearchPetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchPet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.PetAdoptionProto.SearchPetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.PetAdoptionProto.SearchPetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PetAdoptionMethodDescriptorSupplier("SearchPet"))
              .build();
        }
      }
    }
    return getSearchPetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PetAdoptionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetAdoptionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetAdoptionStub>() {
        @java.lang.Override
        public PetAdoptionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetAdoptionStub(channel, callOptions);
        }
      };
    return PetAdoptionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PetAdoptionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetAdoptionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetAdoptionBlockingStub>() {
        @java.lang.Override
        public PetAdoptionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetAdoptionBlockingStub(channel, callOptions);
        }
      };
    return PetAdoptionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PetAdoptionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetAdoptionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetAdoptionFutureStub>() {
        @java.lang.Override
        public PetAdoptionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetAdoptionFutureStub(channel, callOptions);
        }
      };
    return PetAdoptionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Register a new pet
     * </pre>
     */
    default void registerPet(grpc.PetAdoptionProto.RegisterPetRequest request,
        io.grpc.stub.StreamObserver<grpc.PetAdoptionProto.RegisterPetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search for a pet by one of its key details
     * </pre>
     */
    default void searchPet(grpc.PetAdoptionProto.SearchPetRequest request,
        io.grpc.stub.StreamObserver<grpc.PetAdoptionProto.SearchPetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchPetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PetAdoption.
   */
  public static abstract class PetAdoptionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PetAdoptionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PetAdoption.
   */
  public static final class PetAdoptionStub
      extends io.grpc.stub.AbstractAsyncStub<PetAdoptionStub> {
    private PetAdoptionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetAdoptionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetAdoptionStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new pet
     * </pre>
     */
    public void registerPet(grpc.PetAdoptionProto.RegisterPetRequest request,
        io.grpc.stub.StreamObserver<grpc.PetAdoptionProto.RegisterPetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search for a pet by one of its key details
     * </pre>
     */
    public void searchPet(grpc.PetAdoptionProto.SearchPetRequest request,
        io.grpc.stub.StreamObserver<grpc.PetAdoptionProto.SearchPetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchPetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PetAdoption.
   */
  public static final class PetAdoptionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PetAdoptionBlockingStub> {
    private PetAdoptionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetAdoptionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetAdoptionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new pet
     * </pre>
     */
    public grpc.PetAdoptionProto.RegisterPetResponse registerPet(grpc.PetAdoptionProto.RegisterPetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search for a pet by one of its key details
     * </pre>
     */
    public grpc.PetAdoptionProto.SearchPetResponse searchPet(grpc.PetAdoptionProto.SearchPetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchPetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PetAdoption.
   */
  public static final class PetAdoptionFutureStub
      extends io.grpc.stub.AbstractFutureStub<PetAdoptionFutureStub> {
    private PetAdoptionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetAdoptionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetAdoptionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new pet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.PetAdoptionProto.RegisterPetResponse> registerPet(
        grpc.PetAdoptionProto.RegisterPetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search for a pet by one of its key details
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.PetAdoptionProto.SearchPetResponse> searchPet(
        grpc.PetAdoptionProto.SearchPetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchPetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PET = 0;
  private static final int METHODID_SEARCH_PET = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_PET:
          serviceImpl.registerPet((grpc.PetAdoptionProto.RegisterPetRequest) request,
              (io.grpc.stub.StreamObserver<grpc.PetAdoptionProto.RegisterPetResponse>) responseObserver);
          break;
        case METHODID_SEARCH_PET:
          serviceImpl.searchPet((grpc.PetAdoptionProto.SearchPetRequest) request,
              (io.grpc.stub.StreamObserver<grpc.PetAdoptionProto.SearchPetResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterPetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.PetAdoptionProto.RegisterPetRequest,
              grpc.PetAdoptionProto.RegisterPetResponse>(
                service, METHODID_REGISTER_PET)))
        .addMethod(
          getSearchPetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.PetAdoptionProto.SearchPetRequest,
              grpc.PetAdoptionProto.SearchPetResponse>(
                service, METHODID_SEARCH_PET)))
        .build();
  }

  private static abstract class PetAdoptionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PetAdoptionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.PetAdoptionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PetAdoption");
    }
  }

  private static final class PetAdoptionFileDescriptorSupplier
      extends PetAdoptionBaseDescriptorSupplier {
    PetAdoptionFileDescriptorSupplier() {}
  }

  private static final class PetAdoptionMethodDescriptorSupplier
      extends PetAdoptionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PetAdoptionMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PetAdoptionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PetAdoptionFileDescriptorSupplier())
              .addMethod(getRegisterPetMethod())
              .addMethod(getSearchPetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
