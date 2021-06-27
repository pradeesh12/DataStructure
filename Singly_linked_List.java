import java.util.*;
public class Singly_linked_List {
	public LinkedNode head;
	public static class LinkedNode
	{
		public int data;
		public LinkedNode next;
		 LinkedNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void insertAtBeg(int n)
	{
		LinkedNode temp=new LinkedNode(n);
		temp.next=head;
		head=temp;		
	}
	public void insertAtEnd(int n)
	{
		LinkedNode emp=new LinkedNode(n);
		if(head==null)
		{
			head=emp;
		}
		else
		{
			LinkedNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=emp;
		}
	}
	public void insertAtMiddle(int middle, int pos) {
		LinkedNode n=new LinkedNode(middle);
		if(head==null || pos==1)
		{
			head=n;
		}		
		else
		{
			int c=1;
			LinkedNode temp=head;
			while(c<pos-1)
			{
				c++;
				temp=temp.next;
			}
			n.next=temp.next;
			temp.next=n;
		}
	}
    public LinkedNode deleteAtFirst() {
		LinkedNode temp=head;
		head=head.next;
		return temp;
	}
    public LinkedNode deleteAtLast()
    {
    	if(head==null || head.next==null)
    	{
    		return head;
    	}
    	LinkedNode temp=head;
    	LinkedNode pre=null;
    	while(temp.next!=null)
    	{
    		pre=temp;
    		temp=temp.next;
    	}
    	pre.next=null;
    	return temp;
    }
    public void deleteAtPos(int pos1) {
		if(pos1==1)
		{
			head=head.next;
		}
		else
		{
			LinkedNode temp=head;
			//LinkedNode pre=null;
			int c=1;
			while(c<pos1-1)
			{
				temp=temp.next;
				c++;
			}
			temp.next=temp.next.next;	
		}
	}
    public LinkedNode reverse() {
			LinkedNode current = head;
			LinkedNode p=null;
			LinkedNode n=null;
			while(current!=null)
			{
				n=current.next;
				current.next= p;
				p=current;
				current=n;
			}
			return p;
	}
	
	public  void display()
	{
		LinkedNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data +"->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Singly_linked_List obj=new Singly_linked_List();
			System.out.println("Enter the numbers to be instered");
			int n=sc.nextInt();
			System.out.println("Switch case to deside");
			int s=sc.nextInt();
			switch(s) 
			{
			case 1:
				System.out.println("Enter the number to be inserted at beggining");
				for(int i=0;i<n;i++)
				{
					int k=sc.nextInt();
					obj.insertAtBeg(k);
				}
				System.out.print("The inserted beginning elements are ");
				obj.display();
				break;
			case 2:
				System.out.println("Enter the number to be inserted at end");
				for(int i=0;i<n;i++)
				{
					int k=sc.nextInt();
					obj.insertAtEnd(k);
				}
				System.out.print("The inserted end elements are ");
				obj.display();
				break;
			case 3:
				System.out.println("Enter the number to be inserted at end");
				for(int i=0;i<n;i++)
				{
					int k=sc.nextInt();
					obj.insertAtEnd(k);
				}
				System.out.println("The elements before inserting");
				obj.display();
				int middle=sc.nextInt();
				int pos=sc.nextInt();
				obj.insertAtMiddle(middle,pos);
				System.out.println("The elements after inserting at the middle");
						obj.display();
				break;
			case 4:
				System.out.println("Enter the number to be inserted at end");
				for(int i=0;i<n;i++)
				{
					int k=sc.nextInt();
					obj.insertAtEnd(k);
				}
				System.out.println("The inserted end elements are ");
				obj.display();
				System.out.println("The element deleted at last is");
				System.out.print(obj.deleteAtFirst().data);
				break;
			case 5:
				System.out.println("Enter the number to be inserted at end");
				for(int i=0;i<n;i++)
				{
					int k=sc.nextInt();
					obj.insertAtEnd(k);
				}
				System.out.println("The inserted end elements are ");
				obj.display();
				System.out.println("The element deleted at Last is");
				System.out.print(obj.deleteAtLast().data);
				System.out.println("After the deletion at last node ");
				obj.display();
				break;
			case 6:
				System.out.println("Enter the number to be inserted at end");
				for(int i=0;i<n;i++)
				{
					int k=sc.nextInt();
					obj.insertAtEnd(k);
				}
				System.out.println("The inserted end elements are ");
				obj.display();
				System.out.println("Enter the element to be deleted at the position");
				int pos1=sc.nextInt();
				obj.deleteAtPos(pos1);
				System.out.println("After the deletion at Position node ");
				obj.display();
				break;
			case 7:
				System.out.println("Enter the number to be inserted at end");
				for(int i=0;i<n;i++)
				{
					int k=sc.nextInt();
					obj.insertAtEnd(k);
				}
				System.out.print("The list before reverse");
				obj.display();
				obj.head=obj.reverse();
				System.out.println("The list After reverse");
				obj.display();
				break;
			}
		}
	}
}
