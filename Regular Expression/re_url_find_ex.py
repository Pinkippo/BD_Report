import re

def find_urls(text):
    pattern = r'\b(?:https?://|www\.)\S+\b'
    urls = re.findall(pattern, text)
    return urls

text = "예시 입니다. https://www.example.com 과 http://google.com 은 URL입니다."
urls = find_urls(text)
print(urls)

#결과 -> ['https://www.example.com', 'http://google.com']