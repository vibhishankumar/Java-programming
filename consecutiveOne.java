// "static void main" must be defined in a public class.
public class Main {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevMax=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                max++;
                prevMax=maxRes(max,prevMax);
            }
            else
            {
                max=0;
            }
        }
       return prevMax;
    }
    int maxRes(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,0,1,1};
        Main obj=new Main();
        System.out.println(obj.findMaxConsecutiveOnes(arr));
        
    }
}
