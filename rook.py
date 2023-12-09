t = int(input())

while t: 
    x = input()
    alphabet, number = x[0], x[1]
    nums = [1, 2, 3, 4, 5, 6, 7, 8]
    chars = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']

    for num in nums: 
        if num != int(number):
            print(alphabet + str(num))
    for chr in chars: 
        if chr != alphabet:
            print(chr + number)

    t-=1