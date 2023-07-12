#without DP 
# finding the minimum sum in a list of consecutive sub-array 
arr = [-7, 3, 4, -2, -3, 1, -3]

minimum = arr[0]

for i in range(1, len(arr)):
    if arr[i] < minimum:
        minimum = arr[i] 

sums = []
for i in range(0, len(arr) - 1): 
    summ = 0 
    for j in range(i + 1, len(arr)): 
        summ += arr[j]
    sums.append(summ)
print(sums)