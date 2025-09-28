import math

def countdown(x):
    result =[]
    for i in range(0,x+1,1):
        result.append(x)
        x=x-1
    return result

print(countdown(11))





def print_and_return(a,b):
    print(a)
    return(b)

print_and_return(2,3)


def first_plus_length(arr):
    x=arr[0]+len(arr)
    print(x)

first_plus_length([3,4,5,6,7,8,9])



def values_greater_than_second(arr):
    list=[]
    l =len(arr)
    k =int(math.ceil(l))
    print(math.ceil(k))
    for i in range(0,k,2):
        if (arr[i]<arr[i+1]):
            list.append(arr[i+1])
        else:
            list.append(arr[i])
    print(len(list))
    print(list)
    return list
    if(len(list)<2):
        return False
    else:
        return True

v =[1,4,6,8,9,6]
values_greater_than_second(v)




def length_and_value(a, b):
    list =[]
    for i in range(a):
        list.append(b)
    print(list)

length_and_value(4, 7)