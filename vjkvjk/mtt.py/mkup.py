def delchar(s,c):
    if(c not in s):
        return "input error"
    if(len(c)>1):
        return s
    else:
        return(s.replace(c,""))
print(delchar(input(),input()))