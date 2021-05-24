public class Main {
    public static void main(String[] args){
        Empleado a = new Empleado("Luis", 29, 10000.00);
        a.informacion();
        a.sueldoNeto(10000.00);

        Cliente b = new Cliente("Jose", 35, "3213-3213");
        b.informacion();
        b.mostrar("3213-3213");
    }
}
