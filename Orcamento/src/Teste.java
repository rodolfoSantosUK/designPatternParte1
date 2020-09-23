public class Teste {


    public static void main(String[] args) {

        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);

        CalculaOrcamento calculador = new CalculaOrcamento();

        calculador.realizaCalculo(orcamento, iss);

    }
}
