package org.example;

 class Multi extends Thread {
     public void run(){
         System.out.println("GOD IS THE GREATEST");

     }

     public static void main(String[] args) {
         Multi t1 = new Multi();
         t1.start();
     }

    }

