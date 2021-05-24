public class Directivo extends Empleado {
    //1.- Atributos
    private String categoria;

    //2.- Super clase
    public Directivo(String nombre, Integer edad, Double sueldoBruto) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

}
