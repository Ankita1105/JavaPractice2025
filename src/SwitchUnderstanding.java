public class SwitchUnderstanding {

    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(10);



//        int switchValue = 1;
//        switch (switchValue) {
//            case 1 -> System.out.println("Value is 1");
//            case 2 -> System.out.println("Value is 2");
//            case 3 -> System.out.println("Value is 3");
//            default -> System.out.println("Default Value");
    }

        public static void printDayOfWeek(int day)
        {
            String dayOfWeek = switch (day) {
                case 0 -> {yield "Sunday";}
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";

                default -> "invalid day";
            };

            System.out.println(day + " stands for " + dayOfWeek);
        }


}
