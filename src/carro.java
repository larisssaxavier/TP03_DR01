//Exemplo na pratica da definição de conceitos
public class carro {

    //Atributos: características dos objetos
    String marca;
    String modelo;
    int ano;
    int velocidadeAtual;


    //Mét odo construtor: inicializa o objeto
    public carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    //Mét odo: ações do objeto
    public void acelerar(int aumento){
        velocidadeAtual += aumento;
    }

    public static void main(String[] args){
        //Criando um objeto: instância de classe
        carro carroUm = new carro("Fiat", "Uno", 2020);
    }
}
