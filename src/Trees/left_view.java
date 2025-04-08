package Trees;

public class left_view {
    static class node{
        int data;
        node left;
        node right;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }
    static void LeftView(node root,int x,int y){
        if (root==null){
            return;
        }
        if (y==0){
            System.out.println(root.data);
        }
        if (x>0){
            System.out.println(root.data);
        }
        LeftView(root.left,x+1,y+1);
        LeftView(root.right,x-1,y+1);
    }
    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(2);
        a.right=new node(3);
        a.left.left=new node(4);
        a.left.right=new node(5);
        a.right.left=new node(6);
        a.right.right=new node(7);
        node root=a;
        LeftView(root,0,0);
    }
}
