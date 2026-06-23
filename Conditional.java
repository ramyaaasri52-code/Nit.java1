import java.util.Scanner;
public class Conditional{
    public static void main(String[] args) {
        Scanner Conds=new Scanner(System.in);
        int number = Conds.nextInt();
        if(number<0){
            System.out.println("positive number");
        }
        else if(number>0){
            System.out.println("negative number");
        }
        else{
            System.out.println("zero");
        }
    }
}
