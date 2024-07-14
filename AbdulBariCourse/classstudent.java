/*
import javax.lang.model.util.ElementScanner14;
// Lecture 110 Student Challange of Student class
class student{
    public int  roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
    }
    public double average()
    {
        return (float) total()/3;
    }
    public String grade()
    {
        if(average()>=80)
        return "Grade A";
        else if(average()<79 && average()>70)
        return "Grade B";
         else if(average()<69& average()>40)
         return "Grade C";
        else 
        return "Fail";

    }
    public String detials()
    {
        return "Roll no:"+roll+"\n"+"name :"+name+"\n"+"course: "+course;
    }
}
public class classstudent {
    public static void main(String[] args) {
        student s=new student();
        s.roll=23123;
        s.name="Ashok";
        s.course="CSE";
        s.m1=70;
        s.m2=80;
        s.m3=65;
       System.out.println(s.detials());
        System.out.println("Total"+s.total());
        System.out.println(s.average());
        System.out.println(s.grade());
        
    }
    
}
*/