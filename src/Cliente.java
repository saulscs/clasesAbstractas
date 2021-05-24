public class Cliente extends Persona {

    private String telefono;

    public Cliente(String nombre, Integer edad, String telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    @Override
    public void mostrar(String s) {
        System.out.println("\nEste es mi telefono " + telefono + "\n");
    }




}
