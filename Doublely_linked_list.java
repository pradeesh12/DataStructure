import java.util.*;
public class Doublely_linked_list {
	public LinkedNode head;
	public LinkedNode tail;
	public int length;
	public  class LinkedNode
	{
		int data ;
		public LinkedNode next;
		public LinkedNode pre;
		LinkedNode(int data)
		{
			this.data=data;
		}
	}
	public Doublely_linked_list()
	{
		  this.head=null;
		 this.tail=null;
		 this.length=0;
	}
	boolean isEmpty()
	{
		if(length==0)
			return true;
		return false;
	}
	public void insertAtFirst(int d)
	{
		LinkedNode n=new LinkedNode(d);
		if(isEmpty())
		{
			tail=n;
		}
		else
		{
			head.pre=n;
		}
		n.next=head;
		head=n;
	}
	public void displayf()
	{
		LinkedNode temp=head;
		System.out.println("Values of the List in forward");
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
	public void displayl()
	{
		LinkedNode temp1=tail;
		System.out.println("Values of the List in reverse");
		if(tail==null)
			return;
		while(temp1!=null)
		{
			System.out.print(temp1.data+"->");
			temp1=temp1.pre;
		}
		System.out.println("null");
	}
	
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			Doublely_linked_list obj=new Doublely_linked_list();
			System.out.println("Enter the number of values to be inserted ");
			int n=sc.nextInt();
			System.out.print("Enter the switch statemrnt value");
			int swi=sc.nextInt();
			switch(swi)
			{
			case 1:
				for(int i=0;i<n;i++)
				{
					int k=sc.nextInt();
					obj.insertAtFirst(k);
				}
				System.out.println("The inserted values are");
				obj.displayf();
				obj.displayl();
			}
		}
	}
	
	
}
