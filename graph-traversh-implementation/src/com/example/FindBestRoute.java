package com.example;

import java.util.ArrayList;

import com.example.GraphUtil.Edge;
import com.example.GraphUtil.EdgeWithTime;

public class FindBestRoute {

	public static void main(String[] args) {
		int v = 7;
		ArrayList<EdgeWithTime> graph[] = new ArrayList[v];
		GraphUtil.createGraphForRoute(graph);
		findAllPath(graph, 6, 0, "0", 1, "");
	}

	private static void findAllPath(ArrayList<EdgeWithTime>[] graph, int target, int current, String path,
			int rootBusNo, String prevEndTime) {
		if (current == target) {
			System.out.println(path + " ====> " + graph[0].get(0).startTime + " <==>" + prevEndTime);
		}

		for (int i = 0; i < graph[current].size(); i++) {
			EdgeWithTime edge = graph[current].get(i);
			int busNumber = edge.root;
			if (!(rootBusNo != busNumber && findTime(edge.endTime, prevEndTime) > 0)) {
				findAllPath(graph, target, edge.dest, path + " " + (edge.dest + "(" + busNumber + ")"), rootBusNo,
						edge.endTime);
			}
		}
	}

	static int findTime(String endTime, String startTime) {
		return startTime.compareTo(endTime);
	}
}
