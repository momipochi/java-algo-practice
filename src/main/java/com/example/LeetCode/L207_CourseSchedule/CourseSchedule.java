package com.example.LeetCode.L207_CourseSchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

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
        int length = prerequisites.length;
        int[] req = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            req[prerequisites[i][0]]++;
        }
        boolean run = true;
        boolean[] visited = new boolean[length];
        while(run) {
            run = false;
            for (int i = 0; i < length; i++) {
                if(!visited[i] && req[prerequisites[i][1]] == 0){
                    visited[i] = true;
                    req[prerequisites[i][0]]--;
                    run = true;
                }
            }
        }
        for (int i = 0; i < req.length; i++) {
            if(req[i] != 0){
                return false;
            }
        }
        return true;
    }
}
