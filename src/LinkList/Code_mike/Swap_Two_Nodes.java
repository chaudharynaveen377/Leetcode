package LinkList.Code_mike;

public class Swap_Two_Nodes {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
        node(){}
    }
    static node swap(node head,node lt,node rt){
        node ans=head;
        node preH1=null;
        node H1=null;

        while (head.next!=lt){
            head=head.next;
        }
        preH1=head;
        H1=head.next;

        while (head.next!=rt){
            head=head.next;
        }

        node preH2 = head;
       node H2=head.next;
       node postH2=H2.next;
        if (lt.next==rt){
            preH1.next=H2;
            H1.next=H2.next;
            H2.next=H1;
            return ans;
        }

       preH1.next=H2;
       H2.next=H1.next;
       H1.next=postH2;
       preH2.next=H1;

        return ans;
    }
    static void disp(node root){
        while (root!=null){
            System.out.println(root.data);
            root=root.next;
        }
}
static int size(node head){
        int count=0;
        while (head!=null){
            count=count+1;
            head=head.next;
        }
        return count;
}
static node start(node head,int k){
        while (k!=0){
            head=head.next;
            k--;
        }
        return head;
}
static node end(node head,int k){
    while (k!=0){
        head=head.next;
        k--;
    }
    return head;
}
    public static void main(String[] args) {
//        [7,9,6,6,7,8,3,0,9,5]
        node ext=new node(-1);
        node a=new node(7);ext.next=a;
        a.next=new node(9);
        a.next.next=new node(6);
        a.next.next.next=new node(6);
        a.next.next.next.next=new node(7);
        a.next.next.next.next.next=new node(8);
        a.next.next.next.next.next.next=new node(3);
        a.next.next.next.next.next.next.next=new node(0);
        a.next.next.next.next.next.next.next.next=new node(9);
        a.next.next.next.next.next.next.next.next.next=new node(5);
//

        System.out.println(start(ext,4).data);
        System.out.println(end(ext,size(ext)-5).data);
        disp(  swap( ext,start(ext,5),end(ext,size(ext)-5)));
    }
}
