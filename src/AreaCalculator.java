public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
    public static double area(double radius)
    {
        if(radius>0){
        double calculateAreaOfCircle = 3.1416 * (radius*radius);
        return calculateAreaOfCircle;}
        else {
            return -1.0;
        }
    }

    public static double area(double x , double y)
    {
        if(x>0 && y>0)
        {
            double calculateTriangleArea = (x*y);
            return calculateTriangleArea;
        }
        else
        {
            return -1.0;
        }
    }
}
