# if None:
#     print("hello")
# for i in [1,0]:
def reversewords(input):
  abs=input.split(' ')
  abs=abs[-1::-1]
  output=' '.join(abs)

  return output

# if __name__=='__main__':
#     input='i love you'
#     rw=reversewords(input)
#     print(rw)
