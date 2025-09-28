import math
def biggie_size(arr):
    for i in range(len(arr)-1):
        if(arr[i]>0):
            arr[i]="big"
    print(arr)


biggie_size([-1, 3, 5, -5])


def count_positives(arr):
    caunt=0
    for i in range(len(arr)):
        if(arr[i]>0):
            caunt=caunt+1
    arr[len(arr)-1]=caunt
    print(arr)


count_positives([-1, 1, 1, 1])


def sum_total(arr):
    sum=0
    for i in range(0,len(arr),1):
        sum=sum+arr[i]
    print(sum)
    return sum


sum_total([1, 2, 3, 4])
sum_total([6, 3, -2])



def average(arr):
    sum=0
    for i in range(len(arr)):
        sum=sum+arr[i]
    averag=sum/len(arr)
    print(averag)
    return averag

average([1, 2, 3, 4])




def length(arr):
    x=len(arr)
    print(x)
    return x


length([37, 2, 1, -9])


def Minimum(arr):
    if (arr[0]==None):
        print(False)
    else:
        min=arr[0]
        for i in range(1,len(arr)):
            if(min>arr[i]):
                min=arr[i]
        print(min)
        return min

Minimum([37, 2, 1, -9])



def Maximum(arr):
    if (arr[0]==None):
        print(False)
    else:
        max=arr[0]
        for i in range(1,len(arr)):
            if(max<arr[i]):
                max=arr[i]
        print(max)
        return max

Maximum([37, 2, 1, -9])


def ultimate_analysis(arr):
    a=sum_total(arr)
    b=average(arr)
    c=Minimum(arr)
    d=Maximum(arr)
    e=length(arr)
    x={f'sumTotal': a, 'average': b, 'minimum': c, 'maximum': d, 'length': e}
    print(x)

ultimate_analysis([37, 2, 1, -9])


def reverse_list(arr):
    x =len(arr)-1
    s=math.ceil(len(arr)/2)
    for i in range(s):
        arr[i],arr[x]=arr[x],arr[i]
        x-=x
    print(arr)
    return arr

reverse_list([37, 2, 1, -9])
