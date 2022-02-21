import java.util.Scanner;

class fibo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ans= sc.nextInt();
        sc.close();
        
        System.out.println(fabo(ans));
        
        
    }
    static int fabo(int n){
        //base condition
        if (n<2){
            return n;
        }return fabo(n-1)+fabo(n-2);
    }   
}
