import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner pattern = new Scanner(System.in);
        int n=pattern.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-1;j++)
            {
                System.out.println();
            }
        }
    }    
}