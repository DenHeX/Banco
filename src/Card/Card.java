/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card;

import StatusControl.StatusControl;

/**
 *
 * @author ´Felipe Chacón
 */
public abstract class Card implements StatusControl {
    private String number;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public boolean isActive() {
        return active;
    }

    public Card(String number, boolean active) {
        this.number = number;
        this.active = active;
    }
    
    @Override
    public void activate(){
        this.active = true;
    }
    
    @Override
    public void deactivate(){
        this.active = false;
    }
    
    public abstract boolean MakePurchase(double amount);
}