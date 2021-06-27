import java.util.Scanner;
public class Queues {
	public LinkedNode front;
	public LinkedNode rear;
	public int length=0;
	public class LinkedNode{
		int data;
		LinkedNode next;
		LinkedNode(int data)
		{
			this.data=data;
		}
	}
	boolean isEmpty()
	{
		if(length==0)
			return true;
		return false;
	}
	public void display() {
				if(isEmpty()) {
					System.out.println("List is Empty");
				}
				else
				{
					LinkedNode temp=front;
					while(temp!=null)
					{
						System.out.print(temp.data+"->");
						temp=temp.next;
					}
					System.out.println("null");
				}
				
	}
	public int dequeue() {
		if(isEmpty())
			return -1;
		int d=front.data;
		front=front.next;
		if(front==rear)
			rear=null;
		length--;
	 return d;
	}
	public void Enqueue(int num) {
		LinkedNode temp=new LinkedNode(num);
		if(isEmpty())
			front = temp;
		else
			rear.next=temp;
		rear=temp;
		length++;
	}

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
		Queues obj=new Queues();
	    System.out.println("Enter the number of operations to be performed");
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("1)Enqueue 2)dequeue 3)Display");
	    	int swi=sc.nextInt();
	    	switch(swi)
	    	{
	    	case 1:
	    		System.out.println("Enter the number to be inserted");
	    		int num=sc.nextInt();
	    		obj.Enqueue(num);
	    		break;
	    	case 2:
	    		int del=obj.dequeue();
	    		if(del!=-1)
	    			System.out.println("The dequeued elements are "+del);
	    		break;
	    	case 3:
	    		System.out.println("The elements in the queues are");
	    		obj.display();
	    		break;
	    	}
	    }
		}

	}
	
}
