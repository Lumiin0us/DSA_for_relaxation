#https://codeforces.com/contest/1846/problem/B

def winner(board_list):
    if board_list[0][0] == board_list[1][0] and board_list[1][0] == board_list[2][0] and board_list[0][0] != '.':
        print(board_list[0][0])
    elif board_list[0][1] == board_list[1][1] and board_list[1][1] == board_list[2][1] and board_list[0][1] != '.':
        print(board_list[0][1])
    elif board_list[0][2] == board_list[1][2] and board_list[1][2] == board_list[2][2] and board_list[0][2] != '.':
        print(board_list[0][2])
    elif board_list[0][0] == board_list[1][1] and board_list[1][1] == board_list[2][2] and board_list[0][0] != '.':
        print(board_list[0][0])
    elif board_list[0][2] == board_list[1][1] and board_list[1][1] == board_list[2][0] and board_list[0][2] != '.':
        print(board_list[0][2])
    elif board_list[0][0] == board_list[0][1] and board_list[0][1] == board_list[0][2] and board_list[0][0] != '.':
        print(board_list[0][2])
    elif board_list[1][0] == board_list[1][1] and board_list[1][1] == board_list[1][2] and board_list[1][0] != '.':
        print(board_list[1][0])
    elif board_list[2][0] == board_list[2][1] and board_list[2][1] == board_list[2][2] and board_list[2][0] != '.':
        print(board_list[2][0])
    else:
        print("DRAW")
t = int(input()) 
while t: 
    board = []
    three = 3
    while three: 
        l = []
        a = input()
        for i in a: 
            l.append(i)
        board.append(l)
        three -= 1
    winner(board)
    t -= 1
