import numpy as np

array = [5,6,4,3,7,8,9]

for i in range(1,len(array)):
    
        file1 = open("timestamped_data.csv","a")
        array1 = str(array[i])
        array1 = array1.replace("'"," ")
        array1 = array1.replace("["," ")
        array1 = array1.replace("]"," ")
        file1.write(str(array1))
        file1.write("\n")
        file1.close()

file1.close()
print("done importing")
