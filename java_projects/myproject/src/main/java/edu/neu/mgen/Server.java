package edu.neu.mgen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {

    private static final int SERVER_PORT = 12345; 

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            System.out.println("Server is listening on port " + SERVER_PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept(); 
                executorService.submit(new ClientHandler(clientSocket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private final Socket clientSocket;
    
        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }
    
        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                String message;
                while ((message = reader.readLine()) != null) {
                    // Handle the received message
                    System.out.println("Received message: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

