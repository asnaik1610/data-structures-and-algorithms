class Solution:
    def missingNum(self, arr):
        N = len(arr) + 1
        sum = (N * (N + 1)) / 2
        return int((sum - sum(arr)))
