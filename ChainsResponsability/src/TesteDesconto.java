public class TesteDesconto {

    public static void main(String[] args) {

        CalculadorDeDesconto descontos = new CalculadorDeDesconto();

        Orcamento orcamento = new Orcamento(600.0);
        orcamento.adicionaItem(new Item("CANETA", 250.0) );
        orcamento.adicionaItem(new Item("lAPIS", 250.0) );

        double descontoFinal = descontos.calcula(orcamento);

        System.out.println(descontoFinal);

    }

}
