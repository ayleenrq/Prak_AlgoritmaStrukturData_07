package Jobsheet_11;

public class BinaryTree_07 {
    Node_07 root;
    int size;

    public BinaryTree_07() {
        root = null;
        size = 0;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node_07(data);
        } else {
            Node_07 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node_07(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node_07(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        Node_07 current = root;
        while (current != null) {
            if (data < current.data) {
                current = current.left;
            } else if (data > current.data) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    void traversePreOrder(Node_07 Node_07) {
        if (Node_07 != null) {
            System.out.print(Node_07.data + " ");
            traversePreOrder(Node_07.left);
            traversePreOrder(Node_07.right);
        }
    }

    void traversePostOrder(Node_07 Node_07) {
        if (Node_07 != null) {
            traversePostOrder(Node_07.left);
            traversePostOrder(Node_07.right);
            System.out.print(Node_07.data + " ");
        }
    }

    void traverseInOrder(Node_07 Node_07) {
        if (Node_07 != null) {
            traverseInOrder(Node_07.left);
            System.out.print(Node_07.data + " ");
            traverseInOrder(Node_07.right);
        }
    }

    Node_07 getSuccessor(Node_07 del) {
        Node_07 successor = del.right;
        Node_07 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        Node_07 parent = root;
        Node_07 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Node_07 not found");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node_07 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}