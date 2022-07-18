import java.util.Scanner;

public class Main {
    
    public static void main(String [] args){
        int num;
        long fact=1;
        System.out.println("enter a num");
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
        sc.close();
    }
}
