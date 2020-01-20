package com.epam.autumn.politech.ht10.behavioral.command;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        User user = new User(new Start(game), new NewGame(game), new Save(game));

        user.createNewGame();
        user.startGame();
        user.saveGame();

    }
}
