package com.example.design;

import com.example.design.command.example.Alarm;
import com.example.design.command.example.AlarmStartCommand;
import com.example.design.command.example.Button;
import com.example.design.command.example.Lamp;
import com.example.design.command.example.LampOnCommand;
import com.example.design.strategy.basic.ConcreteStrategyA;
import com.example.design.strategy.basic.ConcreteStrategyB;
import com.example.design.strategy.basic.Context;
import com.example.design.strategy.example.TakeWeapon;
import com.example.design.strategy.example.TakeWeaponPattern.Sword;
import com.example.design.strategy.example.TakeWeaponPattern.TakeWeaponStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignApplication.class, args);

        // 전략적 패턴 !!!!!!!

        Context context = new Context();
        // 전략 설정
        context.setStrategy(new ConcreteStrategyA());
        // 전략 실행
        context.doSomething();
        // 다른 전략 설정
        context.setStrategy(new ConcreteStrategyB());
        // 다른 전략 시행
        context.doSomething();

        // 예제 패턴 미적용
        TakeWeapon takeWeapon = new TakeWeapon();
        takeWeapon.setWeapon(TakeWeapon.SWORD);
        takeWeapon.attack();

        // 예제 전략 패턴 적용
        TakeWeaponStrategy takeWeaponStrategy = new TakeWeaponStrategy();
        takeWeaponStrategy.setWeapon(new Sword());
        takeWeaponStrategy.attack();

        // command 패턴 !!!!!!!
        // 예제 command 패턴 적용
        Lamp lamp = new Lamp();
        LampOnCommand lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        AlarmStartCommand alarmStartCommand = new AlarmStartCommand(alarm);

        Button lampButton = new Button(lampOnCommand);
        lampButton.pressed();

        Button alarmButton = new Button(alarmStartCommand);
        alarmButton.pressed();
    }
}
