class Animal{
    String name;
    void eating(){
        System.out.println("eating");
    }
}
class cat extends Animal{
}
  public class Inheritance {
       public static void main(String[] args){
        cat c= new cat();
        c.eating();
    }
}