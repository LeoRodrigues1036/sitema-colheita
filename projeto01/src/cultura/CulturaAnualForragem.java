package cultura;

public class CulturaAnualForragem extends CulturaAnual {
    private String tipoForragem;
    private String animaisAlimentados;

    public CulturaAnualForragem(String nome, double areaTotalPlantada, String localizacao, String periodoPlantacao,int tempoColheita, String responsavelPlantacao, String tipoForragem, String animaisAlimentados) {
        super(nome, areaTotalPlantada, localizacao, periodoPlantacao, tempoColheita, responsavelPlantacao);
        this.tipoForragem = tipoForragem;
        this.animaisAlimentados = animaisAlimentados;
    }

    // Getters
    public String getTipoForragem() {
        return tipoForragem;
    }

    public String getAnimaisAlimentados() {
        return animaisAlimentados;
    }

    // Setters
    public void setTipoForragem(String tipoForragem) {
        this.tipoForragem = tipoForragem;
    }

    public void setAnimaisAlimentados(String animaisAlimentados) {
        this.animaisAlimentados = animaisAlimentados;
    }
}




