public class presents
{
    public static void main (String [] args)
    {
       totalPresents(5); 
    }

    public static void totalPresents(int days)
    {
        int gifts =1;
        int total = 0;
        for (int i=1; i<=days; i++)
        {
            total+=gifts;
            System.out.println(total);

            gifts++;            
        }
    }
}
