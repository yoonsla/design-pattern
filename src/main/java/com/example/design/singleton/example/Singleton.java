package com.example.design.singleton.example;

public class Singleton {

//    private static Singleton singletonObject;
//    private static final Singleton SINGLETON_OBJECT = new Singleton();

    public Singleton() {
    }

    // Thread Safe하지 않는 문제점이 있다.
    // Thread가 동시 실행되면 싱글톤 객체가 두번 초기화되어 다른 주소를 참조할 수 있다.
//    public static Singleton getInstance() {
//        if (singletonObject == null) {
//            singletonObject = new Singleton();
//        }
//        return singletonObject;
//    }

    // sychronized 키워드를 통해 getInstance() 메서드에 하나의 스레드만 접근 가능하게 할 수 있다.
//    public static synchronized Singleton getInstance() {
//        if (singletonObject == null) {
//            singletonObject = new Singleton();
//        }
//        return singletonObject;
//    }

    // 싱글톤 객체를 생성하는 비용이 크지 않은 경우 이른 초기화 방법을 적용할 수 있다.
//    public static synchronized Singleton getInstance() {
//        return SINGLETON_OBJECT;
//    }

    // Bill Pugh Solution 사용 (권장)
    // private static inner class를 사용하여 Thread Safe한 싱글톤 패턴을 구현하는 방법
    private static class SingletonHolder {
        private static final Singleton SINGLETON_OBJECT = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON_OBJECT;
    }
}
