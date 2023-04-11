import sys

n = int(sys.stdin.readline())
S = set()

for _ in range(n):
    temp = sys.stdin.readline().strip().split(' ')

    if len(temp) == 1:
        if temp[0] == 'all':
            S = {x for x in range(1, 21)}
        else:
            S.clear()
    else:
        func, x = temp[0], temp[1]
        x = int(x)

        if 1 <= x <= 20:
            if func == 'add':
                S.add(x)
            elif func == 'remove':
                S.discard(x)  # remove 사용하면 없을 경우 에러
            elif func == 'check':
                if x in S:
                    print(1)
                else:
                    print(0)
            elif func == 'toggle':
                if x in S:
                    S.discard(x)
                else:
                    S.add(x)
