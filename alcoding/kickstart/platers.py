def longestCommonPrefix(strs):  
  if len(strs) == 0:
      return 0
  current = strs[0]
  for i in range(1,len(strs)):
      temp = ""
      if len(current) == 0:
          break
      for j in range(len(strs[i])):
          if j<len(current) and current[j] == strs[i][j]:
                temp+=current[j]
          else:
              break
      current = temp
  return len(current)

l=0
test_cases=int(input())
while(test_cases):
  n,k = list(map(int, input().split()))
  a=[]
  for i in range(n):
    a.append(input())
  print(k)
  score=0
  for i in range(0,n,k):
      score+=longestCommonPrefix(a[i:i+k])
  print('Case #'+ str(l+1)+": "+str(score))
  l+=1
  test_cases=test_cases-1
