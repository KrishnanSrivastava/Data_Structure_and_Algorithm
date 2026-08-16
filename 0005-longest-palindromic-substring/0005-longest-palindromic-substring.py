class Solution:
    def longestPalindrome(self, s: str) -> str:
        start , end = 0,0
        for i in range(len(s)):
            len1 = self.checkpali(s,i,i)
            len2 = self.checkpali(s,i,i+1)

            size = max(len1,len2)
            if (size > (end - start + 1)):
                end = i + (size  // 2)
                start = i - ((size - 1) // 2)
        return s[start:end+1]

    def checkpali(self, s, i, j) -> int:
        while((i >= 0) and (j < len(s)) and(s[i] == s[j])):
            i -= 1
            j += 1
        return j - i - 1
