package com.example.design.command.example;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AlarmStartCommand implements Command {

    private final Alarm alarm;

    // Command 인터페이스의 execute 메서드
    public void execute() {
        alarm.start();
    }
}
