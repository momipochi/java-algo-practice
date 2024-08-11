package com.example.LeetCode.L207_CourseSchedule;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CourseScheduleTest {
    @Test
    public void testCanFinish() {
        CourseSchedule cs = new CourseSchedule();
        int course = 2;
        int[][] req = new int[][] { { 1, 0 }, { 0, 1 } };
        assertTrue(!cs.canFinishFurtherOptimized(course, req));
    }
}
