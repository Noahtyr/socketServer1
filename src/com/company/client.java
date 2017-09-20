package com.company;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {


    public static void main(String[]args) throws IOException {
        try {

            Socket s = new Socket("127.0.0.1", 8001);

            while(true) {
                InputStream input = s.getInputStream();
                OutputStream output = s.getOutputStream();

                Scanner in = new Scanner(input);

                PrintWriter out = new PrintWriter(output,true);

                String welcome = in.nextLine();
                System.out.println(welcome);

                out.println("Første besked");
                System.out.println(in.nextLine());

                out.println("Anden besked");
                System.out.println(in.nextLine());

                out.println("Tredie besked");
                System.out.println(in.nextLine());

                s.close();
                System.out.println("Connection Lost...");


            }


        }
        catch (IOException ex) {

        }

    }
}

