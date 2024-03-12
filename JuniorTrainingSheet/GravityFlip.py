#https://codeforces.com/contest/405/problem/A

n = int(input())

n_list = input().split()
n_list = [int(n_list[i]) for i in range(len(n_list))]
n_list.sort(reverse=False)
for i in range(len(n_list)):
    print(n_list[i])

print(n_list)