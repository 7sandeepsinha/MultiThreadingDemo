public class NumberPrinter implements Runnable {
    private int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    public void run(){
        System.out.println("Number printer : " + number +
                " on thread " + Thread.currentThread().getName());
    }
}
