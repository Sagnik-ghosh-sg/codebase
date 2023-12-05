def sq3n(n):
    for i in range(1,n):
        for j in range(1,n):
            for k in range(1,n):
                if i**2 + j**2 +k**2 ==n:
                    return "True"
    else:
        return "False"
print(sq3n(29))