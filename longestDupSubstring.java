public String longestDupSubstring(String s) {
        // String res="";
        // int n=s.length();
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         String temp=lcp(s.substring(i,n),s.substring(j,n));
        //         if(temp.length()>res.length())
        //         {
        //             res=temp;
        //         }
        //     }
        // } 
        // return res;
        int n=s.length();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)nums[i]=(int)s.charAt(i)-(int)'a';
        int a=26;
        int mod=(int)Math.pow(2,32);
        int mid;
        int left=1;
        int right=n;
        while(left!=right)
        {
            mid=left+(right-left)/2;
            if(search(mid,a,mod,nums,n)!=-1)left=mid+1;
            else right=mid;
        }
        int start=search(left-1,a,mod,nums,n);
        return start!=-1?s.substring(start,start+left-1):"";
    }
    public int search(int mid,int a,int mod,int[] nums,int len)
    {
        long h=0;
        HashSet<Long> seen=new HashSet<>();
        for(int i=0;i<mid;i++)h=(h*a+nums[i])%mod;
        
        seen.add(h);
        int al=1;
        for(int i=1;i<=mid;++i) al=(al*a)%mod;
        
        
       for(int start=1;start<len-mid+1;++start)
       {
           h=(h*a-nums[start-1]*al%mod+mod)%mod;
           h=(h+nums[start+mid-1])%mod;
           if(seen.contains(h))return start;
           seen.add(h);
       }
        return -1;
    }

//sol 3
class Solution {
   public String longestDupSubstring(String s) {
        int left=1;
        int right=s.length()-1;
        
        String result="";
        while(left<=right){
            int mid=left + (right-left)/2;
             
            String str=rabinKarpAlgo(s,mid);
            if(str.length()!=0){
                result=str;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }
    
    private String rabinKarpAlgo(String s,int len){
        Set<Long> set=new HashSet<>();
        long h=hash(s.substring(0,len));
        set.add(h);
        long pow=1;
        for(int l=1;l<len;l++) pow*=31;
        
        for(int i=1;i<=s.length()-len;i++){
            h=nextHash(pow,h,s.charAt(i-1),s.charAt(i+len-1));
            if(set.contains(h)){
                return s.substring(i,i+len);
            }
            set.add(h);
        }
        return "";
    }
    
   private long nextHash(long pow,long hash,char left,char right){
       return (hash - left*pow)*31 + right;
 
   }  
    
    private long hash(String s) {
		long hash = 0;
        long mul=1;
		for (int i = s.length()-1; i >=0; i--) {
			hash += s.charAt(i)*mul;
            mul*=31;
		}
		return hash;
	}   
}

// i/p banana
// o/p ana
