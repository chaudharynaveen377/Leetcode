class Solution {
    public int[] arrayRankTransform(int[] arr) {
         PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->a-b);
        for (int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int val=1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while (!pq.isEmpty()){
            if (!mp.containsKey(pq.peek())){
                mp.put(pq.peek(),val++);
            }
            pq.poll();
        }
      
        for (int i=0;i<arr.length;i++){
            if (mp.containsKey(arr[i])){
                arr[i]=mp.get(arr[i]);
            }
        }
        return arr;
    }
}