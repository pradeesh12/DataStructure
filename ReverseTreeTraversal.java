import java.util.LinkedList;
import java.util.Queue;
public class ReverseTreeTraversal {
    static class Node{
        String name;
        int id;
        Node right,left;
        Node(String name,int id){
            this.name = name;
            this.id = id;
        }
    }
    static LinkedList<Node> list = new LinkedList<>();
    static void traverse(Node root){
        if(root==null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node n = queue.poll();
            list.add(n);
            Node right = n.right;
            Node left = n.left;
            if(right!=null)
                queue.add(right);
            if(left!=null)
                queue.add(left);
        }
    }

    public static void main(String[] args) {
        Node root = new Node("E",1);
        root.left = new Node("E",2);
        root.right = new Node("E",3);
        root.left.left = new Node("E",4);
        root.left.right = new Node("E",5);
        root.left.right.left = new Node("E",6);
        root.right.left = new Node("E",7);
        root.right.left.right = new Node("E",8);
        traverse(root);
        while(!list.isEmpty()){
            Node n = list.removeLast();
            System.out.println(n.name+""+n.id+" ");
        }
    }
}