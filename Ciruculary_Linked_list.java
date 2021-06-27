import java.util.*;
public class Ciruculary_Linked_list {
	public LinkedNode head;
	class LinkedNode{
		public LinkedNode(int k) {
			data=k;
		}
		int data;
		LinkedNode next;
	}
	public void display() {
		LinkedNode temp=head.next;
		while(temp!=head)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print(head.data);
		System.out.print("->null");
	}

	public  void insertAtFirst(int k) {
		// TODO Auto-generated method stub
		LinkedNode t=new LinkedNode(k);
		if(head==null)
		{
			head=t;
		}
		else
		{
			t.next=head.next;
		}
		head.next=t;
		
	}
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			Ciruculary_Linked_list obj=new Ciruculary_Linked_list();
			for(int i=0;i<n;i++)
			{
				int k=sc.nextInt();
				obj.insertAtFirst(k);
			}
			obj.display();
		}
	}

	
}
