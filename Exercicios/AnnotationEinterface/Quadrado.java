package AnnotationEinterface;

public class Quadrado implements FormaGeometrica, FiguraGeometrica {
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override // Annotation para sobrescrever o método getArea()
    public double getArea() {
        double area = 0;
        area = lado * lado;
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro = 0;
        perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public String getNomeFigura() {
        return "quadrado";
    }
}