# 코딩으로 학습하는 GoF의 디자인 패턴 - 백기선

# GoF (Gang of Four) 의 23가지 디자인 패턴

23가지의 패턴 3가지 종류로 나누어 진다.

- 객체 생성 관련 패턴 (creational)
- 구조 관련 패턴 (structural)
- 행동 관련 패턴 (behavioral)

## Creational Patterns

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

### Prototype ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/creational/prototype))

기존 인스턴스를 복제하여 새로운 인스턴스를 만드는 방법

복제 기능을 갖추고 있는 기존 인스턴스를 프로토타입으로 사용해 새 인스턴스를 만들 수 있다.

<img src="/design-pattern/img/prototype-uml.png" width="750px">

**장단점**

- 장점
  - 기존 객체를 복제하는 과정이 새 인스턴스를 만드는 것보다 비용(시간 또는 메모리)적인 면에서 효율적일 수 있다.
  - 추상적인 타입을 리턴할 수 있다.
- 단점
  - 복제한 객체를 만드는 과정 자체가 복잡할 수 있다.

**사용중인예제**

- ArrayList.clone()

## Structural Patterns

### Adapter ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/structural/adapter))

기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴

클라이언트가 사용하는 인터페이스를 따르지 않는 기존 코드를 재사용할 수 있게 해준다

<img src="/design-pattern/img/adapter-uml-1.png" width="750px">

**예제코드 UML**

<img src="/design-pattern/img/adapter-uml-2.png" width="750px">

**장단점**

- 장점
  - 기존 코드를 변경하지 않고 원하는 인터페이스 구현체를 만들어 재사용 가능
  - 기존 코드가 하던 일과 특정 인터페이스 구현체로 변환하는 작업을 각기 다른 클래스로 분리하여 관리할 수 있다
- 단점
  - 새 클래스가 생겨 복잡도 상승할 수 있다.
    - 이를 개선하기 위해 기존 코드가 해당 인터페이스를 구현하도록 수정하는 것이 좋은 선택이 될 수도 있다. (단, 이 경우는 SRP 를 위반할 수 있지만, class 가 간단하다)

**사용중인예제**

- Arrys.list()
- Collections(←Adapter).enumeration()(←Adaptee)
- Spring MVC
  - HandlerAdapter class

### Bridge ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/structural/bridge))

추상적인 것과 구체적인 것을 분리하여 연결하는 패턴

하나의 계층구조일 때 보다 각기 나누었을 때, 독립적인 계층 구조로 발전 시킬 수 있다

<img src="/design-pattern/img/bridge-uml-1.png" width="750px">

**장단점**

- 장점
  - 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장 가능
  - 추상적인 코드와 구체적인 코드를 분리할 수 있다
- 단점
  - 계층 구조가 늘어나 복잡도가 증가할 수 있다

**사용중인예제**

- JDBC
  - 새로운 DB 추가시 connection 기능과 query 기능
- Sl4J
  - logger 의 구현체

### Composite ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/structural/compisite))

그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴

클라이언트 입장에서는 “전체” 나 “부분” 모두 동일한 컴포넌트로 인식할 수 있는 계층 구조를 만들수 있다.(Part-Whole Hierachy)

<img src="/design-pattern/img/composite-uml.png" width="750px">

**장단점**

- 장점
  - 복잡한 트리구조를 편리하게 사용 가능
  - 다형성과 재귀를 활용 가능
  - 클라이언트 코드를 변경하지 않고 새로운 엘리먼트 타입을 추가할 수 있다
- 단점
  - 트리를 만들어야 하므로(공통된 인터페이스 정의 필요) 지나치게 일반화 해야하는 경우도 생길 수 있다

### Decorator ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/structural/decorator))

기존 코드를 변경하지 않고 부가 기능을 추가하는 패턴

상속이 아닌 위임을 사용해서 보다 런타임시점에 유연하게 부가 기능을 추가하는 것이 가능하다

<img src="/design-pattern/img/decorator-uml.png" width="750px">

**장단점**

- 장점
  - 새로운 클래스를 만들지 않고 기존 기능을 조합 가능
  - 컴파일 타임이 아닌 런타임에 동적으로 기능 변경 가능
