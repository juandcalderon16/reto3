
package com.mycompany.reto3;
import java.time.YearMonth;


public class Automovil {
    private String placa;
    private String marca;
    private int modelo;
    private double kilometraje;
    private String color;
    private double precio;
    private String descripcion;
    private int año;
    private String vendedor;

    public Automovil(String placa, String marca, int modelo, double kilometraje, String color, double precio, String descripcion, String vendedor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.precio = precio;
        this.descripcion = descripcion;
        this.vendedor = vendedor;
    }

    public Automovil() {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.precio = precio;
        this.descripcion = descripcion;
        this.vendedor = vendedor;
    }
    
    public String calcularUso()
    {
        
        if(kilometraje==0){
            return "el " + marca + " es 0 Km";
        } else if(kilometraje<1000){
            return "el " + marca + " es nuevo";
        } else if(kilometraje<20000){
            return "el " + marca + " es casi nuevo";
        } else if(kilometraje<100000){
            return "el " + marca + " es usado"; 
        }
        return "el " + marca + " es muy usado";
    }
    
    public String calcularModelo(){
        if(YearMonth.now().getYear()-modelo==0){
           return "El " + marca + " es ultimo modelo"; 
        } else if(YearMonth.now().getYear()-modelo<3){
           return "El " + marca + " es modelo nuevo.";
        } else if(YearMonth.now().getYear()-modelo<10){
           return "El " + marca + " es modelo intermedio";
        }return "El " + marca + " es modelo antiguo";
    }
    
    }