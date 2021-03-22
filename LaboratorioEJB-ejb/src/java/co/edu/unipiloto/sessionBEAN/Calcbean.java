/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Stateless;

/**
 *
 * @author JEFRY
 */
@Stateless
public class Calcbean implements CalcbeanLocal {

    @Override
    public Integer sumar(int val1, int val2) {
        return val1+val2;
    }

    @Override
    public Integer restar(int val1, int val2) {
        return val1-val2;
    }

    @Override
    public Double dividir(double val1, double val2) {
        return val1/val2;
    }

    @Override
    public Integer modulo(int val1, int val2) {
        return val1%val2;
    }

    @Override
    public Integer multiplicar(int val1, int val2) {
        return val1*val2;
    }

    @Override
    public Long cuadrado(long val1) {
        return val1*val1;
    }

    
}
