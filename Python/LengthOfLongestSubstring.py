import string

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        
        seen = set()
        seen.add(s[0])
        longestSubstring = 1
        leftIndex = 0
        rightIndex = 1
        while rightIndex < len(s):
            char = s[rightIndex]
            if char in seen:
                if longestSubstring < len(seen):
                    longestSubstring = len(seen)
                    
                leftIndex = self.slideLeftSideOfWindow(s, char, seen, leftIndex)
            else :
                seen.add(char)

            rightIndex += 1


        if longestSubstring < len(seen):
            longestSubstring = len(seen)

        return longestSubstring
    
    def slideLeftSideOfWindow(self, s: string, char: any, seen: set, leftIndex: int) -> int:
        while s[leftIndex] != char:
            seen.discard(s[leftIndex])
            leftIndex += 1

        if s[leftIndex] == char:
            leftIndex += 1

        return leftIndex
        

solution = Solution()
result = solution.lengthOfLongestSubstring('abcabcbb')
print(result)
assert result == 3
result = solution.lengthOfLongestSubstring('bbbbb')
print(result)
assert result == 1
result = solution.lengthOfLongestSubstring('pwwkew')
print(result)
assert result == 3
result = solution.lengthOfLongestSubstring('au')
print(result)
assert result == 2
result = solution.lengthOfLongestSubstring('jbpnbwwd')
print(result)
assert result == 4