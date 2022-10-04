package com.techelevator.farm.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interleaving {

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1,2,3);
        List<Integer> second = Arrays.asList(21,22,23);

        System.out.println(zip(first,second));

        List<Integer> longerList = Arrays.asList(31,32,33,34,35,36,37);
        System.out.println(zip(first, longerList));
        System.out.println(zip(longerList, first));
    }

    public static List<Integer> zip(List<Integer> first, List<Integer> second) {

        List<Integer> result = new ArrayList<>();

//        int lengthOfShortLIst = first.size();
//        if(second.size() < first.size()) {
//            lengthOfShortLIst = second.size();
//        }

        int lengthOfShortList = Math.min(first.size(), second.size());

        for(int index = 0; index < lengthOfShortList; index++) {
            result.add(first.get(index));
            result.add(second.get(index));
        }

        List<Integer> longerList;

        if (first.size() > second.size()) {
            // first is larger
            for(int index = lengthOfShortList; index < first.size(); index++){
                result.add(first.get(index));
            }
        } else {
            // second is larger
            for(int index = lengthOfShortList; index < second.size(); index++){
                result.add(second.get(index));
            }
        }

        return result;
    }

}
