import java.util.Scanner;
public class pattern1{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter value:");
            int n =sc.nextInt();
            for(int i =0;i<=n;i++){
               
                for(int j =0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    }
}
