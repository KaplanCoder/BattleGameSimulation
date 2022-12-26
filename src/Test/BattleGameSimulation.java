package Test;

import Business.GameEngine;


public class BattleGameSimulation {


        public static void main(String[] args) throws Exception {
            // Default player number is two.
            GameEngine e=new GameEngine(2);	//Based on the argument, simulation can be run with multiple players.
            e.init();
        }
    
}