import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double inr,dollar,c=78.89;
        Scanner sc= new Scanner(System.in);
        System.out.println("inr");
        inr=sc.nextInt();
        dollar=inr * c;
        System.out.println(dollar);
        sc.close();
    }
}
