class Solution {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String nStr=n+"";
        int nlen=nStr.length();
        int noOfDigit=digits.length;
        int total=0;
        for(int i=1;i<nlen;i++)
        {
            total+=Math.pow(noOfDigit,i);
        }
        for(int i=0;i<nlen;i++)
        {
            boolean hasSameNo=false;
            for(String digit:digits)
            {
                if(digit.charAt(0)<nStr.charAt(i))
                {
                    total+=Math.pow(noOfDigit,nlen-i-1);
                }else if(digit.charAt(0)==nStr.charAt(i))
                {
                    hasSameNo=true;
                    if(i==nlen-1)
                    {
                        total++;
                    }
                }
            }
            if(!hasSameNo)
            {
                return total;
            }
        }
        return total;
    }
}
// Given an array of digits which is sorted in non-decreasing order.
// You can write numbers using each digits[i] as many times as we want. 
// For example, if digits = ['1','3','5'], we may write numbers such as '13', '551', and '1351315'.
// Return the number of positive integers that can be generated that are less than or equal to a given integer n.
//Input: digits = ["1","3","5","7"], n = 100
// Output: 20
// Explanation: 
// The 20 numbers that can be written are:
// 1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75, 77.
