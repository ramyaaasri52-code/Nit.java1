interface Flyable {
    int a=100;
    void fly();
}
interface Movable{
    void fly();
}
class bird implements flyable{
    public void fly(){
        System.out.println("The bird is flying.");
    }
}
class aeroplane implements flyable,movable{
    public void fly(){
        System.out.println("The aeroplane is flying.");
    }
}