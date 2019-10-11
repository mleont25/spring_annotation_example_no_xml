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
public class SecretariaEmpleados {
        String nombre;
    public SecretariaEmpleados() {
    }

    public String getTarea(){
        return "Soy secretaria y tengo la tarea de adminisntrar las agenda de los jefes";
    }
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
