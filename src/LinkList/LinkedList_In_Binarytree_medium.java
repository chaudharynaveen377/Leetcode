package LinkList;

public class LinkedList_In_Binarytree_medium {
    static class listnode{
        int data;
        listnode next;
        listnode(int data){
            this.data=data;
            this.next=null;
        }

    }
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }
    static Boolean checkllinBT(listnode lroot,node troot){
        if (lroot==null){
            return true;
        }
        if (troot==null){
            return false;
        }
        if (troot.data!= lroot.data){
            return false;
        }
        boolean left=checkllinBT(lroot.next,troot.left);
        boolean right=checkllinBT(lroot.next,troot.right);
return left || right;
    }
    static Boolean isOrnot(listnode lroot,node troot){
        if (troot==null){
            return false;
        }
        if (checkllinBT(lroot,troot)==true){
            return true;
        }
      Boolean left=  isOrnot(lroot,troot.left);
      Boolean right=  isOrnot(lroot,troot.right);
        return left||right;
    }
    public static void main(String[] args) {
        node a=new node(1);
        a.left=new node(3);
        a.right=new node(2);
        a.left.left=new node(3);
        a.left.right=new  node(2);
        a.right.left=new  node(4);
        a.right.right=new  node(0);
        a.right.right.left=new  node(3);

        listnode la=new listnode(1);
      la.next=new listnode(3);
        la.next.next=new listnode(4);
      la.next.next.next=new listnode(0);

        System.out.println(isOrnot(la,a));
    }
}
