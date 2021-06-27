//import java.util.*;
public class PreOrderRec
	{
		public TreeNode root;
		class TreeNode
		{
			public TreeNode left;
			public TreeNode right;
			public int data;
			public TreeNode(int data)
			{
				this.data=data;
			}
		}
		public void Node()
		{
			TreeNode first=new TreeNode(1);
			TreeNode second=new TreeNode(2);
			TreeNode three=new TreeNode(3);
			TreeNode four=new TreeNode(4);
			TreeNode five=new TreeNode(5);
			TreeNode sixth=new TreeNode(6);
			root=first;
			first.left=second;
			first.right=sixth;
			second.right=three;
			second.left=four;
			sixth.right=five;			
		}
		public void PreOrder(TreeNode root)
		{
			if(root==null)
			{
				return;
			}
			System.out.print(root.data+" ");
			PreOrder(root.left);
			PreOrder(root.right);
		}
	/*	public void PreOrder(TreeNode root)
		{
			if(root==null)
			{
				return;
			}
			Stack<TreeNode> s=new Stack<>();
			
		}*/
		public static void main(String[] args) {
		PreOrderRec obj=new PreOrderRec();
		obj.Node();
		obj.PreOrder(obj.root);
	}
}