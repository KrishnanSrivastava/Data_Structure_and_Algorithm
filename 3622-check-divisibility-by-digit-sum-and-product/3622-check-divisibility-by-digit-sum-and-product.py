class Solution:
    def checkDivisibility(self, n: int) -> bool:
        sum = 0
        pro = 1
        num = n
        while (num > 0):
            sum += num % 10
            pro *= num % 10
            num //= 10
        return (n % (sum + pro) == 0)
        
        