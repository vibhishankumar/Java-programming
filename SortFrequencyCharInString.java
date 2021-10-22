class Solution {
    
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        // now i need to sort the map based on values, so onething that i can do is
        // store each entry of map as object into the list and then sort the list
        // based on object's value
        
        // so we need to create a list then we need to add the entry set of map into this
        
        // first way by which we can add entry set to list
        
        // List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        
        
        // another way of doing so is iterate through each entry object and put it into the list
        
        List<Map.Entry<Character, Integer>> list = new ArrayList<>();
            
        for(Map.Entry<Character, Integer> mapEntry : map.entrySet()){
            list.add(mapEntry);
        }
        
        // now lets sort the list based on comaparator choice
        
        Collections.sort(list, new ValueComparator());
        
        StringBuilder sb = new StringBuilder();

        
        for(int i=0;i<list.size();i++){
            // System.out.println(list.get(i).getKey() + " "+ list.get(i).getValue());
            char ch = list.get(i).getKey();
            int count = list.get(i).getValue();
            
            while(count>0){
                sb.append(ch);
                count--;
            }
        }
 
        return sb.toString();
       
    }
    
    public class ValueComparator implements Comparator<Map.Entry<Character, Integer>>{
        public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2){
            return o2.getValue() - o1.getValue();
        }
    }
}

// i/o   "tree"

//o/p eetr or eert
