def rearrange(arr, num):
    """
    Rearranges the array such that each element is sorted by its absolute difference from a given value.
    Time Complexity: O(n log n) due to sorting.
    Space Complexity: O(n) for the sorted array.
    """
    arr.sort(key=lambda x: abs(x - num))  # TimSort algo
    return arr


res = rearrange([10, 5, 3, 9, 2], 7)
print(res)
