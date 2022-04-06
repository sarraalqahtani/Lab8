// Node class for bi-directional Linked List of Cards
public class Node {

    public Card data;
    public Node next;
    public Node prev;

    public Node(){
        this.data = new Card();
        next = null;
        prev = null;
    }

    public Node(Card data){
        this.data = data;
        next = null;
        prev = null;
    }
}