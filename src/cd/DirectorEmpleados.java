/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd;

/**
 *
 * @author Posgrado-3
 */
public class DirectorEmpleados{
            String nombre;
    public DirectorEmpleados() {
    }

    public String getTarea(){
        return "Soy director y tengo la tarea de adminisntrar los recursos de la empresa";
    }
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
