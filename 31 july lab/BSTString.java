import java.util.Scanner;
public class BSTString {
    public class Node {
        String data;
        Node left;
        Node right;

        Node(String name) {
            this.data = name;
        }
    }

    public Node insert(Node root, String val) {
        if (root == null) {
            Node nn = new Node(val);
            return nn;
        }
        char a1=0, b1=0;
        //first find the min length out of two strings
        int min = Math.min(val.length(),root.data.length());
        for (int i = 0; i < min; i++) {
            a1 = root.data.charAt(i);  // string of any node in our BST
            b1 = val.charAt(i);
            if (a1 != b1) // If any character of strings was different, then it will break 
                break;

        }

        if (a1 < b1)
            root.right = insert(root.right, val);
        else root.left = insert(root.left, val);
        return root;

    }
    public void Inorder(Node root){
        if(root==null)
            return;
        Inorder(root.left);
        System.out.print(root.data+" < ");
        Inorder(root.right);
    }
        public static void main(String agrs[]){
            Node root=null;
            BSTString obj=new BSTString();
            Scanner sc=new Scanner(System.in);
            System.out.println("how many names you want to enter");
            int n=sc.nextInt();
            sc.nextLine();
            String[] names=new String[n];
            System.out.println("Enter names");
            for(int i=0;i<names.length;i++){
                names[i]=sc.nextLine();
               root=obj.insert(root,names[i]);
            }
            obj.Inorder(root);
        }

}
