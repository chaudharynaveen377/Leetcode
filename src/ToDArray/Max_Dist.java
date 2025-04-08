package ToDArray;

public class Max_Dist {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5},{1,2,3}};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                min=Math.min(min,arr[i][j]);
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                max=Math.max(max,arr[i][j]);
            }
        }
        System.out.println(max-min);
    }
}
