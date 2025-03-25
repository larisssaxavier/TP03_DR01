public class produto {

    private String nome; //identifica o produto
    private double preco; //representa o valor do produto e é utilizado em cálculos financeiros
    private int quantidadeEmEstoque; //controle de disponibilidade do produto

    //Recebe três parâmetros obrigatórios, atribui os valores diretamente aos atributos da classe
    public produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public void alterarPreco(double novoPreco){
        this.preco = novoPreco;
    }
    public void alterarQuantidade(int novoQuantidade){
        this.quantidadeEmEstoque = novoQuantidade;
    }
    public void exibirInformacoes(){
        System.out.println("\n Nome: " + this.nome + "\n Preço: R$" + this.preco + "\n Quantidade: " + this.quantidadeEmEstoque);
    }
    public String getNome() {
        return this.nome;
    }
    public double getPreco() {
        return this.preco;
    }
    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }
    public void setQuantidadeEmEstoque(int novoQuantidade){
        this.quantidadeEmEstoque = novoQuantidade;
    }
    public static void main(String[] args) {
        produto tapereba = new produto("Polpa Taperebá 1kg", 47.5, 5);
        System.out.println("***** TESTE DA CLASSE PRODUTO *****");
        System.out.println("Informações do produto: ");
        //Atualização de preço e estoque
        tapereba.exibirInformacoes();
        tapereba.alterarPreco(45);
        tapereba.alterarQuantidade(10);
        //Novas informações para o usuário
        System.out.println("\nInformações do produto: ");
        tapereba.exibirInformacoes();

        System.out.println("***** TESTE DE GETTERS E SETTERS *****");
        System.out.println("Informações iniciais do produto: ");
        produto acai = new produto("Acai", 25, 3);
        acai.exibirInformacoes();
        acai.setNome("Açaí 1kg");
        acai.setPreco(20);
        acai.setQuantidadeEmEstoque(8);
        System.out.println("\nInformações atualizadas do produto: ");
        acai.exibirInformacoes();
        acai.alterarQuantidade(6);
        System.out.println("\nAtualização do estoque: " + acai.getQuantidadeEmEstoque());

        System.out.println("***** TESTE DE CONSTRUTORES *****");
        produto banana = new produto("Banana", 8.0, 45);
        produto abacaxi = new produto("Abacaxi", 4, 20);

        banana.setNome("Banana Prata");
        System.out.println("Atualização nome: " + banana.getNome());
        abacaxi.setPreco(6.25);
        System.out.println("Atualização preço : " + abacaxi.getPreco());

        banana.exibirInformacoes();
        abacaxi.exibirInformacoes();

}}
