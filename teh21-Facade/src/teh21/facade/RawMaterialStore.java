/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teh21.facade;

/**
 *
 * @author koivi
 */
public class RawMaterialStore implements Store{

    @Override
    public Goods getGoods() {
        return new RawMaterialGoods();
    }
    
}
