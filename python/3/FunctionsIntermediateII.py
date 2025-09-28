x = [ [5,2,3], [10,8,9] ] 
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]

x[1][0]=15
print(x)

students[0]['last_name']='bryant'
print(students[0])


sports_directory['soccer'][0]='Andres'
print(sports_directory['soccer'])

z[0]['y']=30
print(z)



students = [ 
    {'first_name': 'Michael', 'last_name' : 'Jordan'}, 
    {'first_name' : 'John', 'last_name' : 'Rosales'}, 
    {'first_name' : 'Mark', 'last_name' : 'Guillen'}, 
    {'first_name' : 'KB', 'last_name' : 'Tonel'}
]


def iterateDictionary(some_list):
    for item in some_list:
        outpot=[]
        for key , value in item.items():
            outpot.append(f"{key} - {value}")
            print(" , ".join(outpot))
iterateDictionary(students)

def iterateDictionary2(key_name, some_list):
    for item in some_list:
        print(item[key_name])
iterateDictionary2('first_name', students)

def printInfo(some_dict):
    for key in some_dict:
        print(f"{len(some_dict[key])} {key.upper()}")
        for item in some_dict[key]:
            print(item)