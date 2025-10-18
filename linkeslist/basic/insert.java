package linkeslist.basic;  // adjust this to match your folder

public class insert {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("okay");
         list.printList();
    }
}

class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }


  public void addLast(String data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        return;
    }

    Node currNode = head;
    while (currNode.next != null) {
        currNode = currNode.next;
    }

    currNode.next = newNode;
}
public void deletelast(){
   
    if(head == null){
        System.out.println("node is empty");
        return;
    }
    if (head.next == null) {
        head = null;
        return;
    }
    
 Node secondlast = head;
    Node lastnode = head.next;
        while (lastnode.next != null) {
            secondlast = secondlast.next;
            lastnode = lastnode.next;
        }
        secondlast.next = null;
}
}
