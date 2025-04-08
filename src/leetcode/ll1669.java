package leetcode;

public class ll1669 {
    static class node{
        int data ;
        node next;
        node(){
        }
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node a=new node(0);
        node b=new node(1);
        node c=new node(2);
        node d=new node(3);
        node e=new node(4);
        node f=new node(5);
        node g=new node(6);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=f;f.next=g;
        node p=new node(1000);
        node q=new node(1001);
        node r=new node(1002);
        node s=new node(1003);
        node t=new node(1004);
        p.next=q;q.next=r;r.next=s;s.next=t;

        node head1=a;
        node p1=a;
        node head2=p;
        int ad1=2;
        int ad2=3;
        int i=0;
//        run a seperate pointer of tail of lest1 for attechment of list2 tail
        while (head1.next!=null){
            if (i-1<ad2){
                p1=p1.next;
            }
            if (i+1==ad1){
                head1.next=head2;
            }
            head1=head1.next;
            i++;
        }
        head1.next=p1;
        while(a!=null){
            System.out.println(a.data);
            a=a.next;

        }
    }
}
