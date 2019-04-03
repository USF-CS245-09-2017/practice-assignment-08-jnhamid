public class BSTnode<T> {
    Comparable<T> data;
    BSTnode<T> left;
    BSTnode<T> right;

    public BSTnode(Comparable<T> data) {
        this.data = data;
    }

    public Comparable<T> getData() {
        return data;
    }

    public void setData(Comparable<T> data) {
        this.data = data;
    }

    public BSTnode<T> getLeft() {
        return left;
    }

    public void setLeft(BSTnode<T> left) {
        this.left = left;
    }

    public BSTnode<T> getRight() {
        return right;
    }

    public void setRight(BSTnode<T> right) {
        this.right = right;

    }


}
