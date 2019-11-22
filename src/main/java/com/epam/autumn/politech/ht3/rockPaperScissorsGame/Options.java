package com.epam.autumn.politech.ht3.rockPaperScissorsGame;

public enum Options {

    ROCK {
        public boolean beats(Options other) {
            return other == SCISSORS;
        }
    },
    PAPER {
        public boolean beats(Options other) {
            return other == ROCK;
        }
    },
    SCISSORS {
        public boolean beats(Options other) {
            return other == PAPER;
        }
    };

    public abstract boolean beats(Options other);

    public static Options parseType(String value) {
        if (value.equalsIgnoreCase(String.valueOf(ROCK))) {
            return ROCK;
        } else if (value.equalsIgnoreCase(String.valueOf(PAPER))) {
            return PAPER;
        } else if (value.equalsIgnoreCase(String.valueOf(SCISSORS))) {
            return SCISSORS;
        }
        return null;
    }
}
