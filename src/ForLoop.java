public class ForLoop {

    public static void main(String[] args) {
        System.out.println("10,000 interest at 2% is " + calculateInterest(10000, 2));

        double rate = 2.2;
        for (rate = 2.0; rate <= 5; rate++) {
            double interestAmount = calculateInterest(10000, rate);
            System.out.println(interestAmount);
        }

        for (double i = 7.5; i <=10.0 ; i+=0.25){
            double interestAmount = calculateInterest(100.00, i);
            if(interestAmount > 9){
                break;
            }
        System.out.println("100 $ interest rate at " + i + " = $ "+ interestAmount);}
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }

}

