/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.tienda.service;

/**
 *
 * @author Tomás Alfaro
 */

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    //Asigna el metodo para despues implentarlo en el serviceImp
    //Read
    public List<Producto> getProductos(boolean activos);
    
    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);

}

