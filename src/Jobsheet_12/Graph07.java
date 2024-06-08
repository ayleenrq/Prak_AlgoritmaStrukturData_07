package Jobsheet_12;

public class Graph07 {
    int vertex;
    DoubleLinkedList07 list07[];

    public Graph07(int v) {
        vertex = v;
        list07 = new DoubleLinkedList07[v];
        for (int i = 0; i < v; i++) {
            list07[i] = new DoubleLinkedList07();
        }
    }
    public void addEdge(int asal, int tujuan, int jarak) {
        list07[asal].addFirst(tujuan, jarak);
    }
    public void degree(int asal) throws Exception { // modified k = 0
        int k = 0, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list07[i].size(); j++) { //inDegree
                if (list07[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            for (k = 0; k < list07[asal].size(); k++) { //outDegree
                list07[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }
    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list07[asal].remove(tujuan);
            }
        }
    }
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list07[i].clear();
        } 
        System.out.println("Graf berhasil dikosongkan");
    }
    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list07[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list07[i].size(); j++) {
                    System.out.print((char) ('A' + list07[i].get(j)) + " (" + list07[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}