package com.kodilla.rockpaperscissors.game;

import static com.kodilla.rockpaperscissors.language.GameMessenger.*;

public class PlayerMove {
    private PlayerMove() {}

    public static void printPlayerMoves(){
        printlnMessage(YOUR_TURN_MSG);
        printlnMessageWithPrefix("1.", ROCK_MSG);
        printlnMessageWithPrefix("2.", PAPER_MSG);
        printlnMessageWithPrefix("3.", SCISSORS_MSG);
        printMessage(ENTER_CHOICE_MSG);
    }

    public static GameLogic.Move getValidPlayerMove() {
        return GameLogic.Move.values()[GameUtilities.getValidIntDecision(1, 3) - 1];
    }
}
