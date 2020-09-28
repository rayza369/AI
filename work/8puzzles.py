import random

table = [None,None,None,None,None,None,None,None,None]
i = 1
for j in range(9):
        while i != 0:
            x = random.randint(0,8)
            if j == 0:
                    table[j] = x
                    break
            elif x != table[0] and x != table[1] and x != table[2] and x != table[3] and x != table[4] and x != table[5] and x != table[6] and x != table[7] and x != table[8]:
                    table[j] = x
                    break
            elif x == None:
                    table[j] = x
                    break
                          


for text in table:
    print(text)
