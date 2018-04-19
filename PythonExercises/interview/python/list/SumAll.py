# def sum_list(items):
#     sum_numbers = 0
#     for x in items:
#         sum_numbers += x
#     return sum_numbers


def sum_list(items):
    sum_numbers = 0
    for x in items:
        sum_numbers += x
    return sum_numbers


def multiply_list(items):
    multiply_nums = 1
    for x in items:
        multiply_nums *= x
    return multiply_nums


print(sum_list([1, 2, -8]))
print(multiply_list([1, 2, -8]))
