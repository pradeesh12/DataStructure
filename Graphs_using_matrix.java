import java.util.*;
public class Graphs_using_matrix {

	public LinkedList<Integer>[] arr;
	//public int[][] arr;
	public int ver,edg;
	public Graphs_using_matrix(int n)
	{
		this.arr=new LinkedList[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=new LinkedList<>();
		}
		ver=n;
	}
	public void addEdges(int n1,int n2)
	{
		arr[n1].add(n2);
		arr[n2].add(n1);
		edg++;
	}
	private void bfs(int s)
	{
		boolean[] t=new boolean[ver];
		Queue<Integer> li=new LinkedList<>();
		t[s]=true;
		li.add(s);
		while(!li.isEmpty())
		{
			int num=li.poll();
			System.out.print(num+" ");
			for(int t1:arr[num])
			{
				if(!t[t1])
				{
					t[t1]=true;
					li.add(t1);
				}
			}
		}
	}
	public void dfs(int s)
	{
		Stack<Integer> li=new Stack<>();
		li.push(s);
		boolean[] b=new boolean[ver];
		while(!li.isEmpty())
		{
			int t=li.pop();
			if(!b[t])
			{
				b[t]=true;
				System.out.print(t+" ");
				for(int k:arr[t])
				{
					if(!b[k])
					{
						li.push(k);
						b[t]=true;
					}
				}
			}
		}
	}
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		sb.append("Vertics:"+ver+" : Edges:"+ edg + "\n");
		for(int i=0;i<ver;i++)
		{
			sb.append("ver"+i+": ");
			for(int j:arr[i])
			{
				sb.append(j+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in))
		{
			Graphs_using_matrix obj=new Graphs_using_matrix(5);
			obj.addEdges(0,1);
			obj.addEdges(1,2);
			obj.addEdges(2,3);
			obj.addEdges(2, 4);
			obj.addEdges(3,0);
			System.out.println(obj);
			System.out.println("Breadth first search:");
			obj.bfs(0);
			System.out.println();
			System.out.println("Depth first search:");
			obj.dfs(0);
		}
	}

}
