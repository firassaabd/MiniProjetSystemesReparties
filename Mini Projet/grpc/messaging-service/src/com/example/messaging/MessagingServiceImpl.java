package com.example.messaging;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.ConcurrentHashMap;

public class MessagingServiceImpl extends MessagingServiceGrpc.MessagingServiceImplBase {
    private static ConcurrentHashMap<String, List<String>> messages = new ConcurrentHashMap<>();

    @Override
    public void sendMessage(SendRequest req, StreamObserver<SendResponse> responseObserver) {
        List<String> messagesForUser = messages.get(req.getToUser());
if (messagesForUser == null) {
    messagesForUser = new ArrayList<>();
    messages.put(req.getToUser(), messagesForUser);
}
messagesForUser.add(req.getMessage());

        SendResponse response = SendResponse.newBuilder().setSuccess(true).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getMessages(GetMessagesRequest req, StreamObserver<GetMessagesResponse> responseObserver) {
        List<String> msgs = messages.getOrDefault(req.getUser(), new ArrayList<>());
        GetMessagesResponse response = GetMessagesResponse.newBuilder().addAllMessages(msgs).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
