package grpc.Messaging;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class MessagingServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090)
            .addService(new MessagingServiceImpl())
            .build();

        server.start();
        System.out.println("Server started at " + server.getPort());
        server.awaitTermination();
    }
}