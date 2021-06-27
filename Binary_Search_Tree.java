import java.util.*;
public class Binary_Search_Tree
{
	public Nodes root;
	public class Nodes
	{
		public int data;
		public Nodes left;
		public Nodes right;
		public Nodes(int data)
		{
			this.data=data;
		}
	}
	public Nodes insert(int data,Nodes root) 
	{
		if(root==null)
		{
			root=new Nodes(data);
			return root;
		}
		if(root.data>data)
			root.left=insert(data,root.left);
		else
			root.right=insert(data,root.right);
		return root;
	}
	public void InOrder(Nodes root)
	{
		//System.out.print(false);
		if(root==null)
				return;
		InOrder(root.left);
		System.out.print(root.data+" ");
		InOrder(root.right);
	}
	public Nodes search(int key,Nodes root)
	{
		if(root == null || root.data==key)
		{
			return root;
		}
		if(key<root.data)
		{
			return search(key,root.left);
		}
		else
		{
			return search(key,root.right);
		}
	}
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			Binary_Search_Tree obj =new Binary_Search_Tree();
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				obj.root=obj.insert((1+i),obj.root);
			}
			int key=4;
			if(obj.search(key,obj.root)!=null)
			{
				System.out.print("Key found");
			}
			else
			{
				System.out.println("Key not found");
			}
				
			obj.InOrder(obj.root);
		}
	}
}
