sub1=int(input("enter marks for M1:- "))
sub2=int(input("enter marks for M2:- "))
sub3=int(input("enter marks for PPS:- "))
sub4=int(input("enter marks for CPP:- "))
sub5=int(input("enter marks for JAVA:- "))
Total=sub1+sub2+sub3+sub4+sub5
average=Total/5
percentage=(Total/500)*100
print("Total marks: ",Total)
print("Average: ",average)
print("Percentage: ",percentage)

if percentage>=90:
    Grade="o"
elif percentage>80:
    Grade="A+"
elif percentage>60:
    Grade="A"
elif percentage>50:
    Grade="B+"
elif percentage>35:
    Grade="B"
else:
    Grade="Fail"

print("Grade: ",Grade)
