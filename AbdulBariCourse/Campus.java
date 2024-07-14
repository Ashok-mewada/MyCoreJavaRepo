import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
// 100 must Questions for placements
/* 
// 1st question
public class Campus {
    public static void main(String[] args) {
        char c;
        System.out.println("Enetr A alphabet");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        if(c>='a'&&c<='z'||c>='A'&&c<='Z')
        {
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not A Alphabet");
        }
        
    }
}
*/
// 2nd question
/* 
public class Campus {
    public static void main(String[] args) {
        char c;
        System.out.println("Enter A alphabet");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            System.out.println("Vowel");
        }
        else if(!(c>='a'&&c<='z'||c>='A'&&c<='Z'))
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Consonent");
        }
        
    }
}
*/
// 3rd Question
/* 
public class Campus {
     public static void main(String[] args) {
      float rad;
        System.out.println("Enter radius of circle");
        Scanner sc=new Scanner(System.in);
        rad=sc.nextFloat();
        System.out.println("Area of circle is:"+(3.14*rad*rad));
        
    }
}
*/
// 4th question
/* 
//Area of Triangle
public class Campus
 {
    public static void main(String[] args) 
    {
     float len,bre;
       System.out.println("Enter Length and Breadth of Rectangle");
       Scanner sc=new Scanner(System.in);
       len=sc.nextFloat();
       bre=sc.nextFloat();
       System.out.println("Area of Rectangle is:"+ (len*bre));
       
    }
}
*/
// 5th question
/* 
// Area of Triangle
public class Campus
 {
    public static void main(String[] args) 
    {
     float base,height;
       System.out.println("Enter base and height of TRIANGLE");
       Scanner sc=new Scanner(System.in);
       base=sc.nextFloat();
       height=sc.nextFloat();
       System.out.println("Area of Rectangle is:"+ (base*height)/2);
       
    }
}
*/
// 6th question
//No of Handshakes
/* 
public class Campus
 {
    public static void main(String[] args) 
    {
     int person,Handshakes;
       System.out.println("Enter of Persons in room ");
       Scanner sc=new Scanner(System.in);
       person=sc.nextInt();
       Handshakes=person*(person-1)/2;
       System.out.println("No of Handshakes is:"+ Handshakes);
       
    }
}
*/
// 7th Question
/* 
//WAp to find double of the given number without using arithmetic operators
public class Campus
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int n=sc.nextInt();
        n=n<<1;
        System.out.println("double of number is:"+n);
    }
}
*/
// 8th Question
/* 
//ASCII value of the character
public class Campus
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character for ASCII value");
        char c=sc.next().charAt(0);
        int i=c;
        System.out.println("ASCII value of given Character is:"+i);
    }
}
*/
/* 
// 9th Question
// Identify given number is positive or not
public class Campus
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int n=sc.nextInt();
        if(n>0)
        {
        System.out.println("NUmber is positive");
        }
        else 
        System.out.println("Number is negative");
    }
}
*/
// 10th Question
/* 
// Number is even or odd
public class Campus
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int n=sc.nextInt();
        if(n%2==0)
        {
        System.out.println("Even");
        }
        else 
        System.out.println("Odd");
    }
}
*/
// Question no.11
/* 
// WAP to find the Quardants in which coordinates lie
public class Campus
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers for checking Quardants");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
       if(n1>0&&n2>0)
       System.out.println("1 st Quardant");
       else  if(n1<0&&n2>0)
       System.out.println("2nd Quardant");
       else  if(n1<0&&n2<0)
       System.out.println("3rd Quardant");
       else if(n1>0&&n2<0)
       System.out.println("4th Quardant");
       else if(n1==0&&n2==0)
       System.out.println("Point lies in origin");
       
    }
}
*/
//Question no.12
/* 
//WAP to find number of days in a given month of a given year.
public class Campus
{
    public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year ");
        System.out.println("Enter Month");
        int year=sc.nextInt();
        int month=sc.nextInt();
       if(year%400==0 && month==2||year%100!=0&&month==2&&year%4==0)
       {
        System.out.println("29 Days");
       }
       else if(month==2)
       {
        System.out.println("28 Days");
       }
       else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
       System.out.println("31 days");
       else if(month==4||month==6||month==9||month==11)
       System.out.println("30 days");
    }
}
*/
// Question no.13
/* 
// Wap to find roots of quadratic EQUATION
public class Campus
{
    public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entr values of a,b &c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Root 1 of Quardantic Equation is:"+((-b)+Math.sqrt(b*b-4*a*c)/2*a));
        System.out.println("Root 2 of Quardantic Equation is:"+((-b)-Math.sqrt(b*b-4*a*c)/2*a)); 
    }
}
*/
//Question No.14
/* 
// WAP to find Number of Digits in an Integer
public class Campus{
    public static void main(String[] args) {
        System.out.println("Enter number for Checking digits");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count =0;
        while(num>0)
        {
            num=num/10;
            count ++;
        }
        System.out.println("No of Digits are:"+count);
    }
}
*/
// question no .15
/*
// Wap to find Factorial of Given Number
public class Campus{
    public static void main(String[] args) {
        System.out.println("Enter number for factorial");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is:"+fact);
    }
}
*/
// question no .16
/* 
// Wap to find Fibonacci series up to n
public class Campus{
    public static void main(String[] args) {
        System.out.println("Enter number for fibonacci series");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+","+b+",");
       for(int i=1;i<=num;i++)
       {
        
        int c=a+b;
        a=b;
        b=c;
      System.out.print(c+",");
       }
    }
}
*/
// question no .17
/* 
//WAP to find sum of digits of A number
public class Campus{
    public static void main(String[] args) {
        System.out.println("Enter number for sum of digits");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0)
        {   
            int digit=num%10;
            num=num/10;
            sum=sum+digit;
        }
        System.out.println("Sum of Digit :"+sum);
    }
}
*/
// question no .18
/* 
//WAP to find sum of Numbers in a given range
public class Campus{
    public static void main(String[] args) {
        System.out.println("Enter two numbers ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();
        int sum=0;
        for(int i=num;i<=num2;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum in given range :"+sum);
    }
}
*/
// question no .19
/* 
//WAP to reverse a giveb number
public class Campus{
    public static void main(String[] args) {
        System.out.println("Enter number for reverse");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reverse=0;
        while(num>0)
        {   
            int digit=num%10;
            num=num/10;
            reverse=reverse*10+digit;
        }
        System.out.println("Reverse :"+reverse);
    }
}
*/
// question no .20
/* 
//WAP to find LCM of two numbers
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Two numbers for LCM");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int lcm=1;
        int max=(num1>num2)?num1:num2;
        for(int i=max;i<=num1*num2;i++)
        {
            if(i%num1==0&&i%num2==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
/* 
// question no .21

//WAP to CHECK STRONG NUMBER numbers
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Number for Checking Strong Number or Not");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int fact=1;
        int digit;
        int sum=0;
        int c=0;
       while(num2>0)
       {
       fact=1;
        digit=num2%10;
      
        for(int i=1;i<=digit;i++)
        {
            fact=fact*i;
            sum=sum+fact;
            num2=num2/10;
        
        }    
       }
       if(sum==num)
       System.out.println("Number is Strong Number");
       else 
       System.out.println("Not a Strong Number");
    }
}
*/
/* 
// question no .22

//WAP to identify number is perfect Number or not
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Number for Checking Perfect Number or not");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=num;
        int sum=0;
        
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
              sum=sum+i;
            }
        }
        if(num1==sum)
        {
            System.out.println("NUmber is Perfect Number");
        }
        else 
        System.out.println("Not Perfect Number");
    }
}
*/
/* 
// question no .23

//WAP to find Power of a NUmber
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Number for Power of the Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Enter Exponentional");
        int exp=sc.nextInt();
        int result=1;
        while(exp>0)
        {
            result=result*num;
   
            exp--;
        }
        System.out.println("Result is:"+result);

       // int pow=sc.nextInt();
       // System.out.println("Answer is:"+Math.pow(num, pow)); //Another direct 
    }
}
*/
/* 
// question no .24
//WAP to find factors of given Number
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Number for Checking Perfect Number or not");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+",");
            }
        }
    }
}
*/
/* 
// question no .25
// i have to solve this Question
//WAP to add two fractions
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Number for factors");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+",");
            }
        }
    }
}
*/
/* 
// question no .26
//WAP to identify number is armstrong or not
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Number for checking armstrong or not");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int sum=0;
        while(num>0)
        {
            int digit=0;
            digit=num%10;
            num=num/10;
            sum=sum+(digit*digit*digit);
        }
        if(num2==sum)
        System.out.println("ArmStrong Number");
        else 
        System.out.println("Not A ArmStrong Number");
    }
}
*/
/* 
// question no .27
//WAP to identify number is prime or not
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Number for checking Prime:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num<=0)
        System.out.println("Not a prime number");
        else 
        {
        for(int i=2;i<num;i++)
         {
          if(num%i==0)
          {
          System.out.println("Not a Prime Number");
          return ;
          }
         }
         System.out.println("Prime Number");
        }
    }
}
*/
/* 
// question no .28
//WAP to identify number is palindrome or not
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Number for checking Palindrome:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int reverse=0;
        while(num>0)
        {
            int digit=1;
            digit=num%10;
            num=num/10;
            reverse=reverse*10+digit;
        }
        if(num2==reverse)
        System.out.println("Palindrome Number");
        else 
        System.out.println("Not a Palindrome Number");
       
    }
}
*/
/* 
// question no .29
//WAP to print prime number in a given range
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Numbers in range:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();
        int flag=0;
        for(int i=num;i<num2;i++)
        {
            for(int j=2;j<i;j++)
            {
            if(i%j==0)
            {
              flag=0;
              break ;
            }
            else 
            flag=1;
            }
            if(flag==1)
            {
                System.out.print(i+",");
            }
        }
    }
}
*/
 
// question no .30
//WAP to print prime number in a given range
public class Campus{ 
    public static void main(String[] args) {
        System.out.println("Enter Numbers in range:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();
        int flag=0;
        for(int i=num;i<num2;i++)
        {
            for(int j=2;j<i;j++)
            {
            if(i%j==0)
            {
              flag=0;
              break ;
            }
            else 
              flag=1;
            }
            if(flag==1)
            {
                System.out.print(i+",");
            }
        }
    }
}






















