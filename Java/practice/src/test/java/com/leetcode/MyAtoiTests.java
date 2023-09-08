package com.leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyAtoiTests {
    @Test
    public void RunTests() {
        System.out.println("started: MyAtoiTests");
        MyAtoiSolution solution = new MyAtoiSolution();
        // assertTrue(RunTest(solution, "42", 42));
        // assertTrue(RunTest(solution, "    -42", -42));
        // assertTrue(RunTest(solution, "4193 with words", 4193));
        assertTrue(RunTest(solution, "-91283472332", -2147483648));

        System.out.println("successfully finished: MyAtoiTests");
    }

    private boolean RunTest(MyAtoiSolution solution, String s, int expected) {
        int response = solution.myAtoi(s);
        String newLine = "\n";
        boolean success = expected == response;
        if (!success) {
            System.out.println("success: " + success
                    + newLine + "s: " + s
                    + newLine + "expected: " + expected
                    + newLine + "response: " + response
                    + newLine);
        }

        return success;
    }
}
