def twoSum(array, target):
  print(array)
  print(target)
  for x in array:
    for y in array: 
      if(x+y== target):
        return target

def twoSum2(array,target): 
  for x in array: 
    print(x)
    dict ={}
    targetValue = target - x
    if x in dict:
      return [x,targetValue]
    dict={array,x}


value = [1,6,10,2]
target = 7

print(twoSum(value,target), " target answer")
# print(twoSum2(value,target), " target answer")