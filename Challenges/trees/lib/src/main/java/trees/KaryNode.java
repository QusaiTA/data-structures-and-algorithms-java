package trees;

import java.util.ArrayList;
import java.util.List;

public class KaryNode<T> {

    T data;
    List<KaryNode<T>> children = new ArrayList<>();

    public KaryNode(T data) {
        this.data = data;
    }

    public List<KaryNode<T>> getChildren() {
        return children;
    }

    public void addChild(KaryNode<T> newNode){
        this.children.add(newNode);
    }
}
