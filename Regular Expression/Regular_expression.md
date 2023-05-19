# **정규표현식이란?**
- **정규표현식** (Regular expressions) 은 특정한 규칙을 가진 문자열의 집합을 표현하는 데 사용하는 형식 언어이다. 복잡한 문자열의 검색과 치환을 위해 사용되며, Python 뿐만 아니라 문자열을 처리하는 모든 곳에서 사용된다.


## **1. 메타문자**
- 메타 문자란 문자 본래의 의미가 아닌 특정용도로 사용되는 문자를 의미한다.
- 정규표현식에 사용되는 메타 문자 :  `.^$*+?\|(){}[]`

### `[]` **메타문자**
- 대괄호 안에 포함된 문자 중 하나가 포함(혹은 매치)

### `-` **메타 문자**
- `-` 문자는 `[]` 안에서 문자 사이의 범위를 의미한다. () 소괄호 안에서는 문자 '-' 그대로의 의미이다.

### `^` **메타 문자**
- `^` 문자는 ^뒤의 문자로 시작하면 문자와 매치된다.
    - 여러 문자열인 경우 첫 줄만 적용되지만 MULTILINE 옵션을 사용하면 각 줄에 적용된다.

### `.` **메타 문자**
- `.` 문자는 두 문자 사이에 줄바꿈 문자인 `\n`를 제외한 모든 문자와 매치된다.
    - 점 하나 당 하나의 문자이다.
    - `.` 문자는 [ ] 안에서 원래 의미인 마침표를 의미한다.

### `*` **메타 문자**
- `*` 문자는 앞 문자가 0개 이상일 때 매치된다.

### `+` **메타 문자**
- `+` 문자는 앞 문자가 1개 이상일 때 매치된다.

### `?` **메타 문자**
- `?` 문자는 앞 문자가 0~1개일 때 매치된다.

### `{m}` **메타 문자**
- `{m}` 문자는 앞 문자가 m번 반복될 때 매치된다.

### `{m, n}` **메타 문자**
- `{m, n}` 문자는 앞 문자가 m번에서 n번까지 반복될 때 매치된다.

### `|` **메타 문자**
- `|` 문자는 여러 개의 정규표현식을 or로 구분하며, 이중 하나와 매치된다.

### `$` **메타 문자**
- `$` 문자는 $ 문자 앞의 문자로 끝나면 매치된다.

### `\A, \Z` **메타 문자**
- `\A` 문자는 ^와 동일하지만 re.MULTILINE 옵션을 무시하고 항상 문자열 첫 줄의 시작 문자를 검사한다.
- `\Z` 는 $ 와 동일하지만 re.MULTILINE 옵션을 무시하고 항상 문자열 마지막 줄의 끝 문자를 검사한다.

### `\s, \w, \d`
- `\s` 문자는 공백 문자에 대응된다.
- `\w` 문자는 단어 문자에 대응된다.
- `\d` 숫자에 대응된다. 

## **2. 조건식이 있는 표현식**

### `표현식1(?=표현식2)`
- `표현식1` 뒤의 문자열이 `표현식2`와 동일할 때 `표현식1`이 매치된다.

### `표현식1(?!표현식2)`
- `표현식1` 뒤의 문자열이 `표현식2`와 동일하지 않을 때 `표현식1`이 매치된다.

### `(?<=표현식1)표현식2`
- `표현식2` 앞의 문자열이 `표현식1`과 동일할 때 `표현식2`가 매치된다.

### `(?<!표현식1)표현식2`
- `표현식2` 앞의 문자열이 `표현식1`과 동일하지 않을 때 `표현식2`가 매치된다.


## **3. 정규표현식이 필요한 이유**
- 정규표현식은 문자열에서 특정 패턴을 찾거나 추출하는 데 사용되며, 문자열 처리에서 매우 유용합니다. 문자열에서 특정 패턴을 찾을 때, 예를 들어 이메일 주소나 전화번호, 우편번호, 주민등록번호, 주소 등을 찾는 경우에 정규표현식을 사용하면 훨씬 쉽게 패턴을 인식하고 추출할 수 있습니다.

- 정규표현식은 문자열 검색 및 대체, 유효성 검사, 자연어 처리 등에도 사용됩니다. 따라서, 문자열 처리에서 매우 중요한 역할을 합니다.