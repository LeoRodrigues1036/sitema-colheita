package cultura;

public class CulturaPerene {
    private String nome;
    private double areaTotalPlantada;
    private String localizacao;
    private String mercado;
    private String responsavelPlantacao;

    public CulturaPerene(String nome, double areaTotalPlantada, String localizacao, String mercado, String responsavelPlantacao) {
        this.nome = nome;
        this.areaTotalPlantada = areaTotalPlantada;
        this.localizacao = localizacao;
        this.mercado = mercado;
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

    public String getMercado() {
        return mercado;
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

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    public void setResponsavelPlantacao(String responsavelPlantacao) {
        this.responsavelPlantacao = responsavelPlantacao;
    }
}