- 단점
  - 데코레이터를 조합하는 코드가 복잡할 수 있다.

**사용중인예제**

- Spring - HttpServletRequestWrapper class
- Spring - ServerHttpRequestDecorator class

### Facade ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/structural/facade))

복잡한 서브 시스템 의존성을 최소화하는 방법

클라이언트가 사용해야 하는 복잡한 서브 시스템 의존성을 간단한 인터페이스로 추상화 할 수 있다

<img src="/design-pattern/img/facade-uml.png" width="750px">

**장단점**

- 장점
  - 서브시스템에대한 의존성을 한곳으로 모을수 있다.
- 단점
  - 퍼사드 클래스가 서브시스템에 대한 모든 의존성을 갖게 된다.

**사용중인예제**

- Spring - JavaMailSenderImpl()
- Spring - PlatformTransactionManager()

### Flyweight ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/structural/flyweight))

객체를 가볍게 만들어 메모리 사용을 줄이는데 사용

자주 변하는 속성과 변하지 않는 속성을 분리하고 재사용하여 메모리 사용을 줄일 수 있다.

<img src="/design-pattern/img/flyweight-uml.png" width="750px">

**장단점**

- 장점
  - 애플리케이션에서 메모리를 줄일수 있다
- 단점
  - 코드의 복잡도가 올라간다.

**사용중인예제**

- Java - Integer.valueOf()

### Proxy ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/structural/proxy))

특정 객체에 접근을 제어하거나 기능을 추가할 수 있는 패턴

초기화 지연, 접근 제어, 로깅, 캐싱 등 다양하게 응용하여 사용할 수 있다

<img src="/design-pattern/img/proxy-uml.png" width="750px">

**장단점**

- 장점
  - 기존 코드를 변경하지 않고 새로운 기능을 추가할 수 있다
  - 기존 코드가 해야하는 일만 유지 가능
  - 기능 추가, 초기화 지연 등으로 다양하게 활용 가능
- 단점
  - 코드의 복잡도가 올라감

**사용중인예제**

- Spring - AOP

## Behavioral Patterns

### Chain of Responsibility ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/structural/chain_of_responsibility))

요청을 보내는 쪽(sender)과 요청을 처리하는 쪽(reveiver)의 분리하는 패턴

handler chain 을 사용해서 요청을 처리

<img src="/design-pattern/img/chain_of_responsibility-uml.png" width="750px">

**장단점**

- 장점
  - SRP 를 유지하며 OCP 가 가능하다.
- 단점
  - 디버깅이 어려울 수 있다.

**사용중인예제**

- Java - Servlet 의 Filter

### Command ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/structural/command))

요청을 캡슐화하여 invoker 와 receiver 를 분리하는 패턴

요청을 처리하는 방법이 바뀌더라도 호출자의 코드는 변경되지 않는다.

<img src="/design-pattern/img/command-uml.png" width="750px">

**장단점**

- 장점
  - 기존 코드 변경없이 새로운 command 를 만들 수 있다
  - receiver 코드가 변경되어도 invoker 코드는 변경되지 않는다
  - command 객체를 로깅, DB에 저장, 네트워크로 전송하는 등의 다양한 방법으로 활용할 수 있다
- 단점
  - 코드가 복잡해지고 클래스가 많아진다

**사용중인예제**

- Java - Executors class
- Spring - SimpleJdbcInsert

### Interpreter ([link](https://github.com/JungwooSim/Inflearn-design_pattern_GOF/tree/main/design-pattern/src/main/kotlin/structural/interpreter))

자주 등장하는 문제를 간단한 언어로 정의하고 재사용하는 패턴

반복되는 문제 패턴을 언어 또는 문법으로 정의하고 확장할 수 있다

<img src="/design-pattern/img/interpreter-uml.png" width="750px">

**장단점**

- 장점
  - 자주 등장하는 문제 패턴을 언어와 문법으로 정의할 수 있다
  - 기존 코드를 변경하지 않고 새로운 Expression 을 추가 할 수 있다
- 단점
  - 복잡한 문법을 표현하려면 Expression 과 Parser 가 복잡해질수 있다

**사용중인예제**

- Java - Pattern.matches()
- Spring - Expression class