/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolgenealogico;

import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class ArbolGenealogico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Persona abuelo3=new Persona("Paco","Pin","Ocho",false,null,null,null,null);
         Persona abuela3=new Persona("Gertrudis","Tinta","Pon",true,null,null,abuelo3,null);
         abuelo3.setPareja(abuela3);
         Persona madre2=new Persona("Pepa","Pin","Tinta",true,abuelo3,abuela3,null,null);
         Persona[]hijosDeAbuela3={madre2};
         abuela3.setHijos(hijosDeAbuela3);
         
         
        
         
          Persona abuelo2= new Persona("Felipe","Catorce","Rico",false,null,null,null,null);
          Persona abuela2= new Persona("Ana","Rey","Lopez",true,null,null,abuelo2,null);
          abuelo2.setPareja(abuela2);
          Persona padre2= new Persona("Luis","Catorce","Rey",false,abuelo2,abuela2,madre2,null);
          Persona madre1= new Persona("Isabel","Catorce","Rey",true,abuelo2,abuela2,null,null);
          madre2.setPareja(padre2);
          Persona[]hijosDeAbuela2={padre2,madre1};
          abuela2.setHijos(hijosDeAbuela2);
          
          
          
          Persona abuelo1= new Persona("Leopoldo","Hermoso","Campo",false,null,null,null,null);
          Persona abuela1= new Persona("Ana","Lizando","Oración",true,null,null,abuelo1,null);
          abuelo1.setPareja(abuela1);
          Persona padre1= new Persona("Luis","Hermoso","Lizando",false,abuelo1,abuela1,madre1,null);
          madre1.setPareja(padre1);
          Persona[]hijosDeAbuela1={padre1};
          abuela1.setHijos(hijosDeAbuela1);
          
          
          
          Persona hija2= new Persona("Juanola","Catorce","Pin",true,padre2,madre2,null,null);
          Persona hijo2= new Persona("Gonzalo","Catorce","Pin",true,padre2,madre2,null,null);
          Persona hijo1= new Persona("Andres","Hermoso","Catorce",false,padre1,madre1,null,null);
          
          
          hijo2.devuelveMadre();
          madre1.devuelvePareja();
          madre2.devuelvePadre();
          System.out.println(hijo2.devuelveMadre().devuelvePareja().devuelvePadre().getNombre());
          System.out.println(hijo1.devuelveMadre().devuelvePareja().devuelvePadre().getNombre());
          System.out.println(hija2.devuelveMadre().devuelvePareja().devuelvePadre().getNombre());
          System.out.println(hijo2.devuelvePadre().devuelvePareja().devuelveMadre().getNombre());
          System.out.println(hija2.devuelvePadre().devuelvePareja().devuelveMadre().getNombre());
          System.out.println(hijo1.devuelvePadre().devuelvePareja().devuelveMadre().getNombre());
          
        
    }
    public boolean irAlREgistroCivilACambiarNombre(Persona p){
        Scanner s= new Scanner(System.in);
        System.out.println("Dime el nuevo nombre que quieres ponerte: ");
        String nuevoNombre=s.nextLine();
        if(Persona.esNombreAceptable(nuevoNombre)){
            p.setNombre(nuevoNombre);
           
        }else{
            System.out.println("No te puedes poner ese nombre");
            return false;
        }
         return true;
    }
}
