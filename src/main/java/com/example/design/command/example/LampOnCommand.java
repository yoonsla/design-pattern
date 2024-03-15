package com.example.design.command.example;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LampOnCommand implements Command {

    private final Lamp lamp;

    // Command 인터페이스의 execute 메서드
    public void execute() {
        lamp.turnOn();
    }
}
