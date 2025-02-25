public class PrimeNumberChallenge {

    public static void main(String[] args) {
        System.out.println( isPrimeNumber(1));
      printPrimeNumbers();
    }

    public static boolean isPrimeNumber(int wholeNumber){
        if(wholeNumber<=2)
        {
            return (wholeNumber==2);
        }
        for(int divisor=2;divisor<=wholeNumber/2;divisor++)
        {
            if(wholeNumber%divisor==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers()
    {
        int counter = 0;
        for(int n = 0 ; n <=1000 ;n++){
        if(isPrimeNumber(n))
        {
            counter++;
            System.out.println(n);
            if(counter>=3)
            {
            break;
            }
        }
        }

    }
}
