class Solution {
    
    public List<String> find_permutation(String S) {
        
        // Code here
        List<String>res=new ArrayList<>();
        
        permute(res,S,"");
        Collections.sort(res);
        return res;
       
    }
    public void permute(List<String>res,String s,String asf)
    {
        if(s.length()==0)
        {
            res.add(asf);
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            String roq=left+right;
            permute(res,roq,asf+ch);
        }
    }
    
}
// ljr



// Your Output: 
// jlr jrl ljr lrj rjl rlj 
