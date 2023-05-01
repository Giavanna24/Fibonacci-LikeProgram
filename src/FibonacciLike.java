public class FibonacciLike implements Fibonacci, Runnable {
    int amountofNumbersInSequence;
    int number1;
    int number2 ;

    String name;


    public FibonacciLike(String name, int amountofNumbersInSequence, int number1, int number2) {
       this.name = name;
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
    }

    public void run(){
        System.out.println(name+ number1);
        System.out.println(name+ number2);

        for(int Num = 0; Num < amountofNumbersInSequence - 2; Num++){
            int num3 = number1 + number2;
            System.out.println(name + num3);
            number1 = number2;
            number2 = num3;
            try {
                Thread.currentThread().sleep(0);
            } catch (Exception ex) {
                Thread.currentThread().interrupt();
            }

        }
        //System.out.println("Done");
    }
}
