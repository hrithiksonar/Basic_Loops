import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a  number to check if it's Prime Or Not : ");
        int num=sc.nextInt();
        int counter=0;
        for(int i=1;i<=num;i++)
        {
          if((num%i)==0)
          {
            counter++;
          }
        }
        if(counter==2)
        {
          System.out.println(num+" is a Prime number");
        }
        else
        {
          System.out.println(num+" is not a Prime number");
        }
     }
}
