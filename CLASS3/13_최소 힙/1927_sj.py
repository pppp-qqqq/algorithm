import sys
import heapq

num = int(input())
heap = []

#Max Heap
for _ in range(num):
    n = int(sys.stdin.readline())
    if n != 0:
        heapq.heappush(heap, n)
    else:
        try:
            print(heapq.heappop(heap))
        except:
            print(0)