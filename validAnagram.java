// Given two strings s and t, return true if t is an anagram of s, and false otherwise.


class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> sList = new HashMap<>();
        HashMap <Character, Integer> tList = new HashMap<>();
        if(s.length() == t.length()){
            for(int i = 0; i < s.length();i++){
                if(!sList.containsKey(s.charAt(i))){
                    sList.put(s.charAt(i), 1);
                }else {
                	sList.replace(s.charAt(i), sList.get(s.charAt(i))+1);
                }
                if(!tList.containsKey(t.charAt(i))){
                    tList.put(t.charAt(i), 1);
                }else {
                	tList.replace(t.charAt(i), tList.get(t.charAt(i))+1);
                }
            }
            if(sList.equals(tList)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}

