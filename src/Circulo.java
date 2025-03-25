public class Circulo {
    double raio;
    double pi = 3.1415;
    double area;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calculaArea() {
        area = pi * (raio *raio);

        return area;
    }
}
