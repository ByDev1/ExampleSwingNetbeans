/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repository;

/**
 *
 * @author banto
 */
public interface Repositorio {
     public void guardar(Object item);
     public void borrar(int index);
     public Object[] obtenerListado();
     public Object obtenerItem(int index);
}
