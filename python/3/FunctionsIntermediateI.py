import random


def randInt(min=0 , max=100):
    if (max<0):
        return 0
    if (min>max):
        min, max = max, min
    
    num =random.random() * (max-min)+min
    return round(num)


print(randInt())
print(randInt(max=50))          
print(randInt(min=50))          
print(randInt(min=50, max=500))
print(randInt(min=200, max=100))
print(randInt(max=-10))