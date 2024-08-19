package Multithreading;

public class MultiThreading {

    public static void main(String[] args) {
        
        Thread threadGenap = new Thread(new Runnable() {
            public void run() {
                for(int i=0;i<=10;i+=2) {
                    System.out.println("Genap: "+i);
                    try {
                        Thread.sleep(500); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        
        Thread threadGanjil = new Thread(new Runnable() {
            public void run() {
                for(int i=1;i<=10;i+=2) {
                    System.out.println("Ganjil: "+i);
                    try {
                        Thread.sleep(500); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        threadGenap.start();
        threadGanjil.start();
    }
}
