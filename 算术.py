import random
person=int(input('请出拳=[0:石头 1:剪刀 2:布'))
computer=random.randint(0, 2)
if person==0 and computer==1:
    print('666')
    pass
elif person==1 and computer==2:
    print('666')
    pass
elif person==2 and computer==0:
    print('666')
    pass
elif person==computer:
    print('ky')
    pass
else:
    print('可以开始修理地球了')