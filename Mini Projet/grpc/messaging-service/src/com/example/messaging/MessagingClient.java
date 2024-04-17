import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MessagingClient {
    private final MessagingServiceGrpc.MessagingServiceBlockingStub stub;

    public MessagingClient(String host, int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
            .usePlaintext()
            .build();
        stub = MessagingServiceGrpc.newBlockingStub(channel);
    }

    public void sendMessage(String from, String to, String message) {
        SendRequest request = SendRequest.newBuilder()
            .setFromUser(from)
            .setToUser(to)
            .setMessage(message)
            .build();
        SendResponse response = stub.sendMessage(request);
        System.out.println("Message sent: " + response.getSuccess());
    }

    public void getMessages(String user) {
        GetMessagesRequest request = GetMessagesRequest.newBuilder()
            .setUser(user)
            .build();
        GetMessagesResponse response = stub.getMessages(request);
        response.getMessagesList().forEach(System.out);
    }

    public static void main(String[] args) {
        MessagingClient client = new MessagingClient("localhost", 9090);
        client.sendMessage("Alice", "Bob", "Hello Bob!");
        client.getMessages("Bob");
    }
}
