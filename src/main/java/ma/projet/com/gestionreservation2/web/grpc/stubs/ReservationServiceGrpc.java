package ma.projet.com.gestionreservation2.web.grpc.stubs;

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
    comments = "Source: reservation.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest,
      ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse> getGetAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllReservations",
      requestType = ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest.class,
      responseType = ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest,
      ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse> getGetAllReservationsMethod() {
    io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest, ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse> getGetAllReservationsMethod;
    if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
          ReservationServiceGrpc.getGetAllReservationsMethod = getGetAllReservationsMethod = 
              io.grpc.MethodDescriptor.<ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest, ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "getAllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("getAllReservations"))
                  .build();
          }
        }
     }
     return getGetAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest,
      ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse> getGetReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReservationById",
      requestType = ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest.class,
      responseType = ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest,
      ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse> getGetReservationByIdMethod() {
    io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest, ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse> getGetReservationByIdMethod;
    if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
          ReservationServiceGrpc.getGetReservationByIdMethod = getGetReservationByIdMethod = 
              io.grpc.MethodDescriptor.<ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest, ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "getReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("getReservationById"))
                  .build();
          }
        }
     }
     return getGetReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest,
      ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse> getSaveReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveReservation",
      requestType = ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest.class,
      responseType = ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest,
      ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse> getSaveReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest, ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse> getSaveReservationMethod;
    if ((getSaveReservationMethod = ReservationServiceGrpc.getSaveReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getSaveReservationMethod = ReservationServiceGrpc.getSaveReservationMethod) == null) {
          ReservationServiceGrpc.getSaveReservationMethod = getSaveReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest, ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "saveReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("saveReservation"))
                  .build();
          }
        }
     }
     return getSaveReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest,
      ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteReservation",
      requestType = ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest.class,
      responseType = ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest,
      ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest, ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest, ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "deleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("deleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest,
      ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateReservation",
      requestType = ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest.class,
      responseType = ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest,
      ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest, ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
          ReservationServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest, ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "updateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("updateReservation"))
                  .build();
          }
        }
     }
     return getUpdateReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllReservations(ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllReservationsMethod(), responseObserver);
    }

    /**
     */
    public void getReservationById(ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveReservationMethod(), responseObserver);
    }

    /**
     */
    public void deleteReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    /**
     */
    public void updateReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest,
                ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse>(
                  this, METHODID_GET_ALL_RESERVATIONS)))
          .addMethod(
            getGetReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest,
                ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse>(
                  this, METHODID_GET_RESERVATION_BY_ID)))
          .addMethod(
            getSaveReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest,
                ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse>(
                  this, METHODID_SAVE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest,
                ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse>(
                  this, METHODID_DELETE_RESERVATION)))
          .addMethod(
            getUpdateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest,
                ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse>(
                  this, METHODID_UPDATE_RESERVATION)))
          .build();
    }
  }

  /**
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllReservations(ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationById(ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse getAllReservations(ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse getReservationById(ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse saveReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse deleteReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse updateReservation(ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse> getAllReservations(
        ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse> getReservationById(
        ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse> saveReservation(
        ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse> deleteReservation(
        ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse> updateReservation(
        ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_RESERVATIONS = 0;
  private static final int METHODID_GET_RESERVATION_BY_ID = 1;
  private static final int METHODID_SAVE_RESERVATION = 2;
  private static final int METHODID_DELETE_RESERVATION = 3;
  private static final int METHODID_UPDATE_RESERVATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_RESERVATIONS:
          serviceImpl.getAllReservations((ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.GetAllReservationsResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_BY_ID:
          serviceImpl.getReservationById((ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.GetReservationByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_RESERVATION:
          serviceImpl.saveReservation((ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.SaveReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.DeleteReservationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.com.gestionreservation2.web.grpc.stubs.UpdateReservationResponse>) responseObserver);
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

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.projet.com.gestionreservation2.web.grpc.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getGetAllReservationsMethod())
              .addMethod(getGetReservationByIdMethod())
              .addMethod(getSaveReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .addMethod(getUpdateReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
