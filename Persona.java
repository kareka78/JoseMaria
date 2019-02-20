/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolgenealogico;

/**
 *Define personas
 * @author 1DAM
 */
// Tarea: con esta clase en un main, crear tres generaciones de personas
//Abuela3 Abuelo3 Abuela2 Abuelo2 Abuela1 Abuelo1
//   |      |       |        |      |       |
//  ----------     -----------     -----------
//      |           |       |           |
//    Madre2     Padre2   Madre1      Padre1
//   |              |       |           |
//  ------------------    ------------------
//   |              |             |
// Hija2          Hijo2         Hijo1
//Construir este árbol genealógico usando la clase Persona
//y hacer sout(hijo1.devuelveMadre().devuelvePareja().devuelvePadre())
public class Persona {
//Añadir a cada persona un padre y una madre
//Añadir a cada persona una pareja
//Añadir a cada persona un array de hijos     
    private Persona padre;
    private Persona madre;
    private Persona pareja;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private boolean sexo;//true femenino y false masculino
    private Persona[]hijos;
    
     public Persona(String n,String a,String a2,boolean s,Persona p,Persona m,Persona pa,Persona[]hijos){
         if(Persona.esNombreAceptable(n)){
             this.nombre=n;
         }else{
             this.nombre="";
         }
         
         this.primerApellido=a;
         this.segundoApellido=a2;
         this.sexo=s;
         this.madre=m;
         this.padre=p;
         this.pareja=pa;
         this.hijos=hijos;
         
         
         
     }
     public static boolean esNombreAceptable(String nombre){
         if(nombre.equalsIgnoreCase("mamón")){
             return false;
         }
         return true;
     }
   
     public Persona devuelveMadre(){
         return madre;
     }
     public Persona devuelvePareja(){
         return pareja;
     }
     public Persona devuelvePadre(){
         return padre;
     }
    
     public int devuelveNHijos(){
         return hijos.length;
     }
     /**
      * devuelve el hijo nº indice que tuvo esa persona
      * es importante que nunca se ponga un indice mayor que el nº de hijos
      * @param indice
      * @return 
      */
     public Persona devuelveHijo(int indice){
         if(indice>hijos.length){
             return null;
         }
         return this.hijos[indice];
     }
     //Clave1:No tiene argumentos a no ser que sean para coger un elemento de un array
     //Clave2:Devuelven el mismo tipo del que sea la variable interna.Como nombre es String devuelvo String.
     //Clave3:Normalmente lo único que hacen es devolver el valor de la variable.Pero podria hacer otras cosas.
    public String getNombre(){
        return this.nombre;
    }
    //Clave1:No devuelve nada
    //Clave2:recibe por parámetro un objeto del mismo tipo que la variable que queremos modificar
    //Clave3:normalmente lo que hace es restablecer el valor a menos que queramos hacer comprobaciones de seguridad dentro
    public void setNombre(String n){
        if(Persona.esNombreAceptable(n)){
            this.nombre=n;
        }else{
            this.nombre="";
        }
        
    }
    
    public String getSexo(){
        if(this.sexo==false){
            return "Hombre";
        }else{
            return "Mujer";
        }
       
    }
    /**
     * Establece sexo de la persona. Espera recibir "hombre"o"mujer", si recibe otra cosa lo cataloga como "mujer"
     * @param nuevoS 
     */
    public void setSexo(String nuevoS){
        if(nuevoS.equalsIgnoreCase("hombre")){
            this.sexo=false;
        }else{
            this.sexo=true;
        }
    }
    
    public Persona[]getHijos(){
        return hijos;
        
    }
    
    public void setHijos(Persona[]h){
        hijos=h;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona getPareja() {
        return pareja;
    }

    public void setPareja(Persona pareja) {
        this.pareja = pareja;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
}
     

