import sys
from collections import Counter

n, m = map(int, input().split())

d_list = []
for _ in range(n):
    d = sys.stdin.readline().strip()
    d_list.append(d)

b_list = []
for _ in range(m):
    b = sys.stdin.readline().strip()
    b_list.append(b)

db_list = d_list + b_list

counter = dict(Counter(db_list))
result = {key: value for key, value in counter.items() if value > 1}

print(len(result))
for value in sorted(result):
    print(value)
