package com.example;

import java.util.ArrayList;

import com.example.GraphUtil.Edge;

public class DFS {
	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge> graph[] = new ArrayList[v];
		GraphUtil.createGraph(graph);
		boolean visited[] = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				dfs(graph, i, visited);
			}
		}
	}

	private static void dfs(ArrayList<Edge>[] graph, int parent, boolean[] visited) {

		visited[parent] = true;
		System.out.print(parent);

		for (int i = 0; i < graph[parent].size(); i++) {
			Edge edge = graph[parent].get(i);
			if (!visited[edge.dest]) {
				dfs(graph, edge.dest, visited);
			}
		}
	}
}
