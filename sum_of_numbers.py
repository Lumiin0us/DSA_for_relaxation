import time 

start_time = time.time()
input = 1000000
sum = 0
sum = (input * (input + 1))//2
end_time = time.time() - start_time
print(end_time)
print("SUM", sum)

start_time = time.time()
sum = 0 
for i in range(1000000):
    sum += i + 1 
end_time = time.time() - start_time
print(end_time)
print("SUM", sum)

start_time = time.time()
sum = 0 
while True: 
    for i in range(1000000):
        sum += i + 1 
    end_time = time.time() - start_time
    print(end_time)
    print("SUM", sum)
    break

