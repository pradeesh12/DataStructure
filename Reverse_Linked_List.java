import java.util.*;
public class Reverse_Linked_List {
	Node head=null;
	class Node{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public void append(int num)
	{
		Node fir=new Node(num);
		fir.next=null;
		Node temp=head;
		if(head==null)
		{
			head=fir;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=fir;			
		}
	}
	public void reverseLinkedList1()
	{
		Node current=head;
		Node pre=null;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=pre;
			pre=current;
			current=next;
		}
		head=pre;
	}
	public void printStatement()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Reverse_Linked_List obj=new Reverse_Linked_List();
			System.out.println("Enter the number of elements to be instered");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				int num=sc.nextInt();
				obj.append(num);
			}
			obj.printStatement();
			System.out.println("Before Reversing the Linked List");
			obj.printStatement();
			System.out.println("After Reversing the Linked List");
			obj.reverseLinkedList1();
			obj.printStatement();

			
		}
		
		  

	}

}
