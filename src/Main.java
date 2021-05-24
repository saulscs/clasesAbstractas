//clase principal
public class Main {
    public static void main(String[] args){

        //llamamos al objeto empleado
        Empleado a = new Empleado("Luis", 29, 10000.00);
        a.informacion();
        a.sueldoNeto(10000.00);

        //llamamos al objeto cliente
        Cliente b = new Cliente("Jose", 35, "3213-3213");
        b.informacion();
        b.mostrar("3213-3213");

        //llamamos al objeto directivo
        Directivo c = new Directivo("Juan", 40, 50000.00);
        c.informacion();
        c.sueldoNeto(50000.00);
    }
}
