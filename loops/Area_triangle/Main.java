import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height,lenght,area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter height");
        height=sc.nextDouble();
        System.out.println("Enter Lenght");
        lenght=sc.nextDouble();
        sc.close();
        area=0.5*lenght*height;
        System.out.println(area);
        }
}
