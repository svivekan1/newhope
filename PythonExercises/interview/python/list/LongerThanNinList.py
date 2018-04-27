# def long_words(n, str):
#     word_len = []
#     txt = str.split(" ")
#     for x in txt:
#         if len(x) > n:
#             word_len.append(x)
#     return word_len


def long_words(n, input):
    word_len = []
    words = input.split(" ")
    for word in words:
        if len(word) > n:
            word_len.append(word)
    return word_len


print(long_words(3, "The quick brown fox jumps over the lazy dog"))
