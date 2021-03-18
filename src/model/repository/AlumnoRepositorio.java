/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.repository;

import model.entities.Alumno;

/**
 *
 * @author banto
 */
public class AlumnoRepositorio implements Repositorio{

    public AlumnoRepositorio() {
        this.alumnos[0] = new Alumno("Ernesto", "Buitron");
        this.alumnos[1] = new Alumno("Julia", "Gonzalez");
        this.alumnos[2] = new Alumno("Enrique", "Gonzalez");
        this.alumnos[3] = new Alumno("Ernesto", "Guevara");
    }
    
    private Alumno[] alumnos = new Alumno[5];
    
    @Override
    public void guardar(Object item) {        
       for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                  alumnos[i] = (Alumno)item;
                  break;
            }
       }
    }

    @Override
    public void borrar(int index) {
        alumnos[index - 1] = null;
        if (index - 1 != alumnos.length) {
           for (int i = index - 1; i < alumnos.length; i++) {
               int indexSuperior = i + 1;
               if (indexSuperior < alumnos.length) {
                   alumnos[i] = alumnos[indexSuperior];
                   alumnos[indexSuperior] = null;
               }else if(indexSuperior == alumnos.length){
                   alumnos[i] = null;
               } 
           }     
        }
    }

    @Override
    public Object[] obtenerListado() {
        return this.alumnos;
    }

    @Override
    public Object obtenerItem(int index) {
        return this.alumnos[index];
    }
    
    public boolean buscarItem(Object item){
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
}
