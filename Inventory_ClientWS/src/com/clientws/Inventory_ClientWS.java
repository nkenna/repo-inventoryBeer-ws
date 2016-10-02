/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientws;

/**
 *
 * @author STEINACOZ-PC
 */
public class Inventory_ClientWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //this guy prints all the beers in our inventory
        for(com.clientws.Beers b:getAllBeers()){
            System.out.println("Beer Name: " + b.beername + "----Price: N" + b.getPrice());
        }
    }
    
    //Drag the getAllBeers Method here (below this comment)

    private static java.util.List<com.clientws.Beers> getAllBeers() {
        com.clientws.BeerService service = new com.clientws.BeerService();
        com.clientws.InventoryPersistBean port = service.getInventoryPersistBeanPort();
        return port.getAllBeers();
    }
    
    
    
    
}
