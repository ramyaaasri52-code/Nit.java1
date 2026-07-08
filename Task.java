class Car{
    String make;
    String model;
    int year;
    Car(String a,String b,int c){
        this.make=a;
        this.model=b; 
        this.year=c;
    }
}
public class Task {
    public static void main(String[] args) {
        Car Records=new Car("toyotto","corona",2021);
        System.out.print("make ;"+Records.make);
        System.out.print("model ;"+Records.model);    }
    }
}