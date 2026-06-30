public class EquilliIndex {
    public static void main(String[] args) {
        int[]arr={6,7,1,1,9,15};
        int n=arr.length;
        int total=0;
        for(int i:arr){
            total+=i;

        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            total-=arr[i];
            if(total==leftsum){
                System.out.println(i);
            }
            leftsum+=arr[i];
            }
        }
    }
}