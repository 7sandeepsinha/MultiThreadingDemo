import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable {

    // call method can return any data type, for our usecase we are returning Integer
    public Integer call() throws InterruptedException {
        Thread.sleep(3000);
        Random random = new Random();
        Integer i = random.nextInt();
        System.out.println("Number generated : " + i + " on thread," + Thread.currentThread().getName());
        return i;
    }
}
