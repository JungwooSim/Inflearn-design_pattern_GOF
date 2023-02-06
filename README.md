# 코딩으로 학습하는 GoF의 디자인 패턴 - 백기선

# GoF (Gang of Four) 의 23가지 디자인 패턴

23가지의 패턴 3가지 종류로 나누어 진다.

- 객체 생성 관련 패턴 (creational)
- 구조 관련 패턴 (structural)
- 행동 관련 패턴 (behavioral)

### Singleton Pattern ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/creational/singleton))

인스턴스를 한개만 제공하는 클래스

**특징 & 사용해야하는 시점**

- 인스턴스가 여러개 일때 문제가 생기는 경우에 사용할수 있다. (시스템 런타임, 환경 셋팅 정보 등)
- 인스턴스를 한개만 만들어 제공하는 클래스를 필요로 할 경우

**사용중인 예제**

- Java 의 Runtime Class
- Spring 의 Bean (Default 설정일 경우)

### Factory Method  ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/creational/factorymethod))

구체적으로 어떤 인스턴스를 만들지를 서브클래스가 정의

<img src="/design-pattern/img/factory-method-uml.png" width="750px">

**적용시 장단점**

- 장점
    - Loose Coupling 하게 개발이 가능하므로, OCP(Open Closed Principle) 원칙을 지키며 개발 가능
- 단점
    - class 가 많아질 수 있다

**사용중인 예제**

- Simple Factory Pattern(단순한 팩토리 패턴)
    - 매게변수의 값에 따라 또는 메소드에 따라 각기 다른 인스턴스를 리턴하는 단순한 버전의 팩토리 패턴
- Spring 에서의 BeanFactory
    - Object 타입의 Product 를 만드는 BeanFactory

-

### Abstract Factory ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/creational/abstract_factory))

서로 관련있는 여러 객체를 만들어주는 인터페이스

구체적으로 어떤 클래스의 인스턴스를(concrete product) 사용하는지 감출 수 있다.

<img src="/design-pattern/img/abstract-factory-uml.png" width="750px">

**장단점**

- Factory Method 과 같다.

**Abstract Factory 와 Factory Method 차이점**

- 관점의 차이
  - Factory Method : 팩토리를 구현하는 방법에 초점이 맞추어져 있다.
  - Abstract Factory : 팩토리를 사용하는 방법에 초점이 맞추어져 있다.
- 목적의 차이
  - Factory Method 는 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적이다
  - 추상 팩토리 패턴은 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게하는 것이 목적이다

### Builder Factory ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/creational/builder))

동일한 프로세스를 거쳐 다양한 구성의 인터페이스를 만드는 방법

<img src="/design-pattern/img/builder-uml.png" width="750px">

**장단점**

- 장점
  - 객체를 만드는 프로세스를 독립적으로 분리할 수 있다.
  - 객체를 만드는 과정을 숨길 수 있다.
- 단점
  - 빌더 클래스를 인스턴스로 만들어야 한다.
  - builder 코드는 복잡해질 수 있다.

**사용중인예제**

- Stringbuilder
- Stream.Builder