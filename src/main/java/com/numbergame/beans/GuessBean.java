package com.numbergame.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Random;

@ManagedBean(name = "guessBean")
//@ApplicationScoped //Guarda la información en general y no por sesión
@SessionScoped //Guarda la información por sesión y no por aplicación
public class GuessBean {
    private int currentNumber;
    private int numAttempts;
    private int currentPrize;
    private String gameStatus = "";
    private int guessNumber;
    private ArrayList<Integer> failedAttempts;

    public GuessBean() {
        gameStatus = "Comenzar a jugar ";
        restart();
    }

    public ArrayList<Integer> getFailedAttempts() {
        return failedAttempts;
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber (int guessNumber) {
        this.guessNumber = guessNumber;
    }
    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public int getNumAttempts() {
        return numAttempts;
    }

    public void setNumAttempts(int numAttempts) {
        this.numAttempts = numAttempts;
    }

    public int getCurrentPrize() {
        return currentPrize;
    }

    public void setCurrentPrize(int currentPrize) {
        this.currentPrize = currentPrize;
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void guess(int guessNumber) {
        if (numAttempts == 0){
            gameStatus = "Comenzar a jugar ";
        }
        if (guessNumber == currentNumber) {
            gameStatus = "Ganaste $"+ currentPrize +"!";
            restart();
        } else {
            numAttempts++;
            currentPrize -= 10000;
            this.failedAttempts.add(0, guessNumber);
            this.guessNumber = 0;
            if (currentPrize == 0){
                gameStatus = "Perdiste :c";
                restart();
            }
        }
    }

    public void restart() {
        Random random = new Random();
        currentNumber = random.nextInt(100) + 1;
        numAttempts = 0;
        currentPrize = 100000;
        guessNumber = 0;
        failedAttempts = new ArrayList<>();
    }
}

