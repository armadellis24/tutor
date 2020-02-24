public class Triangle
{
    public static void main (String [] args)
    {
        double length1= 8;
        double length2= 5.2;
        double length3= 7.1;
        double area = triangleArea(length1, length2, length3);
        System.out.println(area);
    }

    public static double triangleArea(double a, double b, double c)

    {
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
