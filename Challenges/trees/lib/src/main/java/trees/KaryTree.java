package trees;

import org.checkerframework.checker.units.qual.K;

import java.util.LinkedList;
import java.util.Queue;

public class KaryTree<T> {

    KaryNode<T> root;
    int K;

    public KaryTree(int maxChild){
        if(maxChild <= 1){
            maxChild = 2;
        }
        this.K = maxChild;
    }

    public void add(T data){
        KaryNode<T> node = new KaryNode<>(data);
        if(this.root == null){
            this.root = node;
            return;
        }
        Queue<KaryNode<T>> karyNodeQueue = new LinkedList<>();
        karyNodeQueue.add(root);
        while (!karyNodeQueue.isEmpty()){
            KaryNode<T> currentNode = karyNodeQueue.poll();
            if(currentNode.children.size() < this.K){
                currentNode.addChild(node);
                return;
            } else {
                karyNodeQueue.addAll(currentNode.children);
            }
        }


    }



}
