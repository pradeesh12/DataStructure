import java.util.*;
public class Stacks {
	public LinkedNode top;
	public int length=0;
	class LinkedNode {
		public int data;
		public LinkedNode next;
		public LinkedNode(int data)
		{
			this.data=data;
		}
	}
	Stacks()
	{
		top=null;
		length=0;
	}
	boolean isEmpty()
	{
		if(length==0)
			return true;
		return false;
	}
	public  void display() {
		LinkedNode temp=top;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public  int peek() {
		if(isEmpty())
		{
			System.out.println("The Stack is Empty");
			return -1;
		}
		int data=top.data;
		return data;
	}
	public  int pop() {
		if(isEmpty())
		{
			System.out.println("The Stack is Empty");
			return -1;
		}
		int data=top.data;
		top=top.next;
		length--;
		return data;
	}
	public void Push(int num) {
		LinkedNode n=new LinkedNode(num);
		n.next=top;
		top=n;
		length++;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Stacks obj=new Stacks();
			System.out.println("Enter the numbers digits to be inserted");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter the switch operations");
				System.out.println("1)Push 2)Pop 3)Peek 4)Display");
				int swi=sc.nextInt();
				switch(swi)
				{
					case 1:System.out.println("Enter the number to be inserted");
						   int num=sc.nextInt();
						   obj.Push(num);
						   System.out.println("The value inserted succesfully");
						   break;
					case 2:int k=obj.pop();
					if(k!=-1)
							System.out.println("The popped elements is"+k);
							break;
					case 3:int k1=obj.peek();
					if(k1!=-1)
							System.out.println("The peeked element is"+k1);
							break;
					case 4:System.out.println("The element in the stack are");
							obj.display();
							break;
				}
			}
		}
	}
	

}
