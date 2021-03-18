/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repository;

import model.entities.Materia;
import model.entities.Profesor;

/**
 *
 * @author banto
 */
public class MateriaRepositorio implements Repositorio{

    public MateriaRepositorio() {
        this.materias[0] = new Materia("Matematicas", new Profesor("Lic. Pepito"));
        this.materias[1] = new Materia("Programacion", new Profesor("Lic. Agusta"));
        this.materias[2] = new Materia("Base de Datos", new Profesor("Lic. Hugo"));
        this.materias[3] = new Materia("Pedagogia", new Profesor("Lic. Josefina"));
    }
    
    private Materia[] materias = new Materia[5];
    
    @Override
    public void guardar(Object item) {        
       for (int i = 0; i < materias.length; i++) {
            if (materias[i] == null) {
                  materias[i] = (Materia)item;
                  break;
            }
       }
    }

    @Override
    public void borrar(int index) {
        materias[index - 1] = null;
        if (index - 1 != materias.length) {
           for (int i = index - 1; i < materias.length; i++) {
               int indexSuperior = i + 1;
               if (indexSuperior < materias.length) {
                   materias[i] = materias[indexSuperior];
                   materias[indexSuperior] = null;
               }else if(indexSuperior == materias.length){
                   materias[i] = null;
               } 
           }     
        }
    }

    @Override
    public Object[] obtenerListado() {
        return this.materias;
    }

    @Override
    public Object obtenerItem(int index) {
        return this.materias[index];
    }
    
    public boolean buscarItem(Object item){
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] != null && materias[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
}
