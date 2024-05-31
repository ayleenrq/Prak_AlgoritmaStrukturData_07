package Jobsheet_11;

public class BinaryTreeArray_07 {
    int[] data;
    int idxLast;

    public BinaryTreeArray_07() {
        data = new int[10];
    }

    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idx) {
        if (idx <= idxLast) {
            traverseInOrder(2 * idx + 1);
            System.out.print(data[idx] + " ");
            traverseInOrder(2 * idx + 2);
        }
    }
}