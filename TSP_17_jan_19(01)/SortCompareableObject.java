/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_jan_19.sortcompareable;

import java.math.BigInteger;

/**
 *
 * @author User
 */
public class SortCompareableObject {

    public static void main(String[] args) {
        String[] cities = {"Dhaka", "Barisal", "Khulna", "Chittagong","Rangpur"};
        java.util.Arrays.sort(cities);
        for (String city : cities) {
            System.out.println(city + " ");
        }
        System.out.println();
        BigInteger[] hugeNumbers = {new BigInteger("2222496549"),
            new BigInteger("4568344574938"),
            new BigInteger("5428344574938")};
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number : hugeNumbers) {
            System.out.println(number + "");
        }

    }
}
