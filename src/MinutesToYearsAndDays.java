public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(518400);
    }
    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");}

        else if(minutes==0){
            System.out.println(minutes+ " min = 0 y and 0 d ");

        }
        else {

            long days = minutes/(24*60);
            if(days<365)
            {
                System.out.println(minutes +" min = 0 y and " +days+" d");
            }else
            {
                long years = days/365;
                long remainingDays = days%365;
                System.out.println(minutes +" min = "+ years+" y and "+days+" d");
            }
        }
    }
}
