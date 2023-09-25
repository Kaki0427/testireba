package Sockets.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(int port, String ip) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void sendMessage(String message) throws IOException {
        out.println(message);
    }

    public String receiveMessage() throws IOException {
        return in.readLine();
    }

    public void close() throws IOException {
        clientSocket.close();
        out.close();
        in.close();
    }

    public static void main(String[] args) {
        MyClient myClient = new MyClient();
        Scanner scanner = new Scanner(System.in);

        try {
            myClient.startConnection(3000, "127.0.0.1");
            System.out.println("Connected to server.");

            Thread receiveThread = new Thread(() -> {
                try {
                    while (true) {
                        String receivedMessage = myClient.receiveMessage();
                        System.out.println("Server: " + receivedMessage);
                    }
                } catch (IOException e) {
                }
            });
            receiveThread.start();


            while (true) {
                String input = scanner.nextLine();
                myClient.sendMessage(input);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
