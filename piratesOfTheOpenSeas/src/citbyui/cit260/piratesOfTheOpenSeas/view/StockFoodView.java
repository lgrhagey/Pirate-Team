/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.GameControl;
import byui.cit260.piratesOfTheOpenSeas.control.InventoryControl;
import byui.cit260.piratesOfTheOpenSeas.model.Barrel;
import byui.cit260.piratesOfTheOpenSeas.model.Game;
import byui.cit260.piratesOfTheOpenSeas.model.InventoryItem;
import byui.cit260.piratesOfTheOpenSeas.model.Ship;
import citbyui.cit260.piratesOfTheOpenSeas.exceptions.InventoryControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */

public class StockFoodView {
    
    private String promptMessagePeople;
    private String promptMessageDays;
    private String promptMessagePounds;
    
    protected final BufferedReader keyboard = PiratesOfTheOpenSeas.getInFile();
    protected final PrintWriter console = PiratesOfTheOpenSeas.getOutFile();
    Game game = PiratesOfTheOpenSeas.getCurrentGame();
    Ship ship = game.getShip();
    InventoryItem [] inventory = game.getInventory();
    double shipMaxWeight = ship.getMaxCapacity();
    double shipCurrentWeight = ship.getCurrentCargoWeight();
    
    public StockFoodView() {
    
    }
    
    public double getFoodNeeded(){
         double currentFood = inventory[GameControl.Item.food.ordinal()].getQuantityInStock();
        
        this.promptMessagePeople="Enter the number of people on your boat "
            + "including yourself. To cancel enter -1";
        this.promptMessageDays="Enter the number of days before you think "
             + "you will be able to restock again. To cancel enter -1";
        this.promptMessagePounds="Enter the pounds per person per day of food you want, "
                + "3 pounds per person per day is recomended. To cancel enter -1";
        
          // get infile for keyboard
       int value = 0;// value to be returned
       boolean finished = false;//initialize to not valid
       //Scanner keyboard = new Scanner(System.in);
      try { 
       while(!finished){//loop while an invalid value is entered
           this.console.println("\n" + this.promptMessagePeople);
           int iPeople = keyboard.read();
           if(iPeople == -1) {
               finished = true;
               this.console.println("You canceled");
               continue;
           }
               
           this.console.println("\n" + this.promptMessageDays);
           int iDays = keyboard.read();
           if(iDays == -1) {
               finished = true;
               this.console.println("You canceled");
               continue;
           }
           this.console.println("\n" + this.promptMessagePounds);
           int iPounds = keyboard.read();
           if(iPounds == -1) {
               finished = true;
               this.console.println("You canceled");
               continue;
           }
               
            try {
                value = InventoryControl.calcFoodWanted(iPeople, iPounds, iDays);
            }catch (InventoryControlException me) {
                this.console.println(me.getMessage());
             }
            /*if (value == -1){
                System.out.println("Invalid entries, please try again");
            }
            else {
                finished = true;
                System.out.println("You will need " + value + " pounds of food.");
            }
      */
        }
      }
      catch (Exception e) {
          ErrorView.display(this.getClass().getName(),
                            "Error" + e.getMessage());
      }
        return value;//return the value entered
    }
     
       
}
   
  
    
    

