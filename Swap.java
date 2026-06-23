import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
    Scanner number=new Scanner(System.in);
    int a=number.nextInt();
    int b=number.nextInt();
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println("a="+a);
    System.out.println("b="+temp);

    }
    
}
