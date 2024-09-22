import java.util.HashMap;

public class creating {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();


        //INSERTION
        map.put("INDIA", 120);
        map.put("USA",254);
        map.put("China",147);
        map.put("Paris",777);

        System.out.println(map);

        map.put("USA",7777);

        System.out.println(map);

        //SEARCH
        if (map.containsKey("France")){
            System.out.println("Key is Present in the Map");
        }else {
            System.out.println("Absent");
        }

        //Get the value along with the key in the Map
        System.out.println(map.get("China"));

        System.out.println(map.get("France"));
    }
}
