package com.example.design.command.example;

public class Button {

    private Command command;

    // 생성자에서 버튼을 눌렀을 때 필요한 기능을 인지로 받는다.
    public Button(Command command) {
        setCommand(command);
    }

    private void setCommand(Command newCommand) {
        this.command = newCommand;
    }

    // 버튼이 눌리면 주어진 Command의 execute 메서드를 호출한다.
    public void pressed() {
        command.execute();
    }
}
