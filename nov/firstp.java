package nov;

public class firstp {
    public static void main(String[] args) {
        int num=567531;
        int sum=0;
        while(num>0){
            int digit=num%10;
            num=num/10;
            sum=sum*10+digit;
        }
        System.out.println(sum);
    }
}
