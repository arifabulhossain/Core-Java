/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author User
 */
public class TestTreeSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
         set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beiging");
        set.add("New York");
        
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set "+ treeSet);
        
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(\"new York\"):"+
                treeSet.headSet("New York"));
        
        System.out.println("tailSet(\"new York\"):"+
                treeSet.tailSet("New York"));
        
        System.out.println("lower(\"P\")"+treeSet.lower("P"));
        System.out.println("higher(\"P\")"+treeSet.higher("P"));
        System.out.println("ceiling(\"P\")"+treeSet.ceiling("P"));
        System.out.println("floor(\"P\")"+treeSet.floor("P"));
        System.out.println("pollFirst(\"P\")"+treeSet.pollFirst());
        System.out.println("pollLast(\"P\")"+treeSet.pollLast());
        System.out.println("New tree set: "+treeSet);
        
        
    }
 
}
