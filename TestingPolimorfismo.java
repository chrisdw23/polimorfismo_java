public class TestingPolimorfismo {
    public static void main(String[] args) {
        FiguraGeometrica unaFigura = new FiguraGeometrica("Hexágono");
        unaFigura.setArea(48.5);
        unaFigura.setPerimetro(32.9);
        System.out.println();
        System.out.println("Datos de una figura: " + unaFigura);
        System.out.println();

        //Ejemplo de uso de sobrecarga
        FiguraGeometrica otraFigura = new FiguraGeometrica("Pentagono", 25.12);

        System.out.println("Datos de otra figura: " + otraFigura.toString());
        System.out.println();

        Triangulo triangulo1 = new Triangulo("Triangulo 1", 10.2, 15.8);
        System.out.println("Datos del triangulo 1: " + triangulo1.toString());
        System.out.println("Area de triangulo1: " + triangulo1.getArea());
        double perimetro = triangulo1.getPerimetro();
        System.out.println("Perimetro de triangulo1: " + perimetro);
        // Si desde fuera de la clase hija necesitas usar un metodo de clase padre solo debes escribir el objeto de clase hija y el . y el nombre del metodo. Porque un obejto de la clase hija es tambien un objeto de la clase padre.
        triangulo1.setPerimetro(perimetro);
        System.out.println("Datos del triangulo 1: " + triangulo1.toString());


        // Pirámide con volumen dado 
        Piramide piramide1 = new Piramide("Pirámide 1", 200.5);
        System.out.println("Pirámide con volumen dado:" + piramide1);
        System.out.println();

        // Pirámide con volumen y altura 
        Piramide piramide2 = new Piramide("Pirámide 2", 180.0, 30.0);
        System.out.println("Pirámide con volumen y altura:" + piramide2);
        System.out.println();

        // Pirámide con cálculo de volumen 
        Piramide piramide3 = new Piramide("Pirámide 3", 10.0, 8.0, 12.0);
        System.out.println("Pirámide con volumen calculado:" + piramide3);
        System.out.println("Área de la base: " + piramide3.getArea());
        System.out.println("Volumen calculado: " + piramide3.getVolumen());
    }   
}
