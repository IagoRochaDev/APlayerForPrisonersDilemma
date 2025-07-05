/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clonador;

import io.github.guisso.meleeinterface.Decision;
import io.github.guisso.meleeinterface.IPlayer;

/**
 *
 * @author Iago Rocha Oliveira
 */
public class Clonador implements IPlayer{

    @Override
    public String getDeveloperName() {
        return "Iago Rocha Oliveira";
    }

    @Override
    public String getEngineName() {
        return ": Olho por olho!!";
    }

    @Override
    public Decision makeMyMove(Decision opponentPreviousMove) {
        if(Decision.NONE == opponentPreviousMove){
            return Decision.COOPERATE;
        }
        return opponentPreviousMove;
    }

    
}
