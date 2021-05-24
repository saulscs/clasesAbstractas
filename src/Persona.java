//Clase abstracta

public abstract class Persona {

    //1.- Atributos
    private String nombre;
    private Integer edad;

    //2.- Contructor
    public  Persona(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    public void informacion(){
        System.out.println("\nMi nombre es " + nombre + " y tengo " + edad + " años\n");
    }



    public abstract void mostrar(String s);
}
