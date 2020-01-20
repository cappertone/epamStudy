package com.epam.autumn.politech.ht10.behavioral.command;

public class NewGame implements Command {
    private Game game;
    public NewGame(Game game) {
        this.game = game;
    }
    @Override
    public void execute() {
        game.newGame();
    }
}
