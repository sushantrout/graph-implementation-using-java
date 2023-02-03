package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.example.GraphUtil.Edge;

public class BFS {
	public static void bfs(ArrayList<Edge> graph[], int v) {
		boolean visited[] = new boolean[v];
		Queue<Integer> q = new LinkedList<>();
		q.add(0);

		while (!q.isEmpty()) {
			Integer current = q.remove();
			if (visited[current] != true) {
				System.out.print(current+" ");
				visited[current] = true;

				for (int i = 0; i < graph[current].size(); i++) {
					Edge e = graph[current].get(i);
					q.add(e.dest);
				}
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge> graph[] = new ArrayList[v];
		GraphUtil.createGraph(graph);
		bfs(graph, v);
	}
}