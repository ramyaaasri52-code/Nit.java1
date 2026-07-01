import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner pattern=new Scanner(System.in);
        int n=pattern.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
                System.out.println(j+" ");
        }
        System.out.println("");
    }
}
