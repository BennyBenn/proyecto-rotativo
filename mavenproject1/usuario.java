/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kevin
 */
public class usuario {
     private String matricula;
	    private String nombre;
	    private String carrera;
	    private int horaDeEntrada;
	    public void setMatricula(String matricula){
	        this.matricula= matricula;
	        }
	    public String GetMatricula(){
	        return this.matricula;
	    }
	    public void setNombre(String nombre){
	        this.nombre=nombre;
	    }
	    public String getNombre(){
	        return this.nombre;
	    }
	    public void setCarrera(String carrera){
	        this.carrera=carrera;
	    }
	    public String getcarrera(){
	        return carrera;
	    }
	    public void SetHoraDeEntrada(int horaDeEntrada){
	        this.horaDeEntrada= horaDeEntrada;
	    }
	    public int GetHoraDeEntrada(){
	        return horaDeEntrada;
	    }
}
