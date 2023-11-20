package org.example;

 class Multi3 implements Runnable {
     public void run(){
         System.out.println("I WILL BE A SUCCESS STORY");

     }

     public static void main(String[] args) {
         Multi3 m1 = new Multi3();
         Thread T1 = new Thread(m1);
         T1.start();
     }
}
