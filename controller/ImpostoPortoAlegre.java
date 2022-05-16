package ESIIIStrategy.controller;

import ESIIIStrategy.model.Propriedade;

public class ImpostoPortoAlegre implements IImposto {
  @Override
  public double calcularImposto(Propriedade propriedade) {
    if (propriedade.getAreaGaragem() > 0) {
      return (propriedade.getAreaTotal() * 7.5) + (propriedade.getAreaGaragem() * 2.5);
    }

    return propriedade.getAreaTotal() * 8;
  }
}