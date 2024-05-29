package dsa.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	private int v;
	private int e;
	private int[][] adjMatrix;
	public Graph(int v) {
		this.v=v;
		this.e=0;
		this.adjMatrix=new int[v][v];
	}
	
	public void addEdge(int u,int v) {
		adjMatrix[u][v]=1;
		adjMatrix[v][u]=1;
		e++;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Vertices : "+v+", Edges : "+e+"\n");
		for(int i=0;i<v;i++) {
			sb.append(i+" : ");
			for(int w:adjMatrix[i])
				sb.append(w+" ");
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public ArrayList<Integer> bfsTraversal(int v,ArrayList<ArrayList<Integer>> adj){
		ArrayList<Integer> bfs=new ArrayList<>();
		int[] visited= {0};
		Queue<Integer> q=new LinkedList<>();
		q.add(0);
		visited[0]=1;
		while(!q.isEmpty()) {
			int node=q.poll();
			bfs.add(node);
			
			for(Integer it:adj.get(node)) {
				if(visited[it]!=0)
					visited[it]=1;
				q.add(it);
			}
		}
		return bfs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph g=new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		
		System.out.println(g.toString());
	}

}
