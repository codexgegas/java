import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number1");
        num1=sc.nextInt();
        System.out.println("Enter number2");
        num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1);
        }else{System.out.println(num2);}
    }
}
