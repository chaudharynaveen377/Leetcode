package calculation;

public class MINelementinArray {
    public static void main(String[] args) {
        int[] arr ={9,8,7,6,0,5,4,3,2,1};
        int min=Integer.MAX_VALUE;
        int x=0;
        for (int i=0;i<arr.length;i++){
            if (min>=arr[i]){
                min=arr[i];
                x=i;
            }
        }
        System.out.println(min);
        System.out.println(x);
    }
}
