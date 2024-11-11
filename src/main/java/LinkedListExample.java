  class Node {
        String name;
        int value;
        Node next;

        public Node(String name, int value) {
            this.name = name;
            this.value = value;
            this.next = null;
        }
    }

    public class LinkedListExample {
        Node head;

        // Method to add a node to the linked list
        public void addNode(String name, int value) {
            Node newNode = new Node(name, value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Method to keep only the first and last nodes and remove intermediate ones
        public void keepFirstAndLast() {
            if (head == null || head.next == null) return; // No operation if 0 or 1 node

            Node first = head; // Reference to the first node
            Node current = head;

            // Traverse to the last node
            while (current.next != null) {
                current = current.next;
            }

            Node last = current; // Reference to the last node

            // Remove intermediate nodes by linking first directly to last
            first.next = last;
        }

        // Method to print only the names of the nodes
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.println(current.name); // Only print the name
                current = current.next;
            }
        }

        public static void main(String[] args) {
            LinkedListExample list = new LinkedListExample();

            // Adding nodes
            list.addNode("Hana", 400);
            list.addNode("Cedia", 300);
            list.addNode("Ali", 200);

            System.out.println("Original List:");
            list.printList();

            // Keeping only the first and last nodes
            list.keepFirstAndLast();

            System.out.println("\nAfter Removing Intermediate Nodes:");
            list.printList();
}



}
