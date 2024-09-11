package com.example.LeetCode.L207_CourseSchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// https://leetcode.com/problems/course-schedule/description/

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < prerequisites.length; i++) {
            if (map.containsKey(prerequisites[i][0])) {
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            } else {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(prerequisites[i][1]);
                map.put(prerequisites[i][0], tmp);
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if (!dps(prerequisites, new HashSet<>(), map, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dps(int[][] prerequisites, Set<Integer> visited, Map<Integer, List<Integer>> map, int curr) {
        if (visited.contains(curr)) {
            return false;
        }
        if (map.get(curr) == null || map.get(curr).size() == 0) {
            return true;
        }
        visited.add(curr);
        for (Integer i : map.get(curr)) {
            if (!dps(prerequisites, visited, map, i)) {
                return false;
            }
        }
        visited.remove(curr);
        return true;
    }

    public boolean canFinishOptimized(int n, int[][] prerequisites) {
        @SuppressWarnings("unchecked")
        List<Integer>[] adj = new List[n];
        int[] indegree = new int[n];
        List<Integer> ans = new ArrayList<>();

        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prerequisite = pair[1];
            if (adj[prerequisite] == null) {
                adj[prerequisite] = new ArrayList<>();
            }
            adj[prerequisite].add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            ans.add(current);

            if (adj[current] != null) {
                for (int next : adj[current]) {
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }
        }

        return ans.size() == n;
    }

    public boolean canFinishFurtherOptimized(int numCourses, int[][] prerequisites) {
        int[] indeg = new int[numCourses];
        int p = prerequisites.length;
        for (int[] arr : prerequisites) {
            indeg[arr[1]]++;
        }

        boolean[] visited = new boolean[p];

        boolean found = true;

        while (found) {
            found = false;
            for (int i = 0; i < p; i++) {
                if (!visited[i] && indeg[prerequisites[i][0]] == 0) {
                    visited[i] = true;
                    indeg[prerequisites[i][1]]--;
                    found = true;
                }
            }
        }

        for (int ele : indeg) {
            if (ele != 0) {
                return false;
            }
        }
        return true;
    }
}
