package com.leetcode;

class IsMatchSolution {
    public boolean isMatch(String s, String p) {
        return checkForMatch(s, p, 0, 0);
    }

    private boolean checkForMatch(String s, String p, int sIndex, int pIndex) {
        if (sIndex == s.length()
                && (pIndex >= p.length() || (pIndex == p.length() - 2 && p.charAt(pIndex + 1) == '*'))) {
            return true;
        } else if (sIndex == s.length() || pIndex >= p.length()) {
            return false;
        }

        char sChar = s.charAt(sIndex);
        char pChar = p.charAt(pIndex);
        boolean nextPCharIsStar = pIndex + 1 < p.length() && p.charAt(pIndex + 1) == '*';
        if (nextPCharIsStar) {
            boolean shouldSkipPChar = checkForMatch(s, p, sIndex, pIndex + 2);
            boolean shouldKeepChar = (sChar == pChar || pChar == '.') && checkForMatch(s, p, sIndex + 1, pIndex);

            return shouldSkipPChar || shouldKeepChar;
        } else if (pChar == '.' || sChar == pChar) {
            return checkForMatch(s, p, sIndex + 1, pIndex + 1);
        } else {
            return false;
        }
    }
}
