/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_felixdominguez_12141043;

/**
 *
 * @author Lenovo I7
 */
public class Animal {
    private String nombrec;
    private String nombre;
    private String habitat;
    private String alimentacion;
    private String rasgos;
    private String geo;
    private int vida;
    
    public Animal(String nc, String n, String h, String a, String r, String g, int v){
        setNombrec(nc);
        setNombre(n);
        setHabitat(h);
        setAlimentacion(a);
        setRasgos(r);
        setGeo(g);
        setVida(v);
    }
    
    public void setNombrec(String nc){
        nombrec=nc;
    }

    public String getImei(){
        return nombrec;
    } 
    
    public void setNombre(String n){
        nombre=n;
    }

    public String getNombre(){
        return nombre;
    } 
    
    public void setHabitat(String h){
        habitat=h;
    }

    public String getHabitat(){
        return habitat;
    }
    
    public void setAlimentacion(String a){
        alimentacion=a;
    }

    public String getAlimentacion(){
        return alimentacion;
    } 
    
    public void setRasgos(String r){
        rasgos=r;
    }

    public String getRasgos(){
        return rasgos;
    } 
    
    public void setGeo(String g){
        geo=g;
    }

    public String getGeo(){
        return geo;
    } 
    
    public void setVida(int v){
        vida=v;
    }

    public int getVida(){
        return vida;
    }
    
  @Override
  public String toString(){
    return "Nombre Cientifico="+nombrec+
            "\n Nombre Comun="+nombre+
            "\n Habitat="+habitat+
            "\n Alimentacion="+alimentacion+
            "\n Rasgos="+rasgos+
            "\n Distribucion Geografica="+geo+
            "\n Vida="+vida+
            "\n"+"\n";
  }
     
}
