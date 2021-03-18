/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repository;

import model.entities.Profesor;

/**
 *
 * @author banto
 */
public class ProfesorRepositorio implements Repositorio{

    public ProfesorRepositorio() {
        this.profesores[0] = new Profesor("Lic. Pepito");
        this.profesores[1] = new Profesor("Lic. Agusta");
        this.profesores[2] = new Profesor("Lic. Hugo");
        this.profesores[3] = new Profesor("Lic. Josefina");
    }
    
    private Profesor[] profesores = new Profesor[5];
    
    @Override
    public void guardar(Object item) {        
       for (int i = 0; i < profesores.length; i++) {
            if (profesores[i] == null) {
                  profesores[i] = (Profesor)item;
                  break;
            }
       }
    }

    @Override
    public void borrar(int index) {
        profesores[index - 1] = null;
        if (index - 1 != profesores.length) {
           for (int i = index - 1; i < profesores.length; i++) {
               int indexSuperior = i + 1;
               if (indexSuperior < profesores.length) {
                   profesores[i] = profesores[indexSuperior];
                   profesores[indexSuperior] = null;
               }else if(indexSuperior == profesores.length){
                   profesores[i] = null;
               } 
           }     
        }
    }

    @Override
    public Object[] obtenerListado() {
        return this.profesores;
    }

    @Override
    public Object obtenerItem(int index) {
        return this.profesores[index];
    }
    
    public boolean buscarItem(Object item){
        for (int i = 0; i < profesores.length; i++) {
            if (profesores[i] != null && profesores[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
}
