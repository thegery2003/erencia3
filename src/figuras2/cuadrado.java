package figuras2;

public class cuadrado extends Figura {
    //& se define la variable que se va a usar
    private double lado1;

    public cuadrado(double lado1) {
        this.lado1 = lado1;

    }
    @Override
    public double calcularArea() {
        double a= lado1*lado1;
        return a;
    }
    //! se hace la operacion requerida
    @Override
    public double calcularPerimetro() {
        return lado1*4;
    }
    //= se hace el texto y lo que va a salir en el final
    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", area=" + calcularArea() +
                ",perimetro="+calcularPerimetro()+
                '}';
    }
}
