class Solution {
//a*b=lcm(a,b)*gcd(a,b)
    private int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    public int nthMagicalNumber(int n, int a, int b) {
        long low=(long)Math.min(a,b);
        long high=(long)n*low;//maximum value not beyond high
        long lcm=(long)(a*b)/gcd(a,b);
        long mod=(long)(Math.pow(10,9)+7);
        while(low<high)
        {
            long mid=(high+low)/2;
            long fact=mid/a + mid/b - mid/lcm;
            if(fact<n)
            {
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return (int)(low%mod);
        
    }
}

// Input: n = 4, a = 2, b = 3
// Output: 6
