package ESIIIStrategy.controller;

import ESIIIStrategy.model.Propriedade;

public class ImpostoBeloHorizonte implements IImposto {
  @Override
  public double calcularImposto(Propriedade propriedade) {
    return (propriedade.getAreaTotal() * 7) + (propriedade.getNumeroQuartos() * 4);
  }
}