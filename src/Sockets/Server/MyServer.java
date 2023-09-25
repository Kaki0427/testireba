package Sockets.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        Thread receiveThread = new Thread(() -> {
            try {
                while (true) {
                    String receivedMessage = receiveMessage();
                    System.out.println("Client: " + receivedMessage);
                }
            } catch (IOException e) {
            }
        });
        receiveThread.start();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            sendMessage(input);
        }

    }


    public String receiveMessage() throws IOException {

        return in.readLine();

    }

    public void sendMessage(String message) {
        out.println(message);
    }

    public void close() throws IOException {
        serverSocket.close();
        clientSocket.close();
        out.close();
        in.close();
    }

    public static void main(String[] args) {
        MyServer myServer = new MyServer();
        try {
            myServer.start(3000);
        } catch (IOException e) {
            try {
                myServer.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
