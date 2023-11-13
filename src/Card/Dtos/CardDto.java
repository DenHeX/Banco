/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Card.Dtos;

import Card.*;
import StatusControl.StatusControl;

/**
 *
 * @author ´Felipe Chacón
 */
public abstract class CardDto {
    private String number;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public boolean isActive() {
        return active;
    }

    public CardDto(String number) {
        this.number = number;
        this.active = true;
    }

}