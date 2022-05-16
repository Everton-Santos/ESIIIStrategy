package ESIIIStrategy.model;

public class Propriedade {
  private double areaTotal;
  private int numeroComodos;
  private int numeroQuartos;
  private double areaGaragem;
  private int idadeImovel;

  public double getAreaTotal() {
    return this.areaTotal;
  }

  public void setAreaTotal(double areaTotal) {
    this.areaTotal = areaTotal;
  }

  public int getNumeroComodos() {
    return this.numeroComodos;
  }

  public void setNumeroComodos(int numeroComodos) {
    this.numeroComodos = numeroComodos;
  }

  public int getNumeroQuartos() {
    return this.numeroQuartos;
  }

  public void setNumeroQuartos(int numeroQuartos) {
    this.numeroQuartos = numeroQuartos;
  }

  public double getAreaGaragem() {
    return this.areaGaragem;
  }

  public void setAreaGaragem(double areaGaragem) {
    this.areaGaragem = areaGaragem;
  }

  public int getIdadeImovel() {
    return this.idadeImovel;
  }

  public void setIdadeImovel(int idadeImovel) {
    this.idadeImovel = idadeImovel;
  }

  @Override
  public String toString() {
    return "{" +
        " areaTotal='" + getAreaTotal() + "'" +
        ", numeroComodos='" + getNumeroComodos() + "'" +
        ", numeroQuartos='" + getNumeroQuartos() + "'" +
        ", areaGaragem='" + getAreaGaragem() + "'" +
        ", idadeImovel='" + getIdadeImovel() + "'" +
        "}";
  }
}