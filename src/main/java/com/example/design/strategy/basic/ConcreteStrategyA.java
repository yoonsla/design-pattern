package com.example.design.strategy.basic;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void doSomething() {
        System.out.println("strategy A");
    }
}
