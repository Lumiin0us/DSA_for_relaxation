#https://leetcode.com/problems/valid-sudoku/

class Solution:
    def isValidSudoku(self):
        board = [["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
        sliders = []
        iterator = 3
        starter = 0 
        count = 0 
        counter = 1 
        for i in range(1, 28, 3):
            slider = []
            count += 1
            if count == 4 or count == 7:
                iterator += 3
                starter += 3
                counter = 1
            # if counter 
            if counter + 1 < len(board):
                for j in range(starter, iterator):
                    if board[counter - 1][j] != '.': 
                        slider.append(board[counter - 1][j])
                for k in range(starter, iterator):
                    if board[counter][k] != '.': 
                        slider.append(board[counter][k])
                for l in range(starter, iterator):
                    if board[counter + 1][l] != '.': 
                        slider.append(board[counter + 1][l])
                # break
                sliders.append(slider)
            counter += 3
        flag2 = True
        for i in sliders:
            if len(set(i)) != len(i):
                return False

        check_blank_board = all(len(s) == 0 for s in sliders)
        if check_blank_board == True:
            return True
                
            
        output_rows = []
        output_cols = []
        flag1 = True
        for indice, rows in enumerate(board):
            row = []
            for index, item in enumerate(rows):
                if indice < 1:
                    if item != '.':
                        output_cols.append([item])
                    else:
                        output_cols.append([])
                else:
                    if item != '.':
                        output_cols[index].append(item)
                if item != '.':
                    row.append(item)
            output_rows.append(row)
        for i in range(9):
            if len(output_rows[i]) != len(set(output_rows[i])):
                return False
            elif len(output_cols[i]) != len(set(output_cols[i])):
                return False
            
        return True
            
        # print(output_rows)
        # print(output_cols)
                # break
        
sol = Solution()
print(sol.isValidSudoku())

# (0,0) (0,1) (0,2) 