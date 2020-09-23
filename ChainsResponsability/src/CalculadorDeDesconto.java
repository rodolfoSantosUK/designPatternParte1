public class CalculadorDeDesconto {


public double calcula(Orcamento orcamento) {

      Desconto descontoPorCincoItens = new DescontoPorCincoItens();
      Desconto descontoPorMaisdeQuinhentosReais = new DescontoPorMaisdeQuinhentosReais();
      Desconto semDesconto = new SemDesconto();

      descontoPorCincoItens.setProximo(descontoPorMaisdeQuinhentosReais);
      descontoPorMaisdeQuinhentosReais.setProximo(semDesconto);

      return descontoPorCincoItens.desconta(orcamento);

}


}
