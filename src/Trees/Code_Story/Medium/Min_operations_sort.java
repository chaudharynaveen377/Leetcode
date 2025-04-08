package Trees.Code_Story.Medium;

import java.util.*;

public class Min_operations_sort {
    public static class node {
                        int data;
        public node right;
        public node left;
        node(){
        }
        public node(int data){
            this.data=data;
        }
    }
    static List<List<Integer>> level_order(node root){
        Queue<node> que=new LinkedList<>();
        que.add(root);
        que.add(null);
        List<List<Integer>>lt_store=new ArrayList<>();
        List<Integer>lt=new ArrayList<>();
        lt.add(root.data);
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
                    lt.add(newnode.left.data);
                }
              if (newnode.right!=null){
                  que.add(newnode.right);
                  lt.add(newnode.right.data);
              }

            }
        }
        return lt_store;
    }


    public static int operations(List<Integer> lt) {
        int n = lt.size();
        boolean[] visited = new boolean[n];

        // Create an array of (value, index) pairs
        int[][] valueIndexPairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            valueIndexPairs[i][0] = lt.get(i); // Value
            valueIndexPairs[i][1] = i;        // Original Index
        }

        // Sort the pairs array by values
        Arrays.sort(valueIndexPairs, (a, b) -> Integer.compare(a[0], b[0]));

        int swaps = 0;

        // Traverse the sorted array and detect cycles
        for (int i = 0; i < n; i++) {
            // If already visited or already in the correct position, skip
            if (visited[i] || valueIndexPairs[i][1] == i) {
                continue;
            }

            // Count the size of the cycle
            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = valueIndexPairs[j][1]; // Move to the index of the next element in the cycle
                cycleSize++;
            }

            // Add (cycleSize - 1) to the swap count
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(4);
        a.right=new node(3);
        a.left.left=new node(7);
        a.left.right=new  node(6);
        a.right.left=new  node(8);
        a.right.right=new  node(5);
        a.right.left.left=new  node(9);
        a.right.right.left=new  node(10);
        node root=a;
        System.out.println(level_order(root));
        System.out.println(operations(Arrays.asList(7,6,8,5)));
        List<List<Integer>> ans=level_order(root);
        int count=0;
        for (int i=0;i<ans.size();i++){
            count=count+operations(ans.get(i));
        }
        System.out.println(count);
    }
}
