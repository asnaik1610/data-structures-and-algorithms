def powerfulInteger(self, intervals, k):
    my_dict = {}

    for li in intervals:
        my_dict[li[0]] = my_dict.get(li[0], 0) + 1
        my_dict[li[1] + 1] = my_dict.get(li[1] + 1, 0) - 1

    my_dict = list(my_dict.items())
    my_dict.sort()

    count = 0
    res = -1

    for elem in my_dict:
        if count >= k:
            res = elem[0] - 1
        count += elem[1]
    return res

    # 1st approach -> 1010/1112 test cases passed -> took more time
    # top_list = []
    # for li in intervals:
    #     for elem in range(li[0], li[-1]+1):
    #         if elem not in top_list:
    #             my_dict[elem] = my_dict.get(elem, 0) + 1

    #         if my_dict[elem] == k:
    #             top_list.append(elem)

    # # print(my_dict)
    # # top_list = [key for key, value in my_dict.items() if value >= k]
    # if top_list:
    #     return max(top_list)
    # else:
    #     return -1
