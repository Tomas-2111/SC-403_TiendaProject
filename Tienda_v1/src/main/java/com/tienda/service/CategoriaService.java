/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.tienda.service;

/**
 *
 * @author Tomás Alfaro
 */

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    //Asigna el metodo para despues implentarlo en el serviceImp
    //Read
    public List<Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria(Categoria);
    
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);

}
