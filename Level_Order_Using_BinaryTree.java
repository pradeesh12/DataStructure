import java.util.*;
public class Level_Order_Using_BinaryTree 
{
	public TreeNodes root;
	public class TreeNodes
	{
		public int data;
		public TreeNodes left;
		public TreeNodes right;
		public TreeNodes(int data)
		{
			this.data=data;
		}
	}
	public void inserting_value()
	{
		TreeNodes f1=new TreeNodes(1);
		TreeNodes f2=new TreeNodes(2);
		TreeNodes f3=new TreeNodes(3);
		TreeNodes f4=new TreeNodes(4);
		TreeNodes f5=new TreeNodes(5);
		TreeNodes f6=new TreeNodes(6);
		TreeNodes f7=new TreeNodes(7);
		TreeNodes f8=new TreeNodes(8);
		TreeNodes f9=new TreeNodes(9);
		root=f1;
		f1.left=f2;
		f1.right=f3;
		f2.left=f4;
		f2.right=f5;
		f3.left=f6;
		f3.right=f7;
		f4.left=f8;
		f6.left=f9;
	}
	static LinkedList<TreeNodes> list=new LinkedList<TreeNodes>();
	public void level(TreeNodes root)
	{
		if(root==null)
			return;
		Queue<TreeNodes> li=new LinkedList<TreeNodes>();
		li.offer(root);
		while(!li.isEmpty())
		{
			TreeNodes temp=li.poll();
			list.add(temp);
			System.out.print(temp.data+" ");
			if(temp.left!=null)
			{
				li.offer(temp.left);
			}
			if(temp.right!=null)
			{
				li.offer(temp.right);
			}
		}
	}
	public static void main(String[] args) 
	{
		Level_Order_Using_BinaryTree obj=new Level_Order_Using_BinaryTree();
		obj.inserting_value();
		System.out.println("Level order:");
		obj.level(obj.root);
		System.out.println();
		System.out.println("Level order in reverse Order:");
		while(!list.isEmpty())
		{
			System.out.print(list.removeLast().data+" ");
		}
	}
}
