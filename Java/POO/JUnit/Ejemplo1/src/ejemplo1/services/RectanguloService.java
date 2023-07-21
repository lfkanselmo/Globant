/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1.services;

import ejemplo1.Rectangulo;

/**
 *
 * @author Krausser
 */
public class RectanguloService {
    
    public double calcularArea(Rectangulo r){
        return r.getAncho()*r.getLargo();
    }
}
