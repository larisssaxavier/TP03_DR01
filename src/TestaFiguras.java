public class TestaFiguras {
    public static void main(String[] args) {
        Esfera novaEsfera = new Esfera(5);
        Circulo novaCirculo = new Circulo(3);

        System.out.printf("Volume da esfera: %.2f \n", novaEsfera.calculaVolume());
        System.out.printf("Area do círculo: %.2f \n", novaCirculo.calculaArea());
    }
}
