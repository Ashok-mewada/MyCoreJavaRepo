/* 
import java.util.*;
import java.util.zip.ZipEntry;

import javax.annotation.processing.SupportedOptions;
public class pract {
    public static void main(String[] args) 
      {
       /* Write a Java program and compute the sum of the digits of an integer. Go to the editor
        Input Data:
        Input an integer: 25
        Expected Output
        
        The sum of the digits is: 7
        Click me to see the solution
        
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
       int  sum=0;
        while(num>0)
        {
          int digit=num%10;
          num=num/10;
         sum=sum+digit;
        }
        System.out.println(sum);
        */
      /*   34. Write a Java program to compute the area of a hexagon. Go to the editor
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938

double s,area ;
Scanner sc=new Scanner(System.in);
s=sc.nextDouble();
area=(6*s*s)/(4*Math.tan(Math.PI/6));
System.out.println("Area of Hexagon is:"+area);

35. Write a Java program to compute the area of a polygon. Go to the editor
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722

int n;
double side,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of sides");
n=sc.nextInt();
System.out.println("Enter length of a side");
side=sc.nextDouble();
area=(n*side*side)/(4*Math.tan(Math.PI/n));
System.out.println("Area of polygon"+area);

37. Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT

Scanner sc=new Scanner(System.in);
System.out.println("Enter String for reverse:");
char []c=sc.nextLine().toCharArray();
System.out.println(c);
for(int i=c.length-1;i>=0;i--)
{
  System.out.print(c[i]);
}

39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there. Go to the editor
Expected Output

123                                                      
124                                                      
...                                                                                               
431                                                      
432                                                      
Total number of the three-digit-number is 24

int count =0;
for(int i=1;i<=4;i++)
{
  for(int j=1;j<=4;j++)
  {
    for(int k=1;k<=4;k++)
    {
      if(k != i && k != j && i != j)
      {
       count++;
       System.out.print(i+""+j+""+k+" ");
      }
    }
  }
}
System.out.println("");
System.out.println(count);

41. Write a Java program to print the ascii value of a given character. Go to the editor
Expected Output

The ASCII value of Z is :90

System.out.println("Enter Synbol For Ascii value:");
Scanner sc=new Scanner(System.in);
int a=sc.next().charAt(0);
System.out.println(a);


}
    }

*/