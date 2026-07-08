abstract class shape{
    abstract void area();
    void display(){
        System.out.println("display area");
    }
    class value{
        int n;
        int m;
        rect(int l,int b){
            this.n=l;
            this.m=b;
        }
        double area(){
            return m*n;
        }
    }

    }
}