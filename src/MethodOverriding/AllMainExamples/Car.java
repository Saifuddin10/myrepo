package MethodOverriding.AllMainExamples;

class Car {
    private Engine engine;

    Car(Engine en) {
        engine = en;
    }

    public static void main(String[] args) {
        System.out.println(new Engine());
    }
}
