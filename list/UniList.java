//Unidirection linked list
public class UniList{
    Node node;
    UniList(){
        node=new Node(null,null);
    }
    //add
    //remove
    //find
    static class Node{
        Object element;
        Node next;
        //constructor
        Node(Object element, Node next){
            this.element=element;
            this.next=next;
        }
    }
}