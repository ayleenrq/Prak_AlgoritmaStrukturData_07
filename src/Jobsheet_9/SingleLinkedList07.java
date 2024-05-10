package Jobsheet_9;

public class SingleLinkedList07 {
    Node07 head, tail;

    boolean isEmpty() {
        return head == null;
    }
    void print() {
        if (!isEmpty()) {
            Node07 tmp = head;
            System.out.print("Isi Linked List :\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            } System.out.println(" ");
        } else {
            System.out.println("Linked List kosong");
        }
    }
    void addFirst(int input) {
        Node07 ndInput = new Node07(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    void addLast(int input) {
        Node07 ndInput = new Node07(input, null);
        if (isEmpty()) {
            tail.next = ndInput;
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    void insertAfter(int key, int input) {
        Node07 ndInput = new Node07(input, null);
        
        if (!isEmpty()) {
            Node07 temp = head;
            do {
                if (temp.data == key) {
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if (ndInput.next == null) {
                        tail = ndInput;
                    } break;
                }
                temp = temp.next;
            } while (temp != null);
        } else {
            System.out.println("Linked List kosong");
        }
    }
    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node07 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node07(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}