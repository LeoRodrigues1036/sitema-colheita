package cultura;

public class CulturaAnual {
    private String nome;
    private double areaTotalPlantada;
    private String localizacao;
    private String periodoPlantacao;
    private int tempoColheita;
    private String responsavelPlantacao;

    public CulturaAnual(String nome, double areaTotalPlantada, String localizacao, String periodoPlantacao, int tempoColheita, String responsavelPlantacao) {
        this.nome = nome;
        this.areaTotalPlantada = areaTotalPlantada;
        this.localizacao = localizacao;
        this.periodoPlantacao = periodoPlantacao;
        this.tempoColheita = tempoColheita;
        this.responsavelPlantacao = responsavelPlantacao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getAreaTotalPlantada() {
        return areaTotalPlantada;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getPeriodoPlantacao() {
        return periodoPlantacao;
    }

    public int getTempoColheita() {
        return tempoColheita;
    }

    public String getResponsavelPlantacao() {
        return responsavelPlantacao;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAreaTotalPlantada(double areaTotalPlantada) {
        this.areaTotalPlantada = areaTotalPlantada;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setPeriodoPlantacao(String periodoPlantacao) {
        this.periodoPlantacao = periodoPlantacao;
    }

    public void setTempoColheita(int tempoColheita) {
        this.tempoColheita = tempoColheita;
    }

    public void setResponsavelPlantacao(String responsavelPlantacao) {
        this.responsavelPlantacao = responsavelPlantacao;
    }
}
