package com.example;

import java.util.ArrayList;

public class GraphUtil {
	public static class Edge {
		public int src;
		public int dest;
		public int wt;

		public Edge(int s, int d, int w) {
			this.src = s;
			this.dest = d;
			this.wt = w;
		}
	}

	static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 1, 1));
		graph[0].add(new Edge(0, 2, 1));

		graph[1].add(new Edge(1, 0, 1));
		graph[1].add(new Edge(1, 3, 1));

		graph[2].add(new Edge(2, 0, 1));
		graph[2].add(new Edge(2, 4, 1));

		graph[3].add(new Edge(3, 1, 1));
		graph[3].add(new Edge(3, 4, 1));
		graph[3].add(new Edge(3, 5, 1));

		graph[4].add(new Edge(4, 2, 1));
		graph[4].add(new Edge(4, 3, 1));
		graph[4].add(new Edge(4, 5, 1));

		graph[5].add(new Edge(5, 3, 1));
		graph[5].add(new Edge(5, 4, 1));
		graph[5].add(new Edge(5, 6, 1));
		graph[5].add(new Edge(6, 5, 1));
	}
	
	public static class EdgeWithTime {
		public int src;
		public int dest;
		public int root;
		String startTime;
		String endTime;

		public EdgeWithTime(int src, int dest, int root, String startTime, String endTime) {
			super();
			this.src = src;
			this.dest = dest;
			this.root = root;
			this.startTime = startTime;
			this.endTime = endTime;
		}

	}
	
	static void createGraphForRoute(ArrayList<EdgeWithTime> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		
		/**1 3 1 09:00 09:15
		2 3 2 08:50 09:17
		2 3 3 08:50 09:17
		3 5 1 09:15 09:30
		
		3 4 2 09:17 09:45
		3 4 3 09:17 09:45
		
		4 6 2 09:45 09:47
		4 6 3 09:45 09:47
		
		5 7 1 09:17 10:00
		
		6 5 3 09:47 09:48
		6 7 2 09:47 09:50**/
		
		
		graph[0].add(new EdgeWithTime(0, 2, 1, "09:00", "09:15"));

		graph[1].add(new EdgeWithTime(1, 2, 2,"08:50","09:17"));
		graph[1].add(new EdgeWithTime(1, 2, 3,"08:50","09:17"));
		
		
		

		graph[2].add(new EdgeWithTime(2, 4, 1,"09:15","09:30"));
		graph[2].add(new EdgeWithTime(2, 3, 2,"09:17","09:45"));
		graph[2].add(new EdgeWithTime(2, 3, 3,"09:17","09:45"));

		graph[3].add(new EdgeWithTime(3, 5, 2,"09:45","09:47"));
		graph[3].add(new EdgeWithTime(3, 5, 3,"09:45","09:47"));

		graph[4].add(new EdgeWithTime(4, 6, 1,"09:17","10:00"));

		graph[5].add(new EdgeWithTime(5, 4, 1, "09:47","09:48"));
		graph[5].add(new EdgeWithTime(5, 6, 2,"09:47","09:50"));
	}
}
