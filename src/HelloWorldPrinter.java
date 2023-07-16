public class HelloWorldPrinter implements Runnable {

    public void run(){
        System.out.println("Hello World from thread : " + Thread.currentThread().getName());
    }
}
