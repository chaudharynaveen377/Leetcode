package Graph.Code_Story;
import java.util.*;
public class Topological_sort {
    static void dfs(HashMap<Integer,ArrayList<Integer> > mp, boolean[] isvisited, int u,Stack<Integer> st){
        if (isvisited[u]==true){
            return;
        }
        isvisited[u]=true;
        for (int val:mp.get(u)){
            if (!isvisited[val]){
                dfs(mp,isvisited,val,st);
            }
        }
st.push(u);
    }
    public static void main(String[] args) {
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
        Stack<Integer> st=new Stack<>();
      dfs(mp,visited,0,st);
        System.out.println(st);
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
