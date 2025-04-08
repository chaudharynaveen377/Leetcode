package Daily_Leetcodde.java.Medium;

import java.util.HashMap;

public class Min_ticket_983 {
    static int getindex(int arr[],int target){
        int index=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>=target)return i;
        }
        return Integer.MAX_VALUE;
    }
    static int t[]=new int[366];
    static int logic(int days[],int cost[],int sum,int idx,HashMap<Integer,Integer>mp7s,HashMap<Integer,Integer>mp30s){
        if (idx>=days.length){
            return sum;
        }
        if (t[idx]!=-1){
            return t[idx];
        }
//        System.out.println(sum);
        int left=logic(days,cost,sum+cost[0],idx+1,mp7s,mp30s);
        int right=logic(days,cost,sum+cost[1],mp7s.get(idx),mp7s,mp30s);
        int mid=logic(days,cost,sum+cost[2], mp30s.get(idx),mp7s,mp30s);
        return t[idx]=Math.min(left,Math.min(right,mid));
    }
    public static void main(String[] args) {
//        Input: days = [1,4,6,7,8,20], costs = [2,7,15]
//        Output: 11
        int []days={1,2,3,4,5,6,7,8,9,10,30,31};
        int []costs={2,7,15};
        HashMap<Integer,Integer>mp7s=new HashMap<>();
        int i=0,j=i;
        while (i< days.length){
            if (j< days.length &&days[j]>=days[i]+7){
                mp7s.put(i,j);
                i++;}
            else {j++;}
            if (j>=days.length){
                mp7s.put(i,Integer.MAX_VALUE);
                i++;
            }
        }
        HashMap<Integer,Integer>mp30s=new HashMap<>();
        i=0;j=0;
        while (i< days.length){

            if (j< days.length && days[j]>=days[i]+30){
                mp30s.put(i,j);
                i++;}
            else {j++;} if (j>=days.length){
                mp30s.put(i,Integer.MAX_VALUE);
                i++;
            }

        }


        for (int v=0;v<t.length;v++){
            t[v]=-1;
        }
        System.out.println(logic(days,costs,0,0,mp7s,mp30s));
    }
}
