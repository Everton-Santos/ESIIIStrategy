package ESIIIStrategy.controller;

import ESIIIStrategy.model.Propriedade;

public class ImpostoCuritiba implements IImposto {
  @Override
  public double calcularImposto(Propriedade propriedade) {
    double sum = (propriedade.getAreaTotal() * 5);
    int idadeImovel = propriedade.getIdadeImovel();

    if (idadeImovel > 50) {
      return sum + (idadeImovel * 3);
    } else if (idadeImovel > 20 && idadeImovel < 50) {
      return sum + (idadeImovel * 2.5);
    } else {
      return sum + (idadeImovel * 2);
    }
  }
}