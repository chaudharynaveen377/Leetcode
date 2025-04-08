package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int nums1[]= {4,9,5}, nums2[] = {9,4,9,8,4};
                Set<Integer> unqEle = new HashSet<>(), removedEle = new HashSet<>();
                for(var num : nums1){
                    unqEle.add(num);
                }
                ArrayList<Integer> intersection = new ArrayList<>();
                for(var num : nums2){
                    if(unqEle.contains(num) && !removedEle.contains(num)){
                        intersection.add(num);
                        removedEle.add(num);
                    }
                }
        System.out.println(intersection);
            }
        }


