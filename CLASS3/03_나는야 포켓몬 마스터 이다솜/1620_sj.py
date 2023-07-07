import sys

n, m = map(int, input().split())  # 포켓몬 개수, 문제의 개수

poketmon_dic = {}  # dictionary 사용
poketmon_dic_tmp = {}

for i in range(n):
    p = input()
    poketmon_dic[i+1] = p  # 숫자:포켓몬
    poketmon_dic_tmp[p] = i+1  # 포켓몬:숫자

for _ in range(m):
    q = sys.stdin.readline().strip()
    if q in poketmon_dic_tmp:
        print(poketmon_dic_tmp[q])
    else:
        print(poketmon_dic[int(q)])
