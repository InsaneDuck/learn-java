package basic;

public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public static <T> void printAllNode(Node<T> head){
        while (head!=null){
            System.out.println(head.getData());
            head = head.getNext();
        }
        System.out.println("END");
    }

    public static <T> Node<T> removeMiddleNode(Node<T> head){
        if(head==null || head.getNext()==null){
            return head;
        }

        Node<T> doubleJump = head;
        Node<T> singleJump = head;

        Node<T> previous = null;

        while (doubleJump!=null && doubleJump.getNext()!=null){
            doubleJump = doubleJump.getNext().getNext();
            previous = singleJump;
            singleJump = singleJump.getNext();
        }

        previous.setNext(singleJump.getNext());

        return head;
    }
}
