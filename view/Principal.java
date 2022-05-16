package ESIIIStrategy.view;

import ESIIIStrategy.controller.IImposto;
import ESIIIStrategy.controller.ImpostoSaoPaulo;
import ESIIIStrategy.model.Propriedade;
import ESIIIStrategy.model.PropriedadeBuilder;

public class Principal {
  public static void main(String[] args) {
    Propriedade propriedade = PropriedadeBuilder.builder()
        .addAreaTotal(10000)
        .addNumeroComodos(5)
        .get();

    IImposto impostoStrategy = new ImpostoSaoPaulo();
    // Imposto impostoStrategy = new ImpostoBeloHorizonte();
    // Imposto impostoStrategy = new ImpostoCuritiba();
    // Imposto impostoStrategy = new ImpostoPortoAlegre();

    System.out.println(impostoStrategy.calcularImposto(propriedade));

  }
}