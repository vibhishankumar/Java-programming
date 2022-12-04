class Solution {
    public String frequencySort(String s) {
        char[] strArr=s.toCharArray();
        StringBuilder res=new StringBuilder();
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:strArr)
        {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new LinkedList<>(mp.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>()
                         {
                             public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2)
                             {
                                 return (o1.getValue()).compareTo(o2.getValue());
                             }
                             
                         });
        Map<Character,Integer> temp=new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> l:list)
        {
            temp.put(l.getKey(),l.getValue());
        }
        ArrayList<Character> keys = new ArrayList<>(temp.keySet());
        for(int i=keys.size()-1; i>=0;i--){
            for(int j=0;j<mp.get(keys.get(i));j++)
            {
                res.append(keys.get(i));
            }
        }
        //"raaeaedere"
        //o/p. "eeeeaaarrd"
        return res.toString();
        
    }
}
