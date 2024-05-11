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
        Node07 temp = head;
        
        if (!isEmpty()) {
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
            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                temp.next = new Node07(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            } else {
                System.out.println("Index melebihi batas linked list");
            }
        }
    }
    int getData(int index) {
        Node07 tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }
    int indexOf(int key) {
        Node07 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return index;
        } else {
            return -1;
        }
    }
    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node07 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }
    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            Node07 tmp = head;
            while (tmp != null) {
                if (tmp.data == key && tmp == head) {
                    removeFirst();
                    break;
                } else if (tmp.next.data == key){
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }
    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node07 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if (tmp.next == null) {
                tail = tmp;
            }
        }
    }
}