import re

def find_emails(text):
    pattern = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}\b'
    emails = re.findall(pattern, text)
    return emails

text = "예시 입니다. abc@example.com 과 def@example.net 은 이메일 주소입니다."
emails = find_emails(text)
print(emails)

# 결과 -> ['abc@example.com', 'def@example.net']