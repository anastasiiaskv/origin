/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author macbook
 */
public class SimpleCalc {
    private double a;
    private double b;

SimpleCalc(double p1,double p2) {
this.a=p1;
this.b=p2;
}

public double getSum() {
    return this.a+this.b;
}
public double Mnozh() {
    return this.a*this.b;
}
public double Dilen() {
    return this.a/this.b;
}
public double Minus() {
    return this.a-this.b;
}
public double Ostatok() {
    return this.a%this.b;
}
}
