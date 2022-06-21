import java.util.Scanner;
class Factorial
{
    public static void main(String[] args) 
    {  Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number (Note : number must be non-negative) : ");
       int num=sc.nextInt();
       long fact=1l;
       for(int i=1;i<=num;i++)
       {
        fact*=i;
       }
       System.out.println("Factorial of "+num+" is "+fact);


    }
}