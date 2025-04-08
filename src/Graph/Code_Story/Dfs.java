package Graph.Code_Story;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Dfs {
    static void dfs(HashMap<Integer,ArrayList<Integer> > mp, int []v, boolean[] isvisited, int u){
  if (isvisited[u]==true){
      return; 
  }
  isvisited[u]=true;
        System.out.println(u);
  for (int val:mp.get(u)){
      if (!isvisited[val]){

          dfs(mp,v,isvisited,val);
      }
  }

    }
    public static void main(String[] args) {
//        (1) ----->(2)-----
//         ^        -|      |
//         |      -  |      |
//         |    -   (3)     |
//         |  -             |
//        (0)---------------
//
        int v[]={0,1,2,3};
        ArrayList<Integer> lt[]=new ArrayList[v.length];
        lt[0]=new ArrayList<>(Arrays.asList(1));
        lt[1]=new ArrayList<>(Arrays.asList(2));
        lt[2]=new ArrayList<>(Arrays.asList(0,3));
        lt[3]=new ArrayList<>(Arrays.asList());
        System.out.println(lt[3].isEmpty());
        HashMap<Integer,ArrayList<Integer> > mp=new HashMap<>();
        for (int i=0;i<v.length;i++){
            mp.put(v[i],lt[i]);
        }
        System.out.println(mp);
        boolean visited[]=new boolean[v.length];
        dfs(mp,v,visited,0);

    }
}
