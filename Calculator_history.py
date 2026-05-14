history=[]
while True:
    task=input("Enter math/'h'->history/'q'->quit:").lower()
    if task=='q':
        break
    elif task=='h':
        print("\n".join(history) if history else "Empty")
    else:
        try:
            result=eval(task)
            entry=f"{task} = {result}"
            print(f"->{result}")
            history.append(entry)
        except:
            print("Invalid math")
