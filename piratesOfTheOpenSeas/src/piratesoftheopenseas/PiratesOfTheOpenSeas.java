
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratesoftheopenseas;

import byui.cit260.piratesOfTheOpenSeas.model.Actor;
import byui.cit260.piratesOfTheOpenSeas.model.InventoryItem;
import byui.cit260.piratesOfTheOpenSeas.model.IslandSceneType;
import byui.cit260.piratesOfTheOpenSeas.model.Location;
import byui.cit260.piratesOfTheOpenSeas.model.OpenSeaSceneType;
import byui.cit260.piratesOfTheOpenSeas.model.Player;
import byui.cit260.piratesOfTheOpenSeas.model.SeaPortSceneType;
import byui.cit260.piratesOfTheOpenSeas.model.Ship;

/**
 *
 * @author Roderick
 */
public class PiratesOfTheOpenSeas {
    private static void rolandTests(){
        Player playerOne = new Player();
        InventoryItem inventoryOne = new InventoryItem();
        InventoryItem inventoryTwo = new InventoryItem();
        Location locationOne = new Location();
        Ship shipOne = new Ship();
        
        playerOne.setName("Roland Pecku");
        playerOne.setHighScore(14.00);
        
        inventoryOne.setInventoryType("Cannons");
        inventoryOne.setQuantityInStock(15);
        inventoryOne.setRequiredAmount(10);
        
        inventoryTwo.setInventoryType("Guns");
        inventoryTwo.setQuantityInStock(40.0);
        inventoryTwo.setRequiredAmount(10.0);
        
        locationOne.setRow(12.0);
        locationOne.setColumn(5.0);
        locationOne.setVisited(2);
        locationOne.setNumberRemaining(3);
        
        shipOne.setDescription(" BabyJet, small and very fast");
        shipOne.setCrew(7);
        shipOne.setCannons(5);
        shipOne.setSpeed(3.5);
        shipOne.setMaxCapacity(1000);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        String inventoryCannons = inventoryOne.toString();
        System.out.println(inventoryCannons);
        
        String inventoryGuns = inventoryTwo.toString();
        System.out.println(inventoryGuns);
        
        String locate = locationOne.toString();
        System.out.println(locate);
        
        String shipInfo = shipOne.toString();
        System.out.println(shipInfo);
}
    private static void lizTests(){
         Actor actorOne = new Actor();
      
      actorOne.setDescription("Great cannon shooter");
      actorOne.setName("Shooter");
      actorOne.setType("Pirate");
      
      String actorInfo = actorOne.toString();
      System.out.println(actorInfo);
      
      OpenSeaSceneType openSea = new OpenSeaSceneType();
      
      openSea.setDescription("Choppy high waves");
      openSea.setTravelTime(20);
      openSea.setWeather("Hurricane");
      openSea.setBlocked(false);
      
      String openSeaInfo = openSea.toString();
      System.out.println(openSeaInfo);
      
      OpenSeaSceneType openSeaTwo = new OpenSeaSceneType();
      
      openSeaTwo.setDescription("Calm Sea");
      openSeaTwo.setTravelTime(50);
      openSeaTwo.setWeather("Clear skies");
      openSeaTwo.setBlocked(true);
      
      String openSeaInfoTwo = openSeaTwo.toString();
      System.out.println(openSeaInfoTwo);
      
      SeaPortSceneType seaPortOne = new SeaPortSceneType();
      
      seaPortOne.setDescription("Friendly, good supplies");
      seaPortOne.setTimeLost(5);
      seaPortOne.setNoOfItems(10);
      seaPortOne.setBlocked(false);
      
      String seaPortOneInfo = seaPortOne.toString();
      System.out.println(seaPortOneInfo);
    
      IslandSceneType islandOne = new IslandSceneType();
      
      islandOne.setDescription("Unfriendly Natives, good supplies.");
      islandOne.setTravelTime(2.0);
      islandOne.setBlocked(true);
      
      String islandOneInfo = islandOne.toString();
      System.out.println(islandOneInfo);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rolandTests();  
        lizTests();
    }
    
}

