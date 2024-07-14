
import java.net.SocketPermission;
import java.util.*;
public class arrayoneD {
    private static final int i = 0;
    public static void main(String[] args) {
        
        /*int A[]=new int[5];
        int B[]={2,4,6,5,4};
        int C[];
        C=new int [10];
        B[2]=15;
        /
     for(int i=0;i<B.length;i++)
     {
        System.out.println(B[i]);
     }
     
    // for each loop used for accesing the element of the array
   
    for(int x:B)
    {
        System.out.println(x);
    }
     // for each is only used for reading the element we cannot modify the value with help of x
    for(int x:B)
    {
        System.out.println(x++);
    }
    
    // we can modify the value with the help of for loop
    for(int i=0;i<B.length;i++)
     {
        System.out.println(B[i]++);
     }
     for(int x:B)
    {
        System.out.println(x);
    }

// Finding Sum of all elements of a array
int A[]={2,4,5,3,8};
int sum=0;
for(int i=0;i<A.length;i++)
{
    sum=sum+A[i];
}
System.out.println(sum);

// Searching an element in the array
int A[]={12,9,32,65,8};
System.out.println("Enter Element for Search::Key Element");
Scanner sc=new Scanner (System.in);
int key=sc.nextInt();
for(int i=0;i<A.length;i++)
{
if(key==A[i])
{
    System.out.println("ELEMENT FOUND AT INDEX NUMBER:"+i);
    System.exit(0);
}
} 
System.out.println(" Element Not Found");

// Finding Maximum Element of the Array
int A[]={12,75,43,22,4};
int max=A[0];
for(int i=0;i<A.length;i++)
{
    if(A[i]>max)
    {
        max=A[i];
    }
}
System.out.println("Maximum element in array is:"+max);

// Finding Second Largest Element
int A[]={12,54,3,76,43};
int max1,max2;
max1=max2=A[0];
for(int i=0;i<A.length;i++)
{
    if(A[i]>max1)
    {
        max2=max1;
        max1=A[i];
        
    }
    else if(A[i]>max2)
    {
      max2=A[i];
    }
}
System.out.println("Second maximum value in array are:"+max2);
*/
// Lecture 84 [Student Challenge]
// 1......Program - Rotating An Array
/* 
int A[]={12,3,65,73,23,43,54,33,44,88};
int temp=A[0];
for(int x:A)
{
    System.out.print(x+",");
    
}
System.out.println("");
for(int i=1;i<A.length;i++)
{
  A[i-1]=A[i];
}
A[A.length-1]=temp;
for(int x:A)
{
    System.out.print(x+",");
}

// Rotating Array from right side
int A[]={12,3,65,73,23,43,54,33,44,88};
int temp=A[A.length-1];
for(int x:A)
{
System.out.print(x +",");
}
System.out.println(" ");
for(int i = A.length-1 ;i>0 ;i--)
{
    A[i]=A[i-1];
}
A[0]=temp;
for(int x:A)
{
    System.out.print(x+",");
}

// Lecture 84[Student Challenge]
// 2.......Inserting an Element
int A[]=new int [10];
A [0]=12;
A [1]=32;
A[2]=43;
A[3]=65;
A[4]=21;
int n=5;
int index=2;
int x=15;
for(int i=0;i<n;i++)
{
    System.out.print(A[i]+",");  
}
System.out.println(" ");

for(int i=n;i>index;i--){
    A[i]=A[i-1];
}
A[index]=x;
for(int i=0;i<n;i++)
{
    System.out.print(A[i]+",");
}

// Lecture 84[Student Challenge]
// 3.......Deleting an Element
int[] A={21,12,43,65,7,9,11,12};
int index=2;
for(int x:A)
{
    System.out.print(x+",");
}
System.out.println("");
for(int i=index;i<A.length-1;i++)
{
A[i]=A[i+1];
}
for(int x:A)
System.out.print(x+",");

// Lecture 85 [Student Challange]
// Program1...Copying an Array
int A[]={12,53,7,9,43,48,32};
int B[]=new int[7];
for(int x:A)
{
    System.out.print(x+",");
}
System.out.println("");
for(int i=0;i<A.length;i++)
{
    B[i]=A[i];
}
for(int y:B)
{
    System.out.print(y+",");
}
// Lecture 85[Student Challange]
// program 2......reverse copying an array
int A[]={12,53,87,45,7,9,43};
int B[]=new int[7];
for(int x:A)
System.out.print(x+",");
System.out.println("");
for(int i=A.length-1,j=0;i>=0;i--,j++)
{
    B[j]=A[i];
}
for(int y:B)
{
    System.out.print(y+",");
}
*/
// Lecture 85 [Student Challange]
// program 3.....increasing size of Array
int A[]={12,3,8,5,9};
int B[]=new int[2*A.length];
for(int i=0;i<A.length;i++)
{
    B[i]=A[i];
}
A=B;
B=null;
System.out.println(A.length);
}
    }














