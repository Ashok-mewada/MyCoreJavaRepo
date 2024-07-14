// Lecture 118 Array of Objects 
// Student Challange
/*
class Subject{
private String subid;
private String name;
private int maxmarks;
private int marksobtain;

public String getSubid()
{
    return subid;
}
public String getName()
{
    return name;

}
public int getMaxmarks()
{
    return maxmarks;
}
public int getMarksobtain()
{
    return marksobtain;
}
public void setMaxmarks(int a)
{
    maxmarks=a;
}
public void setMarksobtain(int b)
{
    marksobtain=b;
}
public Subject(String subid,String name)
{
 this.subid=subid;
 this.name=name;

} 
public Subject(String subid,String name,int maxmarks,int marksobtain)
{
    this.subid=subid;
    this.name=name;
    this.maxmarks=maxmarks;
    this.marksobtain=marksobtain;
}
boolean isQualified()
{
    return marksobtain>=maxmarks/40;
}
public String toString()
{
    return "\n Subject Id:"+subid+"\nName:"+name+"\nMarks Obtained:"+marksobtain;
}
}



public class constructarray {
    public static void main(String[] args) {
        Subject subs[]=new Subject[4];
        subs[0]=new Subject("S101","Ds",100,40);
        subs [1]=new Subject ("s102","Algorithms",100,60);
        subs[2]=new Subject("S102","OOPM",100,75);
        subs[3]=new Subject("S103","opertaing System",100,87);
        Subject sa=new Subject("S1535","web development");

for(Subject s:subs)
{
    System.out.println(s);
}
System.out.println(sa.getSubid());
System.out.println(sa.getName());
}
    
}
*/