package Jobsheet_10.DoubleLinkedList;

public class DoubleLinkedList {
    Node07 head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node07(null, item, null);
        } else {
            Node07 newNode = new Node07(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node07 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node07 newNode = new Node07(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node07 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            } 
            if (current.prev == null) {
                Node07 newNode = new Node07(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node07 newNode = new Node07(current.prev, item, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        size = 0;
    }
    public void print() {
        if (!isEmpty()) {
            Node07 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}