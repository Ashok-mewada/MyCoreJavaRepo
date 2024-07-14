// import java.util.Scanner;

// public class StringCollegeWallah {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         StringBuilder sb=new StringBuilder(sc.nextLine());
//         System.out.println(sb);

//         // toggle
//         for(int i=0;i<sb.length();i++)
//         {
//             boolean flag=true;
//             char ch=sb.charAt(i);
//             if(ch==' ') continue;
//             int ascii=(int)ch;

//             if(ascii>=97) flag =false; //small
//             if(flag==true){// capital
//                 ascii+=32;
//                 char dh=(char)ascii;
//                 sb.setCharAt(i,dh);
//             }
//             else{//small
//                 ascii-=32;
//                 char dh=(char)ascii;
//                 sb.setCharAt(i,dh);

//             }
//         }
//         System.out.println(sb);
//     }
    
// }

// check palindrom

//  import java.util.Scanner;

// public class StringCollegeWallah {
//     public static void main(String[] args) {
//        String str="abcdcba";
//        int i=0;
//        int j=str.length()-1;
//        boolean flag =true;// palindrome

//        while(i<j){
//         if(str.charAt(i)!=str.charAt(j)){
//             flag =false;
//             break;
//         }
//         i++;
//         j--;
//        }
//        if(flag==true)System.out.println("palindrome");
//        else System.out.println("not Palindrome");
//     }
    
// }


// given a string s,return  the number of palindromic substrings in it
// input s="abc"
//output:3


 

// // Java Program to reverse each word in String

//  import java.util.Scanner;

// public class StringCollegeWallah {
//     public static void main(String[] args) {
//         String str="I am a Student";
//         String ans="";
//         StringBuilder sb=new StringBuilder("");
//         for(int i=0;i<str.length();i++)
//         {
//             char ch=str.charAt(i);
//             if(ch !=' '){
//                 sb.append(ch);
//             }
//             else {
//                 sb.reverse();
//                 ans+=sb;
//                 ans+=" ";
//                 sb=new StringBuilder("");
              
//             }
//         }
//         sb.reverse();
//         ans +=sb;
//         System.out.println(ans);
//     }

//     }
    
// the string should be compressed such that consecutive
// duplicates of characters are replaced with the character
// and followed by the nhumber of consecutive duplicates

//input -aaabbbbccdde
//output -a3b4c2d3e
 import java.util.Scanner;

public class StringCollegeWallah {
    public static void main(String[] args) {
        String str="aaaabbbbbcdddde";
        String ans=""+str.charAt(0);
        int count =1;
        for(int i=1;i<str.length();i++)
        {
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else {
                if(count>1) ans+=count;
                count =1;
                ans +=curr;
            }
        }
        if(count>1) ans+=count;
        System.out.println(ans);
    }
    }
    




































