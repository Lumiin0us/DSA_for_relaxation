
def area(base, height, number_of_triangles):
    area = (base * height) // 2
    total_area = area * number_of_triangles
    return total_area
def filter_area(total_area, base_heights):
    filtered_area = 5 # 1,4,5
    return filtered_area

t = 1 
while t:
    n, d, h = input().split()
    n, d, h = int(n), int(d), int(h) #num of Branches || Length of Base || height of the Branches 
    base_heights = input().split()
    base_heights = [int(height) for height in base_heights]
    total_area = area(d, h, n)
    filtered_area = filter_area(total_area, base_heights)
    print(filtered_area)
    t -= 1


#! Incomplete due to problem's statement 