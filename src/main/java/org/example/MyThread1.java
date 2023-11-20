package org.example;

public class MyThread1 {
    public static void main(String[] args) {
        Thread m = new Thread("My first thread");
        m.start();
        String str = m.getName();
        System.out.println(str);
    }
}
