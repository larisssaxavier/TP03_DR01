public class Esfera {
    double raio;
    double pi = 3.1415;
    double volume;
    float fracao = 4/3;

    public Esfera(double raio) {
        this.raio = raio;
    }
    public double calculaVolume() {
        volume = pi*raio*fracao;
        return volume;
    }
}
