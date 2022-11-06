row=1
while row<=10:
    j=1
    while j<=10-row:
        print(' ',end='')
        j+=1
        pass
    k=1
    while k<=2*row-1:
        print('*',end='')
        k+=1
        pass
    print()
    row+=1