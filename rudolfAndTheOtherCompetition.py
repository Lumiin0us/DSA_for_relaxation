# # #https://codeforces.com/contest/1846/problem/C

t = int(input())
def solver(mins, total_time):
    penalty = 0
    points = 0 
    sum = 0
    mins.sort()
    for min in mins: 
        if total_time >= min: 
            total_time -= min 
            sum += min 
            penalty += sum
            points += 1
    return penalty, points
def output(points_list, penalties_list):
    rudolf_points = points_list[0]
    rudolf_penalties = penalties_list[0]
    position = 1
    # print(points_list, penalties_list)
    for point in range(1, len(points_list)):
        if rudolf_points < points_list[point]:
            position += 1 
        elif points_list[point] == rudolf_points and rudolf_penalties > penalties_list[point]:
            position += 1 
    print(position)
while t: 
    n, m, h = input().split()
    n, m, h = int(n), int(m), int(h) #num of Participants || num of Problems || duration of Competition 
    penalties_list = []
    points_list = []
    while n:
        time_list = input().split()
        time_list = [int(time) for time in time_list]
        penalty, points = solver(time_list, h)
        penalties_list.append(penalty)
        points_list.append(points)
        n -= 1
    output(points_list, penalties_list)
    t -= 1 
