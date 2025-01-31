public class SpeedConvertor {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
        printConversion(1.5);
        printConversion(0.0);

    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            double milesPerHour = (kilometersPerHour / 1.609);
            long number = Math.round(milesPerHour);
            return number;
        } else {
            return -1;
        }

    }

    public static void printConversion(double kilometersPerHour)
    {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {

            System.out.println(kilometersPerHour +"km/h = "+milesPerHour+ "mi/h ");
        }
    }

}
