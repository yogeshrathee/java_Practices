import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        LargestNumber obj=new LargestNumber();
        obj.largest_num(num1,num2,num3);
    }
}