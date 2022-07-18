import java.util.*;
public class Main {
    public static void main(String[] args){
        float num,sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        sc.nextInt();

        while (num!=0){
            sum+=num;
            sc.nextInt();
        }

        System.out.println(sum);

    }
}
