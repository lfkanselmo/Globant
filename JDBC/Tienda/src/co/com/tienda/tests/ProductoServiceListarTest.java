/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tienda.tests;

import co.com.tienda.servicios.ProductoService;

/**
 *
 * @author Krausser
 */
public class ProductoServiceListarTest {
    
    public static void main(String[] args){
        //ProductoService.listarNombreProductos();
        ProductoService.listarProductosNombreYPrecio();
        ProductoService.listarEntreDosPrecios(202, 120);
        //ProductoService.listarPorNombreBuscado("portatil");
        //ProductoService.listarProductoMenorPrecio();
    }
    
}
