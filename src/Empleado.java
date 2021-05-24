public  class Empleado extends Persona {

    private Double sueldoBruto;

    public Empleado(String nombre, Integer edad, Double sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public void mostrar(String s) {}


    public  void sueldoNeto(Double w){
       Double sn;
       Double isr = 0.15;
       Double imss = 0.05;

       Double restaIsr = w * isr;
       Double restaImss = w * imss;

       sn = w - restaImss - restaIsr;

        System.out.println("\nEste es mi sueldo neto  " + sn + "\n");
    }

}
