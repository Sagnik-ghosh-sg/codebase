
def flatten(l1):
    l=list()
    for i in l1:
        if str(type(i))=="<class 'list'>" :
           for j in i:
               l.append(j)
        else:
             l.append(i)
    return l


    
print(flatten(eval(input())))
