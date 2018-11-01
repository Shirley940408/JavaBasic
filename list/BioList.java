public class BioList{
    Node node;
    UniList(){
        node=new Node(null,null,null);
    }
    static class Node{
        Node pre;
        Object obj;
        Node next;
            //constructor
            Node(Node pre, Object element, Node next){
                this.pre=pre;
                this.element=element;
                this.next=next;
            }
    }
}