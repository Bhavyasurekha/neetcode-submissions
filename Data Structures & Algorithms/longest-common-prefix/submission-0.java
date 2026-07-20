class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s=strs[0];
        String t=strs[strs.length-1];
        String k="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(i)){
                k=k+s.charAt(i);
            }else{
                break;
            }
        }
        return k;
    }
}