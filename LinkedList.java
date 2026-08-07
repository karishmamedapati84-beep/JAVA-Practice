class Node {
    int data;
    Node next;
    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // Delete a value
    void delete(int key) {

        Node temp = head;
        Node prev = null;

        // If head node holds the key
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key not found
        if (temp == null)
            return;

        prev.next = temp.next;
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
         list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List:");
        list.display();

        list.delete(20);

        System.out.println("After Deletion:");
        list.display();
    }
}
