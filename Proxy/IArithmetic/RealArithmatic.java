/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IArithmetic;

/**
 *
 * @author Hasmukh
 */
public class RealArithmatic implements IArithmatic {
    float ans;
    @Override
    public float doIt(float a, float b) {
        ans = a + b;
        return  ans;
    }
    
}
