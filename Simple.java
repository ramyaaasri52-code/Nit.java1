import java.util.Scanner;
public class Simple {
    public static void main(String[] args) {
        Scanner sp=new Scanner(System.in);
        int principal=sp.nextInt();
        int rate=sp.nextInt();
        int time=sp.nextInt();
       int  interest=(principal*rate*time)/100;
        System.out.println("simple interest"+interest);

        
    }
    
}
