# 디자인패턴

## 전략 패턴

> 전략 패턴(strategy pattern) 또는 정책 패턴(policy pattern)은 실행 중에 알고리즘을 선택할 수 있게 하는 행위 소프트웨어 디자인 패턴이다.
> 전략 패턴은 특정한 계열의 알고리즘들을 정의하고 각 알고리즘을 캡슐화하며 이 알고리즘들을 해당 계열 안에서 상호 교체가 가능하게 만든다.
> 전략은 알고리즘을 사용하는 클라이언트와는 독립적으로 다양하게 만든다.

전략패턴이란 특정 컨텍스트에서 알고리즘을 별도로 분리하는 설계 방법을 의미한다.
알고리즘 변형이 빈번하게 필요한 경우 적합한 패턴이다.

### 장점

전략패턴을 적용할때의 이점은 컨텍스트 코드의 변경 없이 새로운 전략을 추가할 수 있다는 점이다.
요구사항이 변경되었을 때 기존의 코드를 변경하지 않아도 된다는 것이 전략패턴의 장점이며,
새로운 전략에 대해서는 새로운 클래스를 통해 관리하기 때문에 OCP의 원칙을 준수할 수 있다.

### 단점

모든 상황에서 전략패턴이 사용되는 것은 유용하지 않다.
컨텍스트에 적용되는 알고리즘이 하나이거나 두개인 경우와 같이 단순한 경우에는 분기로 구분하는 것이 편할 수 있다.

전략패턴은 하나의 추상화 기법이기 때문에 단순한 경우에도 전략패턴을 사용해야하는 경우도 있다.
예를들어 랜덤한 로직을 테스트한다거나 Mock 객체를 생성하여 Controller를 테스트하는 경우 등 다양한 경우 유용하게 사용된다.

### 사용 시기

- 전략 알고리즘의 여러 버전 또는 변형이 필요할 때 클래스화를 통해 관리
- 알고리즘 코드가 노출되어서는 안 되는 데이터에 액세스 하거나 데이터를 활용할 때 (캡슐화)
- 알고리즘의 동작이 런타임에 실시간으로 교체 되어야 할 때

## 커맨드 패턴

실행될 기능을 캡슐화함으로써 주어진 여러 기능을 실행할 수 있는 재사용성이 높은 클래스를 설계하는 패턴을 의미한다.
이벤트가 발생했을 때 실행될 기능이, 다양하면서도 변경이 필요한 경우에 이벤트를 발생시키는 클래스를 변경하지 않고 재사용하고자 할 때 유용하다.

실행될 기능을 캡슐화함으로써 기능의 실행을 요구하는 호출자(Invoker) 클래스와 실제 기능을 실행하는 수신자(Receiver) 클래스 사이의 의존성을 제거한다.
실행될 기능의 변경에도 호출자를 수정 없이 그대로 사용 할 수 있도록 해준다.

역할이 수행하는 작업

- Command : 실행될 기능에 대한 인터페이스 / 실행될 기능을 execute 메서드로 선언함
- ConcreteCommand : 실제로 실행되는 기능을 구현 / Command라는 인터페이스를 구현함
- Invoker : 기능의 실행을 요청하는 호출자 클래스
- Receiver : ConcreteCommand에서 execute 메서드를 구현할 때 필요한 클래스 / ConcreteCommand의 기능을 실행하기 위해 사용하는 수신자 클래스

## 싱글톤 패턴

객체의 인스턴스가 오직 1개만 생성되는 패턴을 의미한다.

### 싱글톤 패턴 사용 이유

- 최초 한번의 new 연산자를 통해서 고정된 메모리 영역을 사용하기 때문에 추후 해당 객체에 접근할 때 메모리 낭비를 방지할 수 있다.
- 뿐만 아니라 이미 생성된 인스턴스를 사용하기 때문에 속도 측면에도 유리하다.
- 다른 클래스 간에 공유가 편의하다. (싱글톤 인스턴스가 전역으로 사용되는 인스턴스이기 때문)

하지만 여러 클래스의 인스턴스에서 싱글톤 인스턴스의 데이터에 동시에 접근하게 되면 동시성 문제가 발생할 수 있으니 유의하자.

### 단점

- 테스트가 어렵다. (싱글톤 인스턴스는 자원을 공유하고 있기 때문에 테스트가 결정적으로 격리된 환경에서 수행되려면 매번 인스턴스의 상태를 초기화시켜주어야 한다.)
- 의존 관계상 클라이언트가 구체 클래스에 의존하게 된다. (이는 SOLID 원칙 중 DIP를 위반하게 되고 OCP 원칙 또한 위반할 가능성이 높다.)
- 동시성 문제 해결을 위해 syncronized 키워드를 사용해야 하는 경우가 생긴다.



