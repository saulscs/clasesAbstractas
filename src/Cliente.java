public class Cliente extends Persona {

    //1.- Atributos

    private String telefono;

    //2.- Metodo super

    public Cliente(String nombre, Integer edad, String telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    //3.- Sobre escribimos las clase mostrar

    @Override
    public void mostrar(String s) {
        System.out.println("\nEste es mi telefono " + telefono + "\n");
    }




}
