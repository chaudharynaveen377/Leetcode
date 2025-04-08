package LinkList.Approaches;

import java.util.HashMap;

public class Poly_LL {
    static class node{
        int coff;
        int exp;
        node next;
        node(){}
        node(int coff,int exp){
            this.exp=exp;
            this.coff=coff;
            this.next=null;
        }
    }
    static node add_poly(node head1 , node head2){
        node newnode=new node(-1,-1);
        node ans=newnode;
        while (head1!=null && head2!=null){
            if (head1.exp>head2.exp){
                node newnode1=new node(head1.coff,head1.exp);
                newnode.next=newnode1;
                newnode=newnode1;
                head1=head1.next;
                continue;
            }
            if (head2.exp>head1.exp){
                node newnode1=new node(head2.coff,head2.exp);
                newnode.next=newnode1;
                newnode=newnode1;
                head2=head2.next;
                continue;
            }
            if (head2.exp==head1.exp){
                node newnode1=new node(head2.coff+head1.coff,head2.exp);
                newnode.next=newnode1;
                newnode=newnode1;
                head1=head1.next;
                head2=head2.next;
            }
        }
        while (head1==null && head2!=null){
            node newnode1=new node(head2.coff,head2.exp);
            newnode.next=newnode1;
            newnode=newnode1;
            head2=head2.next;
        }
        while (head2==null && head1!=null){
            node newnode1=new node(head1.coff,head1.exp);
            newnode.next=newnode1;
            newnode=newnode1;
            head1=head1.next;
        }
        return ans.next;

    }
    static String String_poly(node head){
//        components of node-->[ coff , exp ]
        String str="";
        while (head!=null){
            if (head.exp!=0){
            str=str+head.coff+"x^"+head.exp + " + ";}
            else  str=str+head.coff+ " + ";
            head=head.next;
        }
        str=str.substring(0,str.length()-2);
        return str;
    }

    static node mul_poly(node head1 , node head2){
        node newnode=new node(-1,-1);
        node temp=head2;
        node ans=newnode;
       while (head1!=null){
           while (head2!=null){
               node tempNode=new node(head1.coff*head2.coff,head1.exp+ head2.exp);
               newnode.next=tempNode;
               newnode=tempNode;
               head2=head2.next;
           }
           head1=head1.next;
           head2=temp;
       }
        return ans.next;
    }
    static void disp(node head){
        while (head!=null){
            System.out.println(head.coff);
            System.out.println(head.exp);
            head=head.next;
        }
    }
    static HashMap<Integer,Integer> power_sum(node head){
        HashMap<Integer,Integer> mp=new HashMap<>();
        while (head!=null){
            if (!mp.containsKey(head.exp)){
                mp.put(head.exp,head.coff);
            }
            else {
                mp.put(head.exp, mp.get(head.exp)+ head.coff);
            }
            head=head.next;
        }
        return mp;
    }
    static node h_mp(HashMap<Integer,Integer> mp){
        node newnode=new node(-1,-1);
        node ans=newnode;
        for (int i : mp.keySet()){
            node temp=new node(mp.get(i),i);
           newnode.next=temp;
           newnode=temp;
        }
        return ans.next;
    }
    public static void main(String[] args) {
//        String s1="3x^2+5x+4";
//        String s2="4x^3+2x^2+6";
        node a=new node(3,2);
        node b=new node(5,1);
        node c=new node(4,0);
        a.next=b;b.next=c;
        node a1=new node(4,3);
        node b1=new node(2,2);
        node c1=new node(6,0);
        a1.next=b1;b1.next=c1;
        System.out.println("first (ll To poly) : "+ String_poly(a));
        System.out.println("second (ll To poly) : "+ String_poly(a1));

        System.out.println("Sum of (ll To poly) : "+String_poly(add_poly(a,a1)));
        System.out.println("MUL of (ll To poly) : "+String_poly(mul_poly(a,a1)));
        node temp=(mul_poly(a,a1));
//
//        System.out.println(String_poly(Same_pawor(temp)));
        HashMap<Integer,Integer> mp=power_sum(temp);
        System.out.println(mp);
        System.out.println(String_poly(h_mp(mp)));
    }
}
