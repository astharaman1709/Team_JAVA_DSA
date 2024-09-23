package HashMap;

import java.util.HashMap;


public class Valid_Anagram_01 {

    static HashMap<Character,Integer> Freq (String str){
      HashMap<Character,Integer>map= new HashMap<>();
      for (int i = 0; i < str.length(); i++){
        Character  ch = str.charAt(i);
        if (!map.containsKey(ch)){
            map.put(ch,1);
        }else{
            int currFreq = map.get(ch);
            map.put(ch,currFreq+1);
        }
      }
      return map;
    }
    public boolean isAnagram1(String s, String s2) {
       if (s.length() != s2.length()) return false;
           HashMap<Character, Integer> map1 = Freq(s);
           HashMap<Character, Integer> map2 = Freq(s2);
           return map1.equals(map2);
    }
    public boolean isAnagram2(String s, String s2) {
        if (s.length() != s2.length()) return false;
        HashMap<Character, Integer> map = Freq(s);
        for (int i = 0; i < s2.length(); i++) {
            Character ch = s2.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int currFreq = map.get(ch);
                map.put(ch, currFreq - 1);
            }
        }
        //All values in the map should be zero for S and s2 to be anagram
     for (Integer i : map.values()){
         if (i !=0 )return false;
     }
     return true;
    }
    public static void main(String[] args) {

    }
}
