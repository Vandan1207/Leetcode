class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> q = new ArrayDeque<>();
        int freq[]= new int[26];
        for(int i =0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==0){
                freq[s.charAt(i)-'a']++;
                q.add(i);
            }else{
                freq[s.charAt(i)-'a']++;
                while(!q.isEmpty() && freq[(s.charAt(q.peek()))-'a']!= 1){
                    q.remove();
                }
            }
        }
        return q.isEmpty()? -1 : q.peek();
    }
}