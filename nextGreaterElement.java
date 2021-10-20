class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int next=-1;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==nums1[i])
                {
                    int k=j+1;
                    while(k<nums2.length)
                    {
                        if(nums1[i]<nums2[k])
                        {
                            next=k;
                            break;
                        }
                        k++;
                    }
                    // if(j+1<nums2.length&&nums2[j]<nums2[j+1])
                    // {
                    //     next=j+1;
                    // }
                     break;
                }
            }
            if(next!=-1)
            {
                res[i]=nums2[next];
            }
            else
            {
                res[i]=next;
            }
            
        }
        return res;
    }
}
//i/p 
//[4,1,2]
//[1,3,4,2]
//o/p [-1,3,-1]
