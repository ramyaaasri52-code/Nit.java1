abstract class animal {
    abstract void sound();
    void sleep(){
        System.out.println("sleeping");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.sound ();
    }
}