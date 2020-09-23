public class DescontoPorMaisdeQuinhentosReais implements Desconto{

    private Desconto proximo;

    public double desconta(Orcamento orcamento) {
        if(orcamento.getItens().size() > 500) {
            return orcamento.getValor()  * 0.07;
        }
        else {
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto desconto) {
      this.proximo = desconto;
    }

}
