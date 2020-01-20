package com.epam.autumn.politech.ht10.behavioral.command;


public class Start implements Command {
    private Game game;
    public Start(Game game) {
        this.game = game;
    }
    @Override
    public void execute() {
        game.start();
    }
}
