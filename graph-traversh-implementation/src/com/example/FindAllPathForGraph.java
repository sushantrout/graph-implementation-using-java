package com.example;

import java.util.ArrayList;

import com.example.GraphUtil.Edge;

public class FindAllPathForGraph {
	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge> graph[] = new ArrayList[v];
		GraphUtil.createGraph(graph);
		boolean visited[] = new boolean[v];
		findAllPath(graph, visited, 5, 0, "0");
	}

	private static void findAllPath(ArrayList<Edge>[] graph, boolean[] visited, int target, int current, String path) {
		if (current == target) {
			System.out.println(path);
			return;
		}

		for (int i = 0; i < graph[current].size(); i++) {

			Edge edge = graph[current].get(i);
			if (!visited[current]) {
				visited[current] = true;
				findAllPath(graph, visited, target, edge.dest, path + " " + edge.dest);
				visited[current] = false;
			}
		}
	}
}
