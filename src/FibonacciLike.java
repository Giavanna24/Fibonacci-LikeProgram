public class FibonacciLike implements Fibonacci, Runnable {
    int amountofNumbersInSequence;
    int number1;
    int number2 ;


    public FibonacciLike(int amountofNumbersInSequence, int number1, int number2) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
    }

    public void run(){
        for(int Num = number1; Num < amountofNumbersInSequence; Num++){
            int num3 = number1 + number2;
            System.out.println(num3);
            number1 = number2;
            number2 = num3;

            //System.out.println(Num);
        }
    }
}
