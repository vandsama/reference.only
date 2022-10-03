package com.techelevator.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1,2,3);
        List<Integer> second = Arrays.asList(21, 22, 23);

        System.out.println(zip2(first, second));

        List<Integer> longerList = Arrays.asList(31, 32, 33, 34, 35, 36, 37);
        System.out.println(zip2(first, longerList));
        System.out.println(zip2(longerList, first));

    }

    public static List<Integer> zip2(List<Integer> first, List<Integer> second) {
        List<Integer> result = new ArrayList<>();
        int lengthOfLongList = Math.max(first.size(), second.size());

        for(int index = 0; index < lengthOfLongList; index++) {
            if (index < first.size()) {
                result.add(first.get(index));
            }
            if (index < second.size()) {
                result.add(second.get(index));
            }
        }
        return result;
    }

    public static List<Integer> zip(List<Integer> first, List<Integer> second) {
        List<Integer> result = new ArrayList<>();

        int lengthOfShortList = Math.min(first.size(), second.size());

        for(int index = 0; index < lengthOfShortList; index++) {
            result.add(first.get(index));
            result.add(second.get(index));
        }

        List<Integer> longerList;
        if (first.size() > second.size()) {
            longerList = first;
        } else {
            longerList = second;
        }

        // second is larger
        for(int index = lengthOfShortList; index < longerList.size(); index++) {
            result.add(longerList.get(index));
        }

        return result;
    }

}
