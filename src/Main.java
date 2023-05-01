public class Main {
    public static void main(String[] args) {
        boolean useManyThreads = true;

        System.out.println("Hello world!");
        FibonacciLike WEEEEEE = new FibonacciLike("Sequence 1: ", 5, 0, 1);
        FibonacciLike WEEEEEE2 = new FibonacciLike("Sequence 2: ",5, 2, 7);

        if (useManyThreads) {
            Thread  NumLaunchingThread = new Thread(WEEEEEE);
            Thread Num2LaunchingThread = new Thread(WEEEEEE2);
            NumLaunchingThread.start();
            Num2LaunchingThread.start();
        } else {
            WEEEEEE.run();
            WEEEEEE2.run();
        }
    }
}