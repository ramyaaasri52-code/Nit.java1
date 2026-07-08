class Book{
    String name;
    String author;
    Book(String a,String b){
        this.name=a;
        this.author=b;
    }
    Book(String c){
        this.name= c;
        this.author="unknown";
    }
}
public class Task1 {
    public static void main(String[] args) {
        Book Records=new Book("the hobbit, tolkein, ");
        Book Records1=new Book("a book ,");
        System.out.print("title:"+Records.name);
        System.out.print("author:"+Records.author);
        System.out.print("title:"+Records1.name);
        System.out.print("author:"+Records1.author);


    }
}