class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        i = 0
        j = len(s)-1
        while i < j:
            if ((s[i].isalpha() and s[j].isalpha()) or (s[i].isnumeric() and s[j].isnumeric())):
                if (s[i] != s[j]) :
                    return False
                else:
                    i += 1
                    j -= 1

            if ((s[i].isalpha() and s[j].isnumeric()) or (s[i].isnumeric() and s[j].isalpha())):
                return False
            if (not (s[i].isalpha() or s[i].isnumeric())) :
                i += 1
            if (not (s[j].isalpha() or s[j].isnumeric())) :
                j -= 1

        return True