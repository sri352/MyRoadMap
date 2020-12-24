import datetime
import re
import requests
import wget

#downloads 5 newsPapers into the given path. For linux users change the second argument of the wget to file name it will download into the same 
#folder as the pyscript.

#Origins of the script comes after UPSC aspirant K Praneeth Reddy needed newspapers Downloaded everyday without going to the same tasks everyday.

#You can add this script in the task manager or a cron daily. Works with python3.

#pip3 install requests, wget needed.

url = "https://www.careerswave.in/the-hindu-newspaper/"
html = requests.get(url)
parserInput = html.content.decode("utf-8")
a = re.compile("https:\/\/vk.com\/doc(\d)*_(\d*)\?hash=[a-zA-Z0-9_]*\&dl=[a-zA-Z0-9_]*");
regexOutput = a.search(parserInput)
secondUrl = regexOutput.group(0)
secondHtml = requests.get(secondUrl)
secondParserInput = secondHtml.content.decode("utf-8")
a = re.compile("https://psv4.userapi.com[\w/-]*.pdf");
SecondRegexOutput = a.search(secondParserInput);
pdfUrl = SecondRegexOutput.group(0)
dateString = datetime.datetime.now().strftime("%d-%m-%y")
wget.download(pdfUrl, "C:\\Users\\KPRAN\\Downloads\\NewsPapers\\Automatic\\"+dateString+"TH.pdf")

url = "https://www.careerswave.in/the-indian-express-newspaper-download/"
html = requests.get(url)
parserInput = html.content.decode("utf-8")
a = re.compile("https://pdf.indianexpress.com[\w/-]*.pdf")
regexOutput = a.search(parserInput)
pdfUrl = regexOutput.group(0)
dateString = datetime.datetime.now().strftime("%d-%m-%y")
wget.download(pdfUrl, "C:\\Users\\KPRAN\\Downloads\\NewsPapers\\Automatic\\"+dateString+"IE.pdf")

url = "https://www.careerswave.in/mint-newspaper/"
html = requests.get(url)
parserInput = html.content.decode("utf-8")
a = re.compile("https:\/\/vk.com\/doc(\d)*_(\d*)\?hash=[a-zA-Z0-9_]*\&dl=[a-zA-Z0-9_]*");
regexOutput = a.search(parserInput)
secondUrl = regexOutput.group(0)
secondHtml = requests.get(secondUrl)
secondParserInput = secondHtml.content.decode("utf-8")
a = re.compile("https://psv4.userapi.com[\w/-]*.pdf");
SecondRegexOutput = a.search(secondParserInput);
pdfUrl = SecondRegexOutput.group(0)
dateString = datetime.datetime.now().strftime("%d-%m-%y")
wget.download(pdfUrl, "C:\\Users\\KPRAN\\Downloads\\NewsPapers\\Automatic\\"+dateString+" Mint.pdf")

url = "https://www.careerswave.in/business-line-newspaper/"
html = requests.get(url)
parserInput = html.content.decode("utf-8")
a = re.compile("https:\/\/vk.com\/doc(\d)*_(\d*)\?hash=[a-zA-Z0-9_]*\&dl=[a-zA-Z0-9_]*");
regexOutput = a.search(parserInput)
secondUrl = regexOutput.group(0)
secondHtml = requests.get(secondUrl)
secondParserInput = secondHtml.content.decode("utf-8")
a = re.compile("https://psv4.userapi.com[\w/-]*.pdf");
SecondRegexOutput = a.search(secondParserInput);
pdfUrl = SecondRegexOutput.group(0)
dateString = datetime.datetime.now().strftime("%d-%m-%y")
wget.download(pdfUrl, "C:\\Users\\KPRAN\\Downloads\\NewsPapers\\Automatic\\"+dateString+"BL.pdf")

url = "https://www.careerswave.in/the-financial-express-epaper-pdf/"
html = requests.get(url)
parserInput = html.content.decode("utf-8")
a = re.compile("https://pdf.indianexpress.com[\w/-]*.pdf")
regexOutput = a.search(parserInput)
pdfUrl = regexOutput.group(0)
dateString = datetime.datetime.now().strftime("%d-%m-%y")
wget.download(pdfUrl, "C:\\Users\\KPRAN\\Downloads\\NewsPapers\\Automatic\\"+dateString+"FE.pdf")


#Thanks to K Praneeth Reddy for providing the links of the respective pages.