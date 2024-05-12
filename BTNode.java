class BTNode<E> {
    BTNode left, right;
    E data;


    public BTNode() {
        left = null;
        right = null;
        data = null;
    }


    public BTNode(E item) {
        left = null;
        right = null;
        data = item;
    }


    public void setLeft(BTNode n) {
        left = n;
    }


    public void setRight(BTNode n) {
        right = n;
    }


    public BTNode getLeft() {
        return left;
    }


    public BTNode getRight() {
        return right;
    }


    public void setData(E d) {
        data = d;
    }


    public E getData() {
        return data;
    }
}
