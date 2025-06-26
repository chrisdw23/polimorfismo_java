public class Piramide extends Triangulo {
    private double volumen;
    private double alturaPiramide;

    // Constructor 1: volumen
    public Piramide(String nombre, double volumen) {
        super(nombre, 0, 0); // base y altura 0 porque no se dan
        this.volumen = volumen;
    }

    // Constructor 2: volumen y altura de la pirámide
    public Piramide(String nombre, double volumen, double alturaPiramide) {
        super(nombre, 0, 0);
        this.volumen = volumen;
        this.alturaPiramide = alturaPiramide;
    }
    
    public Piramide(String nombre, double base, double alturaTriangulo, double alturaPiramide) {
        super(nombre, base, alturaTriangulo);
        this.alturaPiramide = alturaPiramide;
        this.volumen = calcularVolumen();
    }

    // Método para obtener el volumen calculado
    private double calcularVolumen() {
        double areaBase = super.getArea();
        return (areaBase * alturaPiramide) / 3;
    }

    // Getter del volumen
    public double getVolumen() {
        return volumen;
    }

    // Setter del volumen
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    // Getter y Setter de altura de la pirámide
    public double getAlturaPiramide() {
        return alturaPiramide;
    }

    public void setAlturaPiramide(double alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }

    // Polimorfismo dinámico: toString
    @Override
    public String toString() {
        return super.toString() +
               "Piramide [volumen=" + volumen + ", altura de pirámide=" + alturaPiramide + "]";
    }
}
    
    

