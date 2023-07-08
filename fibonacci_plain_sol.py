p1 = 0
p2 = 1
print(p1)
print(p2)
for i in range(11):
    p1 += p2 
    p2 += p1 
    print(p1) 
    print(p2)