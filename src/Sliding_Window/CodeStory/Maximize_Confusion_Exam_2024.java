package Sliding_Window.CodeStory;

import java.util.Scanner;

public class Maximize_Confusion_Exam_2024 {
    public static void main(String[] args) {
        String answerKey="tfft";
        char arr[]=answerKey.toCharArray();
        int n=arr.length;
        int k=1;
        int result=0,i=0,j=0,countf=0;
        while (j<n){
            if (arr[j]=='f') {
                countf++;}

                while (countf > k) {
                    if (arr[i] == 'f') {
                        countf--;
                    }
                    i++;
                }

            result=Math.max(result,j-i+1);
            j++;
        }
        System.out.println(result);

    }
}
