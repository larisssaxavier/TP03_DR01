public static void main(String[]  args) {
    Conta novaConta = new Conta("Larissa Araújo", "002", "25/04/2023", 25487, 6784.56);

    System.out.println("INFORMAÇÕES GERAIS DA CONTA");
    System.out.println("\nTitular: " + novaConta.getTitular());
    System.out.println("Agencia: " + novaConta.getAgencia());
    System.out.println("Número: " + novaConta.getNumero());
    System.out.println("Data de abertura: " + novaConta.getDataAbertura());
    System.out.printf("\nSaldo: R$ %.2f\n", novaConta.getSaldo());

    System.out.print("\nSAQUE - ATUALIZAÇÃO DO SALDO");
    System.out.printf("\nSaldo: R$ %.2f\n", novaConta.getSaldo());
    double valorSacado = 480.50;
    novaConta.saca(valorSacado);
    System.out.println("Valor do saque: " + valorSacado);
    System.out.printf("Saldo Atualizado: R$ %.2f\n", novaConta.getSaldo());
    System.out.printf("Rendimento com saldo atual: R$ %.2f\n", novaConta.calculaRendimento());

    System.out.print("\nDEPÓSITO - ATUALIZAÇÃO DO SALDO");
    System.out.printf("\nSaldo: R$ %.2f\n", novaConta.getSaldo());
    int valorDepositado = 220;
    novaConta.deposita(valorDepositado);
    System.out.println("Valor do depósito: " + valorDepositado);
    System.out.printf("Saldo Atualizado: R$ %.2f\n", novaConta.getSaldo());
    System.out.printf("Rendimento com saldo atual: R$ %.2f\n", novaConta.calculaRendimento());

}
