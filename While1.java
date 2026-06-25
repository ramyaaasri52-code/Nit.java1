import java.util.Scanner;
public class While1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = Scanner.nextInt();
        int count = 0;
        While (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digits:" + count);   
    }   
}
