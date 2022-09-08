package figuras2;

public class triangulo extends Figura{
    //& se definene los valores que se van a utilizar
    private double lado3;
    private double area;
    private double lado1;
    private double lado2;
    private double perimetro;

    public triangulo(double lado1, double lado2, double lado3) {
        this.lado3 = lado3;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override//Ñ se hace la operacion requerida
    public double calcularArea() {
        double s=(lado1+lado2+lado3)/2;
        area=Math.sqrt((s*(s-lado1)*(s-lado2)*(s-lado3)));
        return area;
    }
    @Override
    public double calcularPerimetro() {
        perimetro=lado1+lado2+lado3;
        return perimetro;
    }
    @Override//= se hace el texto y lo que va a salir en el final
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", area=" + calcularArea() +
                ",perimetro="+calcularPerimetro()+
                '}';
    }}
