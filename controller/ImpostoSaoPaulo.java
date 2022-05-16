package ESIIIStrategy.controller;

import ESIIIStrategy.model.Propriedade;

public class ImpostoSaoPaulo implements IImposto {

  @Override
  public double calcularImposto(Propriedade propriedade) {
    return (propriedade.getAreaTotal() * 10) + (propriedade.getNumeroComodos() * 2);
  }
}