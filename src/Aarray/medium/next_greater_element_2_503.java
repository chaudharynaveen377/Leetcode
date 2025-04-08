package Aarray.medium;

public class next_greater_element_2_503 {
    public static void main(String[] args) {
        int [] nums={5,4,3,2,1};
        int [] nums1=new int[nums.length];
        for (int i=0;i< nums.length;i++){
            int j=i+1;
            boolean flag=true;
            while (j!=i){
                if (j>= nums.length){
                    j=0;
                continue;
                }
                if (nums[j]>nums[i]){
                    nums1[i]=nums[j];

                    flag=false;
                    break;
                }
               j++;
            }
            if (flag==true){
                nums1[i]=-1;
            }
        }
        for (int i=0;i< nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }
}
