

import java.io.*;
import java.net.*;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 1234;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        // This thread reads from the server and prints to the console
        Thread readerThread = new Thread(() -> {
            try {
                String serverInput;
                while ((serverInput = in.readLine()) != null) {
                    System.out.println("Server says: " + serverInput);
                }
            } catch (IOException e) {
                System.out.println("Error reading from server: " + e.getMessage());
            }
        });

        readerThread.start();

        // Main thread sends user input to the server
        String userInputText;
        while ((userInputText = userInput.readLine()) != null) {
            out.println(userInputText);
        }

        socket.close();
        System.exit(0);
    }
}
