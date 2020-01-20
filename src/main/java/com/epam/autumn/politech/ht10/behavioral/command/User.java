package com.epam.autumn.politech.ht10.behavioral.command;

public class User {
   private Command newGame;
   private Command start;
   private Command save;

    public User(Command newGame, Command start, Command save) {
        this.newGame = newGame;
        this.start = start;
        this.save = save;
    }
    void createNewGame(){
        newGame.execute();
    }
    void startGame(){
        start.execute();
    }
    void saveGame(){
        save.execute();
    }

}
