/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

/**
 *
 * @author andre
 */
public class Hut extends House {

    @Override
    public void dust() {
        super.run();//calling a super method in the abstact class House (House is the super class)
    }

    @Override
    public void clean() {
    }
    
}
