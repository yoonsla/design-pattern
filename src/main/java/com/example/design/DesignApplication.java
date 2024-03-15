package com.example.design;

import com.example.design.strategy.basic.ConcreteStrategyA;
import com.example.design.strategy.basic.ConcreteStrategyB;
import com.example.design.strategy.basic.Context;
import com.example.design.strategy.weapon.TakeWeapon;
import com.example.design.strategy.weapon.TakeWeaponPattern;
import com.example.design.strategy.weapon.TakeWeaponPattern.Sword;
import com.example.design.strategy.weapon.TakeWeaponPattern.TakeWeaponStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignApplication.class, args);

        // 전략적 패턴 !!

        Context context = new Context();
        // 전략 설정
        context.setStrategy(new ConcreteStrategyA());
        // 전략 실행
        context.doSomething();
        // 다른 전략 설정
        context.setStrategy(new ConcreteStrategyB());
        // 다른 전략 시행
        context.doSomething();

        // 예제 오리지널
        TakeWeapon takeWeapon = new TakeWeapon();
        takeWeapon.setWeapon(TakeWeapon.SWORD);
        takeWeapon.attack();

        // 예제 전략 패턴 적용
        TakeWeaponStrategy takeWeaponStrategy = new TakeWeaponStrategy();
        takeWeaponStrategy.setWeapon(new Sword());
        takeWeaponStrategy.attack();


    }
}
