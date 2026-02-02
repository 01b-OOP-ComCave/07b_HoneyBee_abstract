package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();   

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);

         //-- Das geht jetzt nicht mehr!--//
        // HoneyBee bee = new HoneyBee(); // abstrakte Superklasse!
        // pollObj(bee);

        Bird bird = new Bird();
        pollObj(bird);
     
    }

   
    /* 3. Iteration Polymorphie */  

    private static void pollObj(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-------------------");
    }



   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


