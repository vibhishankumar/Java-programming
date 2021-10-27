class Solution {
    public void sortColors(int[] nums) {
        //sol 1 using bubble sort
        // boolean swaped;
        // for(int i=0;i<nums.length;i++)
        // {
        //     swaped=false;
        //     for(int j=0;j<nums.length-1-i;j++)
        //     {
        //         if(nums[j]>nums[j+1])
        //         {
        //             int temp=nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //             swaped=true;
        //         }
        //     }
        //     if(!swaped)
        //     {
        //         break;
        //     }
        // }
        //sol2 count 0 and 1
        int c0=0,c1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c0++;
            }
            else if(nums[i]==1)
            {
                c1++;
            }
        }
        for(int i=0;i<c0;i++)
        {
            nums[i]=0;
        }
        for(int i=c0;i<c0+c1;i++)
        {
            nums[i]=1;
        }
        for(int i=c0+c1;i<nums.length;i++)
        {
            nums[i]=2;
        }
    }
}
