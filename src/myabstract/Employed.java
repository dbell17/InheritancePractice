/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Don
 */
public abstract class Employed {
    boolean stillEmployed = true;

    public boolean isStillEmployed() {
        return stillEmployed;
    }

    public void setStillEmployed(boolean stillEmployed) {
        this.stillEmployed = stillEmployed;
    }
}
