package com.epam.autumn.politech.ht10.behavioral.interpretator;

public class InterpretatorRunner {

        //Rule: Robert and John are male
        public static Expression getOpenExpression(){
            Expression open = new TerminalExpression("[]");
            Expression closedstart = new TerminalExpression("(]");

            return new OpenPluralityExpression(open, closedstart);
        }

        //Rule: Julie is a married women
        public static Expression getCloseExpression(){
            Expression closed = new TerminalExpression("()");
            Expression closedend = new TerminalExpression("[)");
            return new ClosePluraityExpression(closed, closedend);
        }

        public static void main(String[] args) {
            Expression isOpen = getOpenExpression();
            Expression isMarriedWoman = getCloseExpression();

            System.out.println("is it open plurality? " + isOpen.interpret("(1,5]"));
            System.out.println("is it close plurality? " + isMarriedWoman.interpret("[0,3]"));
        }
    }
