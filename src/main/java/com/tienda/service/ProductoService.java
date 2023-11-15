/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

/**
 *
 * @author LUIS
 */
public interface ProductoService {
    
    public List<Producto> getProductos(boolean activo);
    
    
    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
    //Ejemplo de una consulta con un Quety
    public List <Producto> consultaQuery(double precioInf,double precioSup);
    
    //Ejemplo de una consulta con un JPQL
    public List <Producto> consultaJPQL(double precioInf,double precioSup);
    
}
