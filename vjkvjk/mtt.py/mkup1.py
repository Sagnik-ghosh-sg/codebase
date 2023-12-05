def encoding(s,p):
    a,d=0,{"a":3,"b":6,"c":2,"d":5,"e":8,"f":4,"g":7}
    if len(s)%2==0:
        for i in range(len(s)):
            if i%2==0:
                a+=d[s[i]]*p**i
            else:
                a+=d[s[i]]
    else:
        for i in range(len(s)):
            if i%2==0:
                a+=d[s[i]]
            else:
                a+=d[s[i]]*p**i
        return a
print(encoding(input(),int(input())))