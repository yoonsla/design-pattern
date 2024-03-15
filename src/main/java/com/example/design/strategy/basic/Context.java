package com.example.design.strategy.basic;

public class Context {

    Strategy strategy; // 전략 인터페이스를 합성(composition)

    // 전략 교체 메소드
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // 전략 실행 메소드
    public void doSomething() {
        this.strategy.doSomething();
    }
}
