class Node{
    int data;
    int next;
    Node(int data){
        this.data=data;
        this.next=next;
    }
}
public class LinkedList{
    public static void main(String[] args) {
        Node first=new node(10);
        Node second=new node(20);
        first.next=Second;
        Second.next=null;
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}