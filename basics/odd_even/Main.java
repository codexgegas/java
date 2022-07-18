import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        num =sc.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{System.out.println("Odd");}
        sc.close();
    }
}
