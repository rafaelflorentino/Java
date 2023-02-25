package AnnotationEinterface;
@Autor( // Annotation com parametros
    nome = "Benjamin Franklin",
    data = "3/27/2003"
)

public class Principal {
    public static void main(String[] args) {
        Circulo c = new Circulo(5.0);
        Quadrado q = new Quadrado(2.0);
        imprimeArea(c);
        imprimeArea(q);
    }

    public static void imprimeArea(FormaGeometrica f) {
        System.out.println("A área é: " + f.area());
    }

             
}
