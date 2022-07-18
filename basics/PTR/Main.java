import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int p,r,t,simple;
        System.out.println("Principle Amount");
        Scanner sc= new Scanner(System.in);
        p=sc.nextInt();
        System.out.println("Rate");
        r=sc.nextInt();
        System.out.println("Time");
        t=sc.nextInt();
        sc.close();
        simple =p*(1+r*t);
        System.out.println(simple);




    }
}
