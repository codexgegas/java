import java.util.*;
public class Main {
    public static void main(String[] args){
        // intialize var
        int temp1, temp2, num1, num2,temp,hcf,lcm;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num1");//input 1
         num1= sc.nextInt();
        System.out.println("enter num2");//input 2
        num2= sc.nextInt();
        sc.close();

        // assign vas to nums
        temp1=num1;
        temp2=num2;
        //loigc
        while(temp2 !=0){
            temp= temp2;
            temp2=temp1%temp2;
            temp1=temp;

        }
        hcf=temp1;
        lcm=(num1*num2)/hcf;

        //result 
        System.out.println("HCF ="+ hcf);
        System.out.println("LCM ="+ lcm);

        
    }

}
