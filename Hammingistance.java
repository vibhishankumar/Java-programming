class Solution {
    public int hammingDistance(int x, int y) {
        int tempres=x^y;
        int c=0;//to count total number of set bit means 1
        while(tempres>0)
        {
            c+=tempres&1;
            tempres>>=1;
        }
        return c;
        
    }
}

// input x=1 ,y=4
//   output=2
// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)
//        ↑   ↑
// The above arrows point to positions where the corresponding bits are different.
