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

   }


}
