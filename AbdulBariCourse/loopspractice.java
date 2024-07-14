import java.util.Scanner;

public class loopspractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
       int sum=0;
      while(n>0)
      {
        int digit=0;
        digit=n%10;
        n=n/10;
        sum=sum+(digit*digit*digit);
  
      }
      if(sum==n1)
      System.out.println("ArmStrong Number");
      
    else 
    System.out.println("no");
  System.out.println();
}
}