/*
public class arraytwoD {
    public static void main(String[] args) {
        // Lecture 87[Practicing 2D Array]
      
    int A[][]=new int[5][4];
        int B[][]={{1,2,3},{2,4,6},{1,3,5}};
        int C[][];
        C=new int[5][5];
        int []D[]=new int[5][5];
        int[] E,F[];
        E=new int[5]; // E is one Dimensional Array
        F=new int[5][5];
      
      int A[][]=new int[5][4];
        int B[][]={{1,2,3},{2,4,6},{1,3,5}};
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[0].length;j++)
            {
                System.out.print (B[i] [j]+" ");
            }
            System.out.println("");
        }
        for(int x[]:B)
        {
            for(int y:x)
            {
                System.out.println(y);
            }
        }
        
        // Jagged Array
        int A[][];
        A=new int[3][];
        A[0]=new int[5];
        A[1]=new int[3];
        A[2]=new int[8];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        
// Lecture 88 [Student Challange]
// Program   1... Adding two Matrices
int A[][]={{12,14,15},{32,53,22},{12,24,32}};
int B[][]={{11,32,87},{11,33,22},{3,5,7}};

System.out.println("First Array");
for(int x[]:A)
{ 
    for(int y:x)
    System.out.print(y+" ");
    System.out.println("");
}
   System.out.println("Second Array");
for(int x[]:B)
{ 
    for(int y:x)
    System.out.print(y+" ");
    System.out.println("");
}
    System.out.println("Sum of both Arrays Are:");
for(int i=0;i<A.length;i++)
{
    for(int j=0;j<A[0].length;j++)
    {
        int [][]C;
        C=new int[3][3];
        C[i][j]=A[i][j]+B[i][j];
        System.out.print( C[i][j]+" ");
    }
    System.out.println("");
}

// Lecture 88 Program2.....Multiplying 2 Matrices
int A[][]={{3,5,9},{7,6,2},{4,3,5}};
int B[][]={{1,0,0},{0,1,0},{0,0,1}};
int C[][]=new int [3][3];
for(int i=0;i<A.length;i++)
{
    for(int j=0;j<3;j++)
    {
        C[i][j]=0;
        for(int k=0;k<3;k++)
        {
           C[i][j]=C[i][j]+A[i][k]*B[k][j];
        }
    }
}
for(int x[]:C)
{
    for(int y:x)
    {
        System.out.print(y+" ");
    }
    System.out.println("");
}

// Lecture 88 Program 3...sorting array of strings
// i copied this program from lecture 
String arr[]={"java","python","pascal","smalltalk","ada","basic"};
java.util.Arrays.sort(arr);
   for(String x:arr)
   {
    System.out.println(x+" ");
   }
    }
}   
      */