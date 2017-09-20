package com.company.singlethread;
import	java.io.*;
import	java.net.ServerSocket;
import	java.net.Socket;
import	java.util.Scanner;




  class Server {

        public static void main(String[]	args) {
            ServerSocket ss;

            try {
                 ss	= new ServerSocket(8001);
                System.out.println("Server is running...");
                while(true) {
                    Socket  s	=	ss.accept();
                    System.out.println("Klient	forbundet.");

                    InputStream	input =	s.getInputStream();
                    OutputStream output	= s.getOutputStream();


                    Scanner	in = new Scanner(input);


                    PrintWriter	out	= new PrintWriter(output,	true);


                    out.println("Welcome!");


                    boolean	done = false;
                    while (!done	&&	in.hasNextLine()) {

                        String	stream	= in.nextLine();
                        if	(stream.equals("close")) {
                            done = true;
                        }
                        else {
                            out.println(stream);
                        }
                    }

                    s.close();
                    System.out.println("Connection to client closed...");
                }
            }
            catch	(IOException	ex) {


                ex.printStackTrace();
            }
        }
    }



