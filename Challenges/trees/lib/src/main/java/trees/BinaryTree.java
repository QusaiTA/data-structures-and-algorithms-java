package trees;

public class BinaryTree {

    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public int getHeight(Node root)
    {
        if (root == null)
            return 0;
        else {
            int leftHeight = getHeight(root.getLeftNode());
            int rightHeight = getHeight(root.getRightNode());

            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
    }
    public void printCurrentLevelNodes(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.getData() + " ");
        else if (level > 1) {
            printCurrentLevelNodes(root.getLeftNode(), level - 1);
            printCurrentLevelNodes(root.getRightNode(), level - 1);
        }
    }

    public void printLevelOrderForNodes()
    {
        int height = getHeight(root);
        for (int i = 1; i <= height; i++)
            printCurrentLevelNodes(root, i);
    }



}
