import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Double r, pi=3.14,area;
    System.out.println("enter the radious of Circle ");
    Scanner sc= new Scanner(System.in);
    r=sc.nextDouble();
    area= 2*pi*r;
    System.out.println(area);
    }
}
