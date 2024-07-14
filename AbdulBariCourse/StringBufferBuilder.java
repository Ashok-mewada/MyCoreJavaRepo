// Lecture no.202 String vs String Buffer and String Builder
public class StringBufferBuilder {
    public static void main(String[] args) {
       String S1=new String("Hello");
       
       StringBuffer S2=new StringBuffer("Hello");

       StringBuilder S3=new StringBuilder("Hello");

       S1.concat("World");// its immutable
       S2.append("World");//Thread Safe 
       S3.append("World");// not Thread Safe

       System.out.println(S1);
       System.out.println(S2);
       System.out.println(S3);
    
    

    }
}
