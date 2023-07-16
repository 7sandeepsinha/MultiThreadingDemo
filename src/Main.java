import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println("Hello world in main class from thread : " + Thread.currentThread().getName());
//        HelloWorldPrinter hwp = new HelloWorldPrinter();
//        Thread t1 = new Thread(hwp);
//        t1.start(); // creates a new thread and calls run() on thread
//
//        Thread t2 = new Thread(hwp);
//        t2.start(); // creates a new thread and calls run() on thread
//
//        t1.run(); // runs on the current thread
//        t2.run(); // runs on the current thread
//
//        for(int i=1;i<=100;i++){ // total threads created - 100
//            NumberPrinter np = new NumberPrinter(i);
//            Thread t = new Thread(np);
//            t.start();
//        }

        // total threads created - 10
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for(int i=1;i<=100;i++){
//            if(i == 11 || i == 50 || i == 100){
//                System.out.println("Debug");
//            }
//            NumberPrinter np = new NumberPrinter(i);
//            executorService.submit(np);
//        }
        // to do -> check the delay when numbers of thread is 1, 2, and 5
        ExecutorService executors = Executors.newFixedThreadPool(2);
        RandomNumberGenerator generator1 = new RandomNumberGenerator();
        RandomNumberGenerator generator2 = new RandomNumberGenerator();

        Future<Integer> randomNumber1 = executors.submit(generator1);
        Future<Integer> randomNumber2 = executors.submit(generator2);
        System.out.println("Hello World");
        System.out.println("SUM : " + (randomNumber1.get() + randomNumber2.get()));
        //some code here
    }
}

// get() method is called a blocking operation -> blocks the progress until it does not get the value