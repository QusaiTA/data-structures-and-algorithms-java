package app;

public class Main {

    public static void main(String[] args) {
        Graph<String> myGraph = new Graph<>();
        System.out.println(myGraph.addNode("loai"));
        System.out.println(myGraph.addNode("qusai"));
        myGraph.addEdge("loai" , "qusai" , 1);
        System.out.println(myGraph);
        System.out.println(myGraph.getNodes());
        System.out.println(myGraph.getNeighbours("loai"));

    }
}
