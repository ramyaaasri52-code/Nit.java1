public class LastRepeat {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50,10};
        int n=nums.length;
        boolean found=false;
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<=1;j++)
            {
                if(nums[i]==nums[j])
                {
                    System.out.println(nums[i]);
                    flags=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }       
    }   
}