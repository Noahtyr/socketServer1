package com.company;

import	java.io.*;
import	java.net.*;
import	java.util.Scanner;

public class clientConnection implements Runnable {

   private Socket s;

   public ClientConnection(Socket s) throws SocketException, IOException {

       this.s=s;
   }

   @Override
    public void run() {

       try {

           try {
               InputStream input = s.getInputStream();
               OutputStream output = s.getOutputStream();

               Scanner in = new Scanner(input);

               PrintWriter out = new PrintWriter(output,true);

               out.println("Welcome Online!");

               boolean done = false;
               while(!done && in.hasNextLine()) {
                   String stream = in.nextLine();
                   if(stream.equals("Luk ned")) {
                       done = true;
                   }
                   else {
                       out.println(Stream);
                   }
               }


           }

           finally {
               s.close();
           }



       }
             catch(Exception e) {
           e.printStackTrace();

             }
   }


}
