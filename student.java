import java.util.Scanner;

class student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int age=sc.nextInt();
        int percentage=sc.nextInt();
        System.out.println("name=:"+s);
        System.out.println("age=:"+age);
        System.out.println("percentage=:"+percentage);
        sc.close();
    }
}
