def min_num_in_list(list):
    min = list[0]
    for a in list:
        if a < min:
            min = a
    return min


def max_in_list(list):
    max = list[0]
    for a in list:
        if a > max:
            max


print(min_num_in_list([1, 2, -8, 0]))