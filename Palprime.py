def ispalprime(n):

    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False

    original = n
    rev_num = 0
    temp = n

    while temp > 0:
        digit = temp % 10
        rev_num = (rev_num * 10) + digit
        temp = temp // 10

    if original != rev_num:
        return False

    for i in range(2, n):
        if n % i == 0:
            return False

    return True


num = int(input("Enter No: "))

if ispalprime(num):
    print("number is palindrome & prime")
else:
    print("number is not")
