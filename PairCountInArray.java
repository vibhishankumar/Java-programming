class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        // int c=0; sol1 TLE
        // for(int i=0;i<time.length;i++)
        // {
        //     int sum=time[i];
        //     for(int j=i+1;j<time.length;j++)
        //     {
        //         sum+=time[j];
        //         if(sum%60==0)
        //         {
        //             c++;
        //         }
        //         sum-=time[j];
        //     }
        // }
        // return c;
        //sol 2 using n mod m
        int freq[]=new int[60];
        for(int i=0;i<time.length;i++)
        {
            ++freq[time[i]%60];
        }
        //now need to count pair which sum is divisible by 60
        int sum=freq[0]*(freq[0]-1)/2;
        for(int i=1;i<=30&&i!=(60-i);i++)
        {
            sum+=freq[i]*(freq[60-i]);
        }
      // if K is even
        sum+=freq[30]*(freq[30]-1)/2;// since 60 is even
        return sum;
    }
}
// Input: time = [30,20,150,100,40]
// Output: 3
