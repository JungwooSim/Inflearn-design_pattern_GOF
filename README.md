# 코딩으로 학습하는 GoF의 디자인 패턴 - 백기선

# GoF (Gang of Four) 의 23가지 디자인 패턴

23가지의 패턴 3가지 종류로 나누어 진다.

- 객체 생성 관련 패턴 (creational)
- 구조 관련 패턴 (structural)
- 행동 관련 패턴 (behavioral)

### Singleton Pattern ([link]())

인스턴스를 한개만 제공하는 클래스

**특징 & 사용해야하는 시점**

- 인스턴스가 여러개 일때 문제가 생기는 경우에 사용할수 있다. (시스템 런타임, 환경 셋팅 정보 등)
- 인스턴스를 한개만 만들어 제공하는 클래스를 필요로 할 경우

**사용중인 예제**

- Java 의 Runtime Class
- Spring 의 Bean (Default 설정일 경우)