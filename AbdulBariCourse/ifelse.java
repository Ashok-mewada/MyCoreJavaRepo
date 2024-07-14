
import java.util.*;
class ifelse
{
    public static void main(String[] args) {
       // int a=12,b=32,c=54;
//  System.out.println(a>b);
 /* 
 //    The grestest number among 3 numbers
     
 if (a>b&&a>c)
  {
    System.out.println("a is the greatest number"+a);
  }
  else if (b>c)

  {
    System.out.println("b is the greatest number");
  }
else{

 System.out.println(" c is the greatest number");
}

 // Program for odd and even number
int num;
System.out.println("Enter number for check the number is even or odd");
Scanner  sc=new Scanner (System.in);
num=sc.nextInt();
if (num%2==0)
{
    System.out.println("the given number is even");
}
else{
    System.out.println("the given number is odd");
    

//
//TO find the person is young or not
int age;
System.out.println("enter the age of the person");
Scanner s=new Scanner (System.in);
age=s.nextInt();
if (age>=14&&age<=50)
{
  System.out.println("the person is young");
}
else 
{
  System.out.println("the person is not young");
}

// find the grades of the student
int m1,m2,m3;
float average;
System.out.println("Enter the marks of the subjects");
Scanner sa=new Scanner (System.in);
m1=sa.nextInt();
m2=sa.nextInt();
m3=sa.nextInt();
average= (float)(m1+m2+m3)/3;
if (average>=70)
{
System.out.println("Grade 'A");
}
else if(average>=60 && average<=70)
{
  System.out.println("Grade 'B");
}
else if (average>=50 && average<=60)
{
  System.out.println("Grade'C");
}
else if (average >=40 && average<=50)
{
  System.out.println("Grade 'D");
}
else 
{
  System.out.println("YOU are FAIL");
}

// radix of a number given in a string
String num;
System.out.println("Enter the number:");
Scanner sb=new Scanner (System.in);
num=sb.nextLine();
if (num<=)


// Program for checking leap year or not
int year;
System.out.println("Enter the year:");
Scanner sff=new Scanner (System.in);
year=sff.nextInt(); 
if(year%4==0)
{
  if(year%100==0)
  {
    if(year%400==0)
    {
     System.out.println("it,s a leap year");
    }
    else 
    {
      System.out.println("it,s not a leap year");
    }
    
  }
    else 
   {
      System.out.println("it's a leap year");
   }

}
  else 
    {
      System.out.println("it's not a leap year");
   }

   
      // Display name of a day based on number
int num;
System.out.println("Enter number for check the day ");
Scanner se=new Scanner (System.in);
num=se.nextInt();
if(num==1)
{
  System.out.println("Monday");
}
else if (num==2)
{
  System.out.println("Tuesday");
}

else if(num==3)
{
  System.out.println("Wednesday");
}
else if (num==4)
{
  System.out.println("Thursday");
}
else if(num==5)
{
  System.out.println("Friday");
}
else if(num==6)
{
  System.out.println("Saturday");
}
else if (num==7)
{
System.out.println("Sunday");
}
else 
{
  System.out.println("invalid day number");
}
*/
// Find A website and the protocol used
  String website;
  System.out.println("Enter a url:");
  Scanner sg=new Scanner(System.in);
  website=sg.nextLine();
  String protocol=website.substring(0, website.indexOf(":"));
  if(protocol.equals("http"))
  System.out.println("Hypertext Transfer Protocol");
  else if(protocol.equals("ftp"))
  System.out.println("File Transfer Protocol");
  else if (protocol.equals("https"))
  System.out.println("hypertext transfer protocol secure");

  String ext=website.substring(website.lastIndexOf(".")+1);
  if(ext.equals("com"))
  System.out.println("commercial");
  else if(ext.equals("org"))
  System.out.println("organization");
  else if(ext.equals("net"))
  System.out.println("network");


    }
}
   