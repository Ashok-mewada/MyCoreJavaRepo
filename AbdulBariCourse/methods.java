/* 
import java.util.*;
public class methods {
/* 
// Lecture 90 Simple create method without Static
 int max(int x,int y)
    {
     if(x>y)
     return x;
     else 
     return y;
    }
    public static void main(String[] args) {
    int a=13,b=10;
      methods sc=new methods();
      System.out.println(sc.max(a,b));
    }
      

      // Lecture 90 Simple create method with Static
      static int inc(int x)
      {
        // here the value of x will incremented because x is formal argument not the actual argument
        x++;
        System.out.println(x);
        return x;
      } 
public static void main(String[] args) {
    int a=10;
    inc(a);
    System.out.println(a);
    

    }
    // Lecture 92...Practicing Object Passing
public static void main(String[] args) {
    int A[]={12,43,22,14,23};
    newarray(A,3,88);
    for(int x:A)
    {
        System.out.print(x+",");
    }
}
static void newarray(int A[],int index,int value)
{
    A[index]=value;
}

    // Lecture 92...Practicing Object Passing
    public static void main(String[] args) {
        String str="ashok@gmail.com";
       System.out.println(username(str));
    }
   static String username(String str)
    {
     int a=str.indexOf('@');
     String s=str.substring(0, a);
     return  s;
    }
    
// Lecture 94...[Student Challange]
// Program 1....Find A number is prime
public static void main(String[] args) {
    System.out.println("Enter number for Checking prime or not:");
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
   System.out.println(isprime(n));
}
static boolean isprime(int a)
{
for(int i=2;i<a/2;i++)
{
    if(a%i==0)
    return false;
                  }
                  return true;
                }

// Lecture 94 .....[Student challange]
// program 2.......find GCD(HCF) of 2 Numbers
public static void main(String[] args) {
    System.out.println("Enter two numbers for GCD:");
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println(gcd(m,n));
}
static int gcd(int a,int b)
{
    while(a!=b)
    {
        if(a>b)
        a=a-b;
        
        else if(a<b)
            b=b-a;
        
    }
    
    return a;
}
//  lecture 94
// Program 3......Find max element in array
public static void main(String[] args) {
    int A[]={12,32,11,88,33,44};
    System.out.println(max(A));
}
static int max(int A[])

{
    int a=A[0];
    for(int i=1;i<A.length;i++)
    {
        if(a<A[i])
        {
        a=A[i];
    }
}
return a;
}

// Lecture 97 Practising Method Overloading
public static void main(String[] args) {
    System.out.println(max(50.22f,33.4f));
    System.out.println(max(12,5));

}
static int max(int x,int y)
{
    return x>y?x:y;
}
static float max(float x,float y)
{
    return x>y?x:y;
}
*
// Lecture 97 [Student Cahllange]
// Program 1...... Overloaded method to calculate Area
public static void main(String[] args) {

System.out.println(area(5,6));
System.out.println(area(6));
}
static double area(double l,double b)
{
    double area=l*b;
    return area;
}
static double area(double rad)
{
    double area=Math.PI*rad*rad;
    return area;
}

// Lecture 97 [Student Cahllange]
// Program 2.....Overloaded MEthod to reverse a int or array
public static void main(String[] args) {
    System.out.print(reverse(123));
    System.out.println("");
    int A[]={12,32,32,44,16,18,32};
    reverse(A);
}
static int reverse(int n)
{
    int   n1;
    int rev=0;
    while(n>0)
    {
       n1=n%10;
        n=n/10;
        rev=rev*10+n1;
       
    }
    return rev;
}
static void reverse(int A[])
{
for(int i=A.length-1;i>=0;i--)
{
   System.out.print(A[i]+",");
}
}

// Lecture 97 [Student Cahllange]
// Program 3.....Overloaded MEthod to Validate name and age
public static void main(String[] args) {
    validate(15);
    System.out.println(validate("Ashok"));
    System.out.println(validate(13));
    
}
static boolean validate(String str)
{
    return str.matches("[a-zA-Z\\s]+");
}
static boolean validate(int age)
{
    if(age<15)
    return true;
    else 
    return false;
}

// Lecture 99 Practising on Variable Arguments
public static void main(String[] args) {
    show(12,123,322,121);
}
static void show(int ...A)
{
    for(int x:A)
    {
        System.out.println(x);
    }
}  

public static void main(String[] args) {
    show("Ashok","kuldeep","Bharat","Ashish");
}
static void show(String ...A)
{
    for(String x:A)
    {
        System.out.println(x);
    }
}  

public static void main(String[] args) {
    show(5,"Ashok","kuldeep","Bharat","Ashish");
}
static void show(int n,String ...A)
{
    for(String x:A)
    {
        System.out.println(n+"."+" "+x);
        n++;
    }
}  

// In variable Argument we can also pass array
// in below example this is anonymous array
public static void main(String[] args) {
    show( new int [] {12,12,32,12,12});
}
static void show(int  ...A)
{
    for(int x:A)
    {
        System.out.println(x);
    }
}  

// Lecture 100 [Student Challange]
// program 1......Maximum of Numbers using variable arguments
public static void main(String[] args) {
   
    System.out.println( max(12,32,12,88,45));
    System.out.println( max(12));
    System.out.println( max(3,9));
    System.out.println( max(13,88,32,89));

}
static int max(int ...A)
{
    if(A.length==0)return Integer.MIN_VALUE;
    int m=A[0];
    for(int i=1;i<A.length;i++)
    {
        if(A[i]>m)
    m=A[i];
    }
    return m;
}

// Lecture 100 [Student Challange]
// program 2......Sum of all elements using varargs
public static void main(String[] args) {
    System.out.println(sum(10,29,21,13,15,2));
    System.out.println(sum(10,2,3,2));
    System.out.println(sum(3424,2));
    System.out.println(sum(10,29));
}
static int sum(int ...A)
{
    int summ=0;
    for(int i=0;i<A.length;i++)
    {
      summ=summ+A[i];
    }
    return summ;
}
    System.out.println
    (discount(1234));
    System.out.println(discount(50));

}
static double discount(double...price)
{
    double sum=0;
    for(int i=0;i<price.length;i++)
    {
        sum=sum+price[i];
    }
    if(sum<=500)
    {
    sum=sum*10/100;
    return sum;
       }
          else if(sum<1000&&sum>500)
          {
    sum=sum*20/100;
    return sum;
          }
   else if(sum<1500&&sum>1000)
   { sum=sum*30/100;
    return sum;
   }
   
   else return 0;
}

// Lecture 103 Recursion             
public static void main(String[] args) {
    fun(3);
}
static void fun(int n)
{
    if(n>0)
    {
        System.out.println(n);
        fun(n-1);
    }
}

}


*/






























































