package Trees;

public class AverageSum {
    static class node {
                        int data;
        node right;
        node left;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }


//    Brute force
    public static int sum(node root){
        if (root==null){
            return 0;
        }
        int left=sum(root.left);
        int right=sum(root.right);
        return left+right+root.data;

    }
    static int nodes(node root){
        if (root==null){
            return 0;
        }
        int left=nodes(root.left);
        int right=nodes(root.right);
        return left+right+1;
    }

    static int averagesm(node root){
        if (root==null){
            return 0;
        }

         int left=averagesm(root.left);
         int right=averagesm(root.left);
        if (root.data==sum(root)/(nodes(root))){
            return  left+right+1;
        }
        else {
         return left+right;}

    }

//    2nd approach
    static class Pair {
    int nodes;
    int sum;

    Pair(int nodes, int sum) {
        this.nodes = nodes;
        this.sum = sum;
    }
}
static int ans=0;
        static Pair function(node root){
            if(root == null)
                return new Pair(0,0);
            Pair left = function(root.left);
            Pair right = function(root.right);
            int totalSum = left.sum+right.sum+root.data;
            int totalCount = left.nodes+right.nodes+1;
            int avg = (int)Math.round(totalSum/totalCount);
            if(avg == root.data)
                ans+=1;
            return new Pair(totalCount,totalSum);
        }


    public static void main(String[] args) {
        node a=new node(4);
       node b=new node(8);
        node c=new node(5);
        node d=new node(0);
        node e=new node(1);
       node f=new node(6);

        a.right=c;a.left=b;
        b.left=d;b.right=e;
        c.right=f;
        node root=a;

        System.out.println(sum(root));
        System.out.println(nodes(root));
        System.out.println(averagesm(root));
        function(root);
        System.out.println(ans);

    }
}
