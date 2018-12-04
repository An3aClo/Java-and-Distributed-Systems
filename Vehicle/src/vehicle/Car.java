/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author andre
 */
public class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("Im the move method in the car class");
    }

    @Override
    public void stop() {
        System.out.println("Im the stop method in the car class");
    }
    
}
