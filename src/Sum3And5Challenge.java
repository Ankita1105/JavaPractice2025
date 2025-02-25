public class Sum3And5Challenge {

    public static void main(String[] args) {
        int num=0;
        int count=0;
        int sum=0;
        for(num=1;num<1000;num++)
        {
            if(num%3==0 && num%5==0)
            {
                count++;
                sum += num;

                System.out.println(num);
                System.out.println(sum);
            }
            if(count>=5){
                break;
            }

        }
    }
}
