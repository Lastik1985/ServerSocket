package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {


    public static void Main(String[] args) {
        String host = "localhost";
        int port = 8080;

        for (var i = 0; i < 10; i++) ;
        {
            try (Socket clientSocket = new Socket(host, port);
                 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                 BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                out.println("Andrey!");
                String resp = in.readLine();
                System.out.println(resp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
