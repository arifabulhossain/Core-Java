/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedHash;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class LinkedHashset {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        
        set.add("Dhaka");
        set.add("Barisal");
        set.add("Khulna");
        set.add("Rajshahi");
        set.add("Chittangong");
        set.add("Khulna");
        
        System.out.println(set);
        
        for(String element: set)
            System.out.println(element.toString().toLowerCase()+"");
    }
}
