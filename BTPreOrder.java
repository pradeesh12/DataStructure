
public class BTPreOrder {
	public TreeNode root;
	public  class TreeNode{
		public int data;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(int data)
		{
			this.data=data;
		}
	}
	public void CreateBinaryTree()
	{
		TreeNode f=new TreeNode(1);
		TreeNode s=new TreeNode(2);
		TreeNode t=new TreeNode(3);
		TreeNode fo=new TreeNode(4);
		TreeNode fi=new TreeNode(5);
		root=f;
		f.left=s;
		f.right=t;
		s.left=fo;
		s.right=fi;
	}
	public void PreOrder(TreeNode root)
	{
		if(root==null)
				return;
		System.out.print(root.data+" ");
		PreOrder(root.left);
		PreOrder(root.right);
	}
/*	public void PreOrderIterative()
	{
	 if(root==null)
		 return;
	 Stack<TreeNode> s=new Stack<>();
	 s.push(root);
	 while(!s.isEmpty())
	 {
		 TreeNode t=s.pop();
		 System.out.print(t.data+" ");
		 if(t.right!=null)
			 s.push(t.right);
		 if(t.left!=null)
			 s.push(t.left);
	 }
	 
	}*/
	public static void main(String[] args) {
		BTPreOrder obj=new BTPreOrder();
		obj.CreateBinaryTree();
		obj.PreOrder(obj.root);
		//obj.PreOrderIterative();
		
	}

}
