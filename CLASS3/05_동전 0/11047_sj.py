import sys

n, k = map(int, input().split())

money = []
for _ in range(n):
    money.append(int(sys.stdin.readline().strip()))
money = sorted(money, reverse=True)

result = 0
for m in money:
    if m > k:
        continue
    re, k = divmod(k, m)  # 첫번째 값이 몫, 두번째 값이 나머지
    result = result + re
    if k == 0:
        break

print(result)
