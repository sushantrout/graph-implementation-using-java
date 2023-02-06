package com.example;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraImplementation {
	static class Edge {
		int src;
		int dest;
		int wt;

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
		graph[0].add(new Edge(0, 1, 2));
		graph[0].add(new Edge(0, 2, 4));
		graph[1].add(new Edge(1, 3, 7));
		graph[1].add(new Edge(1, 2, 1));
		graph[2].add(new Edge(2, 4, 3));
		graph[3].add(new Edge(3, 5, 1));
		graph[4].add(new Edge(4, 3, 2));
		graph[4].add(new Edge(4, 5, 5));
	}

	static class Pair implements Comparable<Pair> {
		int n;
		int path;

		public Pair(int n, int path) {
			this.n = n;
			this.path = path;
		}

		@Override
		public int compareTo(Pair p2) {
			return this.path - p2.path;
		}
	}

	public static int[] dijkstra(ArrayList<Edge> graph[], int src) {

		int length = graph.length;
		boolean[] visitead = new boolean[length];
		Pair pair = new Pair(src, 0);
		PriorityQueue<Pair> q = new PriorityQueue<DijkstraImplementation.Pair>();
		q.add(pair);

		int[] distance = new int[length];
		for (int i = 0; i < distance.length; i++) {
			if (i != src) {
				distance[i] = Integer.MAX_VALUE;
			}
		}

		while (!q.isEmpty()) {
			Pair element = q.remove();

			if (!visitead[element.n]) {
				visitead[element.n] = true;
				
				ArrayList<Edge> adjencyList = graph[element.n];
				
				for (int i = 0; i < adjencyList.size(); i++) {
					Edge edge = adjencyList.get(i);
					int u = edge.src;
					int v = edge.dest;

					int wt = edge.wt;
					int currentDistance = distance[u] + wt;
					if (currentDistance < distance[v]) {
						distance[v] = currentDistance;
						Pair e = new Pair(v, distance[v]);
						q.add(e);
					}
				}
			}

		}

		return distance;
	}

	public static void main(String[] args) {
		int V = 6;
		ArrayList<Edge> graph[] = new ArrayList[V];
		createGraph(graph);
		int src = 0;
		int dist[] = dijkstra(graph, src);
		for (int i = 0; i < dist.length; i++) {
			System.out.println(dist[i] + " ");
		}
	}
}