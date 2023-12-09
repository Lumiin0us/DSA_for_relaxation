t = int(input())

while t:
    str = input()
    str = str[::-1]
    str = list(str)

    b = 0
    B = 0 
    for index, ch in enumerate(str): 
        if ch == 'b':
            b += 1
            str[index] = ''
        elif ch == 'B':
            B += 1
            str[index] = ''
        else: 
            if b > 0 and ch.islower(): 
                str[index] = ''
                b -= 1
            elif B > 0 and ch.isupper():
                str[index] = ''
                B -= 1

    str = ''.join(str)
    str = str[::-1]
    print(str)
    t -= 1
