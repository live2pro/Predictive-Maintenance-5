import json
import gspread
from oauth2client.service_account import ServiceAccountCredentials


json_key = json.load(open('creds.json')) # json credentials you downloaded earlier
scope = ['https://spreadsheets.google.com/feeds']

#credentials = ServiceAccountCredentials(json_key['predictive-maintenance-52615@appspot.gserviceaccount.com'], json_key['ffe2e07e4b4de769812a2927da98af7d35c7cf81'].encode(), scope) # get email and key from creds
credentials = ServiceAccountCredentials.from_json_keyfile_name('creds.json', scope)


file = gspread.authorize(credentials) # authenticate with Google
sheet = file.open("PM_test").sheet1 # open sheet
#print(sheet.row_values(1))

string = str(sheet.row_values(1))
#print(string)

string1 = string.replace("'"," ")
#print(string1)

#list_of_lists = sheet.get_all_values()
#print(list_of_lists)

for i in range(1,27):
        string = str(sheet.row_values(i))
        string1 = string.replace("'"," ")
        string1 = string1.replace("["," ")
        string1 = string1.replace("]"," ")

        file1 = open("PM_test.csv","a")
        file1.write(string1)
        file1.write("\n")
        file1.close()
        print(i)

#file1.close()
print("done importing")

