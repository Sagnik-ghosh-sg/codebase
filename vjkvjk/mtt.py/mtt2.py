def splittsum(l1):
     a=0
     b=0
     for i in l1:
        if i>0:
            a+=i**2
        else:
            b+=i**3
     return(a,b)
print(splittsum(eval(input())))