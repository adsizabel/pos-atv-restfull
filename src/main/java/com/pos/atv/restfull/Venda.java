/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.atv.restfull;

/**
 *
 * @author Izabel Silva
 */
public class Venda {
    private int id;
    private double valorTotal;

    public Venda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", valorTotal=" + valorTotal + '}';
    }
    
    
    
}
