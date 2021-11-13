class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty()&&temperatures[st.peek()]<temperatures[i])
            {
                res[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return res;
    }
}
// Input: temperatures = [73,74,75,71,69,72,76,73]
// Output: [1,1,4,2,1,1,0,0]
