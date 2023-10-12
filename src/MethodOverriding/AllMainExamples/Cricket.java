package MethodOverriding.AllMainExamples;

class Game {
    public void type() {
        System.out.println("InDoor & OutDoor Games");
    }
}

public class Cricket extends Game {
    public void type() {
        System.out.println("OutDoor Games");
    }

    public static void main(String[] args) {
        Game game = new Game();
        Cricket cricket = new Cricket();
        game.type();
        cricket.type();
        game = cricket;
        game.type();
    }
}
