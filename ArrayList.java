package com.java2novice.arraylist;
 
import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayListIterator {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        Iterator<String> itr = arrl.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
- See more at: http://java2novice.com/java-collections-and-util/arraylist/iterator/#sthash.1uJph8Xd.dpuf