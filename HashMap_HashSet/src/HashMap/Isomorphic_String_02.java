package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic_String_02 {
    public boolean isomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        HashSet<Character>Str=new HashSet<>();
        for (int i = 0; i<s.length();i++){
            Character sch=s.charAt(i);
            Character tch=t.charAt(i);
            if (map.containsKey(sch)){ //it is constant operation
                if (map.get(sch)!=tch) return false;
//            } else if (map.containsValue(tch)) {  //it is linear time operation
//
              else if (Str.add(tch))//Constant hashSet add function
                {
                    return false;
                }
            }else {
                map.put(sch,tch);
                Str.add(tch);
            }
        }
        return true;
    }
}
