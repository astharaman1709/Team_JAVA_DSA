package hashSet_04;

import java.util.HashSet;
import java.util.Iterator;
public class create_HSet {
    public static void main(String[] args) {
        //creating

        HashSet<Integer>set = new HashSet<>();
        //ArrayList <Integer> list = new ArrayList<>();

        //Insert
        set.add(7);//list.add(element)
        set.add(77);
        set.add(74);
        set.add(27);
        set.add(7);

        //print all element of set
        System.out.println(set);


        //size of set
        System.out.println("Size of HashSet is : "+set.size());
        //search
        if(set.contains(7)){
            System.out.println("Contains");
        }

        if (!set.contains(6)){
            System.out.println("Does not contain");
        }


        //delete
        set.remove(7);
        if(!set.contains(7)){
            System.out.println("we have deleted 7");
            System.out.println(set);
        }
        //Iterator
        Iterator it = set.iterator();

        //hasNext(),next()
//        it.next();
//        it.next();
//        it.next();
//        it.hasNext();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
