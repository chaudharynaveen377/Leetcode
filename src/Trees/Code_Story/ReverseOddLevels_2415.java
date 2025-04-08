package Trees.Code_Story;

import java.util.*;
public class ReverseOddLevels_2415 {
    static class node {
        int data;
        node left;
        node right;
        node() {}
        node(int data) {this.data = data;}
    }
    static List<List<node>> level_order(node root){
        Queue<node> que=new LinkedList<>();
        que.add(root);
        que.add(null);
        List<List<node>>lt_store=new ArrayList<>();
        List<node>lt=new ArrayList<>();
        lt.add(root);
        lt_store.add(lt);
        lt=new ArrayList<>();
        while (!que.isEmpty()){
            node newnode=que.poll();
            if (newnode==null){
                if (que.isEmpty())break;
                else {
                    lt_store.add(lt);
                    lt=new ArrayList<>();
                    que.add(null);
                }
            }
            else {
                if (newnode.left!=null){
                    que.add(newnode.left);
                    lt.add(newnode.left);
                }
              if (newnode.right!=null){
                  que.add(newnode.right);
                  lt.add(newnode.right);
              }

            }
        }
        return lt_store;
    }
    static  List<List<node>> reverse_level(List<List<node>> lt){
for (int i=0;i<lt.size();i++){
   List<node> ltx=new ArrayList<>();
    if (i%2!=0){
     Collections.replaceAll(lt,lt.get(i),lt.get(i).reversed());

    }
}
return lt;
    }
    static void disp(List<List<node>>lt){
        for (int i = 0; i <lt.size() ; i++) {
            for (int j=0;j<lt.get(i).size();j++){
                int x=lt.get(i).get(j) !=null ? lt.get(i).get(j).data :-1;
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    static node dfs(List<node> nodeList,int index){
        // Base case: if index is out of bounds or the node is null
        if (index >= nodeList.size() || nodeList.get(index) == null) {
            return null;
        }
        // Create the current node
        node node = (nodeList.get(index));

        // Recursively build the left and right subtrees
        node.left = dfs(nodeList, 2 * index + 1);  // Left child
        node.right = dfs(nodeList, 2 * index + 2); // Right child

        return node;

    }
    static List<node> change(List<List<node>> lt){
        List<node> ans=new ArrayList<>();
        for (int i=0;i<lt.size();i++){
            for(int j=0;j<lt.get(i).size();j++){
                ans.add(lt.get(i).get(j));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        node a = new node(1);
        a.left = new node(2);
        a.right = new node(3);
        a.left.left = new node(4);
        a.left.right = new node(5);
        a.right.left = new node(6);
        a.right.right = new node(7);
        List<List<node>>lt=level_order(a);
        lt=reverse_level(lt);
       node root= dfs(change(lt),0);
       disp(level_order(root));
    }
}
