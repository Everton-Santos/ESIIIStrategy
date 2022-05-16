package ESIIIStrategy.model;

public class PropriedadeBuilder {
  private Propriedade propriedade;

  public PropriedadeBuilder() {
    this.propriedade = new Propriedade();
  }

  public static PropriedadeBuilder builder() {
    return new PropriedadeBuilder();
  }

  public PropriedadeBuilder addAreaTotal(double areaTotal) {
    this.propriedade.setAreaTotal(areaTotal);
    return this;
  }

  public PropriedadeBuilder addNumeroComodos(int numeroComodos) {
    this.propriedade.setNumeroComodos(numeroComodos);
    return this;
  }

  public PropriedadeBuilder addNumeroQuartos(int numeroQuartos) {
    this.propriedade.setNumeroQuartos(numeroQuartos);
    return this;
  }

  public PropriedadeBuilder addAreaGaragem(double areaGaragem) {
    this.propriedade.setAreaGaragem(areaGaragem);
    return this;
  }

  public PropriedadeBuilder addIdadeImovel(int idadeImovel) {
    this.propriedade.setIdadeImovel(idadeImovel);
    return this;
  }

  public Propriedade get() {
    return this.propriedade;
  }
}