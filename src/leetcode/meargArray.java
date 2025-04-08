package leetcode;

public class meargArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        int[] brr ={0,0};
        int[] ans =new int[arr.length+brr.length];
        int j=0,k=0;
        for (int i=0;i<ans.length;i++){
            if (j<arr.length && k<brr.length){
                if (arr[j]<brr[k]){
                    ans[i]=arr[j];
                    j++;
                }
                else {
                    ans[i]=brr[k];
                    k++;
                }
            }
            else
               { if (j<arr.length && k>=brr.length){
                ans[i]=arr[j];
                j++;
            }
             if (k<brr.length && j>=arr.length){
                ans[i]=brr[k];
                k++;

            }
        }
        }
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    }
