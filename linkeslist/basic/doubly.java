package linkeslist.basic;

public class doubly {
    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        list.addFirst("not");
        list.addFirst("is");
        list.addFirst("data");
        list.print();

        list.addLast("fully");
        list.print();

        list.deleteFirst();
        list.deleteLast();
        list.addFirst("something");
        list.print();

    }
}

class DoubleLL {
    Node head;
    Node tail;

    class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    DoubleLL() {
        head = null;
        tail = null;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void print() {

        if (head == null) {
            System.out.print("the list is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
    }
     public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
           return;
        }
         Node currNode = head;
         Node secondCurr = head.next;
        while (secondCurr.next != null) {
            currNode = currNode.next;
            secondCurr = secondCurr.next;
        }
        currNode.next = null;
         tail = currNode;
    }
}
