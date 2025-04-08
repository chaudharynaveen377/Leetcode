package Graph.Code_Story;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class No_provences_547 {
    static void dfs(HashMap<Integer,ArrayList<Integer>> mp ,boolean []isvisited,int u){
        if (isvisited[u]==true){
            return ;
        }
        isvisited[u]=true;
//        System.out.println(u);
        for (int val:mp.get(u)){
            if (!isvisited[val]){
                dfs(mp,isvisited,val);
            }
        }

    }
    static HashMap<Integer, ArrayList<Integer>> adjency(int [][] arr){
        HashMap<Integer, ArrayList<Integer>> adj=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (arr[i][j]==1){
               if (!adj.containsKey(i)){
                   ArrayList<Integer>lt=new ArrayList<>();
                   lt.add(j);
                   adj.put(i,lt);
               }
               else {
                   ArrayList<Integer>lt=adj.get(i);
                   lt.add(j);
                   adj.put(i,lt);
               }
                }
            }
        }
       return (adj);
    }
    public static void main(String[] args) {
       int[][] isConnected = {{1,0,0}
                             ,{0,1,0},
                              {0,0,1}};

int count=0;
        HashMap<Integer, ArrayList<Integer>>mp=adjency(isConnected);
        boolean[] isvisited=new boolean[mp.size()];
        for (int i=0;i<mp.size();i++){
            if (!isvisited[i]){
                count++;
dfs(adjency(isConnected),isvisited,i);};}

//       step-1 create adjency list of that 2d array
        System.out.println(count);
    }
}
