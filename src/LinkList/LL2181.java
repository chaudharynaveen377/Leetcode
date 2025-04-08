package LinkList;

public class LL2181 {
    static class node{
        int data;
        node next;
        node(){

        }
        node(int data){
            this.data=data;
        }
    }
//    [0,3,1,0,4,5,2,0]
    public static void main(String[] args) {
        node a=new node(0);
        node b=new node(3);
        node c=new node(1);
        node d=new node(0);
        node e=new node(4);
        node f=new node(5);
        node g=new node(2);
        node h=new node(9);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=f;f.next=g;g.next=h;
        node head=a;
        node ans=new node();
        node temp=ans;
        int sum=0;
        while(head!=null){
            if (head.data!=0){
                sum=sum+head.data;
            }
            else {
                if (sum!=0) {
                    node newl = new node(sum);
                    ans.next = newl;
                    ans = ans.next;
                    sum = 0;
                }
            }
            head=head.next;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
