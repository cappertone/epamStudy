package com.epam.autumn.politech.ht10.behavioral.command;

public class Save implements Command {
    private Game game;
    public Save(Game game) {
        this.game = game;
    }
    @Override
    public void execute() {
        game.save();
    }
}
