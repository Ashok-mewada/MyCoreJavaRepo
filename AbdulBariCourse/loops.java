/* 
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {  
         /* 
    int i=1;
    // practice of while and do while simply
    while(i<100)
    {
        System.out.println(i);
        i=i*2;
    }
    
    
    // same thing with do while loop
    int i=1;
    do{
        System.out.println(i);
        i=i*2;
    } 
while(i<100);

int i=1;
while(i<=10)
{
    System.out.println(i*2);
    i++;
}
// simple program of for loop

for(int i=1;i<=10;i++)
{
    System.out.println(i);
}

// Display multiplicaton table
int n;
System.out.println("Enter  number for table:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=10;i++)
{
    System.out.println(n +"*" + i +"="+ n*i);
}

// find sum of n natural numbers
int n;
System.out.println("Enter the number:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
    sum=sum+i;
}
System.out.println("Sum of "  + n + " number is " +sum);
*
// factorial of a number
System.out.println("Enter the numer for factorial:");
Scanner se=new Scanner(System.in);
int n=se.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
    fact=fact*i;
}
System.out.println("factorial of given number "+ n + " is "+ fact);
// Display digit
int num;
System.out.println("Enter the number :");
Scanner s=new Scanner(System.in);
num=s.nextInt();
int rim;
while(num>0)
{
 rim=num%10;
 System.out.println(rim);
 num=num/10;
}

//count digit of a number
int n;
System.out.println("Enter number for count digit:");
Scanner sc=new Scanner (System.in);
n=sc.nextInt();
int count=0;
while(n>0)
{
    n=n/10;
    count++;
}
System.out.println("digit of number is :" +count);

// Program for checking armstrong numbetr or not
int num,numm;
System.out.println("Enter number for checking armstrong number or not:");
Scanner sc=new Scanner (System.in);
num=sc.nextInt();
int digit;
int sum=0;
numm=num;
while(num>0)
{
    digit=num%10;
    num=num/10;
    sum=sum+digit*digit*digit;

}
if(numm==sum)
{
    System.out.println("Arm Strong number");
}
else{
    System.out.println("Not armstrong number");
}

// reverse a number(Method 1)
// it is not rigit because it is printing digits not a single number
int num;
System.out.println("Enter number for reverse it::");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
int digit;
System.out.println("reverse number is");

while(num>0)
{
    digit=num%10;
    num=num/10;
    System.out.print(digit);
}
*
// method 2 for reverse a number
int num;
System.out.println("Enter number for reverse it::");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
int digit;
int rev=0;

while(num>0)
{
    digit=num%10;
    num=num/10;
    rev=rev*10+digit;

}
System.out.println("Reverse of given number is:"+rev);

// check the number is [palindrome or not]
int num,numm;
System.out.println("Enter the number for checking palindrome or not");
Scanner sc=new Scanner (System.in);
num=sc.nextInt();
int digit,rev=0;
numm=num;
while(num>0)
{
    digit=num%10;
    num=num/10;
    rev=rev*10+digit;
}
if(numm==rev)
System.out.println("palindrome Number");
else 
System.out.println("Not palindromre number");

// Display a number in words even with tailing 0
System.out.println("Enter a number:");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

int digit; 
String str="";

while(num>0)
{
    digit=num%10;
    num=num/10;
    str=str+digit;
}
System.out.println(str);
int  c;
for(int i=str.length()-1;i>=0;i--)
{
    c=str.charAt(i);

    switch(c)
    {
        case '0':
        System.out.print("Zero ");
        break;
        case '1':
        System.out.print("one ");
        break;
        case '2':
        System.out.print("two " );
        break;
        case '3':
        System.out.print("three ");
        break;
        case '4':
        System.out.print("four ");
        break;
        case '5':
        System.out.print("five " );
        break;
        case '6':
        System.out.print("six ");
        break;
        case '7':
        System.out.print("seven ");
        break;
        case '8':
        System.out.print("eight ");
        break;
        case '9':
        System.out.print("nine ");
        break;
        
    
}
}

// Display ap series
int n,d,a=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter for printing Ap Series: ");
System.out.println("Enter Starting point:");
a=sc.nextInt();
System.out.println("Enter differece between elements:");
d=sc.nextInt();
System.out.println("Enter number till you want series:");
n=sc.nextInt();
int term=a;
for(int i=0;i<n;i++)
{
    System.out.print(term+",");
 term=term+d;
}

// Display geometric progression series[gp series]
int n,a,r;
System.out.println("Enter information for gp series:");
Scanner sc=new Scanner(System.in);
System.out.println("Enter Starting point:");
a=sc.nextInt();
System.out.println("Enter ratio between elements:");
r=sc.nextInt();
System.out.println("Enter number till you want gp series");
n=sc.nextInt();
int term=a;
for(int i=0;i<n;i++)
{
    System.out.print(term+",");
term=term*r;
}

// Display Fibonacci Series
int a=0,b=1,c;
System.out.println(":::::program to fibonacci series:::::");
System.out.println("Enter N for Fibonacci series:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.print(a+ ","+ b +",");
for(int i=0;i<n-2;i++)
{
c=a+b;
System.out. print(c+",");
a=b;
b=c;
}

//     ::::::: Nested Loops:::::::
// nested loop simple program
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print("( "+i+ ","+ j +" )");
    }
    System.out.println("");
}

// Pattern Student Challenge program
int count =0;
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=5;j++)
     {
        count ++;
        System.out.printf("%02d ", count);
     }
     System.out.println("");
}

for(int i=1;i<=5;i++)
{
    for(int j=1;j<=5;j++)
    {
        if(i<=j)
        {
            System.out.print("  ");
        }
        else 
        System.out.print(" * ");
    }
System.out.println(" ");
}
}
}
*/
/* 
x
xx
xxx
xxxx
*/
/* 
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {  

    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
*/
/* 
xxxx
xxx
xx
x
*/
/* 
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {  

    for(int i=1;i<=4;i++)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
*/
/* 
x
xx
xxx
xxxx
xxx
xx
x
*/
/* 
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {  

    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
     for(int i=1;i<=4;i++)
    {
        for(int j=3;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
*/
/* 
       x
      xx
     xxx
    xxxx
*/
/*
 import java.util.Scanner;

public class loops {
    public static void main(String[] args) {  

    for(int i=1;i<=4;i++)
    {
        for(int j=3;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
*/
/* 
xxxx
 xxx
  xx
   x
*/
/* 
 import java.util.Scanner;

public class loops {
    public static void main(String[] args) {  

    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(int k=4;k>=i;k--)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
*/
/* 
       x
      xx
     xxx
    xxxx
     xxx
      xx
       x
*/
/* 
 import java.util.Scanner;

public class loops {
    public static void main(String[] args) {  

    for(int i=1;i<=4;i++)
    {
        for(int j=3;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(int k=3;k>=i;k--)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
*/
/*
    x
   x x
  x x x
 x x x x
 */
/* 
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {  

    for(int i=1;i<=4;i++)
    {
        for(int j=3;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++)
        {
            System.out.print(" *");
        }
        System.out.println("");
    }
   
}
}
*/
/* 
// Pyramid
   x   
 x x x
x x x x x
*/