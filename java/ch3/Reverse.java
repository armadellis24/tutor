public class Reverse
{
    public static void main (String [] args)
    {
        String word= "Hello There";
        printReverse("");
    }

    public static void printReverse(String name)
    {
        String n = name;

        for (int i=n.length()-1; i>=0; i--)
        {
            System.out.print(n.charAt(i));
        }
    }
}
