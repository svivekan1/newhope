def printValuesFirst5AndLast5():
    l = list()
    for i in range(1, 21):
        l.append(i ** 2)
    print(l[:5])
    print(l[-5:])


def printLast5():
    l = list()
    for i in range(1,21):
        l.append(i**2)
    print(l[5:])


printValuesFirst5AndLast5()
printLast5()
