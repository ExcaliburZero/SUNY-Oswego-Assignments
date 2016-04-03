/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab09;

import java.text.DecimalFormat;

/**
 * The Candy class is used to store information about a piece of candy. It
 * stores the name, price, and weight in ounces of the candy.
 * <br/><br/>
 * When printed, objects of the candy class return the name, price, and weight
 * in ounces formatted with labels.
 *
 * @author Christopher Wells <cwellsny@nycap.rr.com>
 */
public class Candy {

    private String name;    // The name of the candy
    private float price;    // The price of the candy
    private int ounces; // The weight of the candy in ounces

    private DecimalFormat df = new DecimalFormat("0.00");

    /**
     * The constructor method used to create Candy objects and initialize their
     * variable values.
     *
     * @param n The name of the candy
     * @param p The price of the candy
     * @param o The weight of the candy in ounces
     */
    public Candy(String n, float p, int o) {
        name = n;
        price = p;
        ounces = o;
    }

    /**
     * The method used to return the variable contents of the Candy object as a
     * string. Gives the name, price, and weight in ounces of the candy.
     *
     * @return The name, price, and weight of the candy in ounces concatenated
     * and labeled
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nPrice: " + df.format(price) + "\nOunces: " + ounces;
    }

    /**
     * The method used to get the name of the Candy.
     *
     * @return The name of the candy
     */
    public String getName() {
        return name;
    }
}
