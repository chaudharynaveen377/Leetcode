package Studymaterial.Arrayquestions;

public class Q6__Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
      int nums[] = {4,5,6,7,0,1,2};
      int target=4;

                for(int i=0;i<nums.length;i++){
                    if(nums[i]==target) System.out.println(i);;
                }
            System.out.println("-1");


    }
}
