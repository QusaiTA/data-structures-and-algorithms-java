package app;

public class Main {

    public static void main(String[] args) {
        Graph<String> myGraph = new Graph<>();
//        System.out.println(myGraph.addNode("loai"));
//        System.out.println(myGraph.addNode("qusai"));
//        myGraph.addEdge("loai" , "qusai" , 1);
//        System.out.println(myGraph);
//        System.out.println(myGraph.getNodes());
//        System.out.println(myGraph.getNeighbours("loai"));

//        myGraph.addNode("loai");
//        myGraph.addNode("qusai");
//        myGraph.addNode("mohammad");
//        myGraph.addNode("testBusinessTrip");
//        myGraph.addEdge("loai" , "qusai" , 1);
//        myGraph.addEdge("loai" , "mohammad" , 2);
//        myGraph.addEdge("mohammad" , "loai" , 1);
//        myGraph.addEdge("qusai","testBusinessTrip",1);
//        myGraph.addEdge("mohammad","testBusinessTrip",1);
//        myGraph.addEdge("qusai" , "loai" , 2);
//        System.out.println(myGraph.BFV("loai"));
//
//        String[] arr = {"qusai","testBusinessTrip","mohammad"};
//        String cost =  myGraph.businessTrip(arr);
//        System.out.println(myGraph);
//        System.out.println(cost);

        myGraph.addNode("loai");
        myGraph.addNode("qusai");
        myGraph.addNode("mohammad");
        myGraph.addEdge("loai" , "qusai" , 10);
        myGraph.addEdge("loai" , "mohammad" , 15);
        myGraph.addEdge("qusai" , "mohammad" , 2);
        System.out.println(myGraph.depthFirst("loai"));

    }
}
