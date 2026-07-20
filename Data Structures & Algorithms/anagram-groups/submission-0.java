class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ll = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String ne = String.valueOf(arr);
            if(!hm.containsKey(ne)){
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                hm.put(ne,l);
            }else{
                hm.get(ne).add(strs[i]);
            }

        }
        ll.addAll(hm.values());
        return ll;
    }
}
