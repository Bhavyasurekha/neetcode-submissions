class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char arr[] = s.toCharArray();
        char arrt[] = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arrt);
        if(Arrays.equals(arr,arrt)){
            return true;
        }
        return false;
       
    }
}
