/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.entities.Alumno;
import model.repository.AlumnoRepositorio;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author banto
 */
public class MainConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Alumno alumno = new Alumno("Ernesto", "Gonzalez");
        //Alumno[] alumnos = new Alumno[2];
        //Profesor profesor = new Profesor("Lic Pepito");
        //Materia matematicas = new Materia("1er semestre", alumnos, profesor);
        
        //System.out.println(alumno.toString());
        Alumno alumno = new Alumno("Elizabeth", "Armas");
        Alumno alumno2 = new Alumno("Orlando", "Ortega");
        AlumnoRepositorio alumnosRepositorio = new AlumnoRepositorio();
        alumnosRepositorio.guardar(alumno);
        Alumno[] alumnos = (Alumno[]) alumnosRepositorio.obtenerListado();
        
       
       // System.out.println(alumnosRepositorio.obtenerItem(4));
        
        System.out.println(alumnosRepositorio.buscarItem(alumno));
        System.out.println(alumnosRepositorio.buscarItem(alumno2));
        alumnosRepositorio.borrar(2);
        alumnosRepositorio.borrar(4);
        for (int i = 0; i < alumnosRepositorio.obtenerListado().length; i++) {
            System.out.println(alumnos[i]);
        }
    }    
}
