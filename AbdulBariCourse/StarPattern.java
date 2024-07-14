//pattern  by saurabh shukla
//Pattern 1
// public class StarPattern {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(j<=i)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 2
// public class StarPattern {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(j>=6-i)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 3
// public class StarPattern {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(j>=i)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 4
// public class StarPattern {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=5;j++)
//             {
//                 if(j<=6-i)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 5
// public class StarPattern {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=9;j++)
//             {
//                 if(j>=6-i&&j<=4+i)
//                 System.out.print("*");
//                 else 
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 6
// public class StarPattern {
//     public static void main(String[] args) {
//         int k;
//         for(int i=1;i<=5;i++)
//         {
//             k=1;
//             for(int j=1;j<=9;j++)
//             {
//                 if(j>=6-i&&j<=4+i&&k==1)
//                 {
//                 System.out.print("*");
//                 k=0;
//                 }
//                 else 
//                 {
//                 System.out.print(" ");
//                 k=1;
//                 }
//             }
//             System.out.println();
//         }
//     }
//  }

// Pattern 7
// public class StarPattern {
//     public static void main(String[] args) {
        
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=9;j++)
//             {
//                 if(j<=6-i||j>=4+i)
//                 {
//                 System.out.print("*");
                
//                 }
//                 else 
//                 {
//                 System.out.print(" ");
                
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern 8
// public class StarPattern {
//     public static void main(String[] args) {
        
//         for(int i=1;i<=4;i++)
//         {
//             int k=1;
//             for(int j=1;j<=7;j++)
//             {
//                 if(j>=5-i&&j<=3+i)
//                 {
//                 System.out.print(k);
            
//               if (j<4) k++;else  k--;
                
//                 }
//                 else 
//                 {
//                 System.out.print(" ");
                
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



 //PAttern 9
// public class StarPattern {
//     public static void main(String[] args) {
        
//         for(int i=1;i<=4;i++)
//         {
//             char k='A';
//             for(int j=1;j<=7;j++)
//             {
//                 if(j<=5-i||j>=3+i)
//                 {
//                 System.out.print(k);
            
//              if (j<4) k++;else  k--;
                
//                 }
//                 else 
//                 {
//                 System.out.print(" ");
//               if(j==4)  k--;
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Pattern 10

public class StarPattern {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<=7;i++)
        {
            
            for(int j=1;j<=7;j++)
            {
                k++;
                if(j>=5-i&&j<=3+i&&j!=4)
                {
                System.out.print("*");
                }
                else 
                {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


