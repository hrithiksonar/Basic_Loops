import java.util.Scanner;
public class FibonacciSeries
{
  public static void main(String[] args)
  {
        int terms,prev=0,next=1,temp,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms upto which fibonacci series will print : ");
        terms=sc.nextInt();
        while(i<=terms)
        {
          System.out.print(prev+" ");
          temp=prev;
          prev=next;
          next=temp+prev;
          i++;
        }
        System.out.println();
  }
}
