package estudos;

public class Carta {
    
    private Long id = null;
    private Integer numero = null;
    private String letra = null;
    private Boolean supertrunfo = null;
    private Boolean selecionada = null;
    private Boolean descartada = null;
    private Carro carro = null;
    private Integer numeroVitorias = null;
    private Integer numeroEmpates = null;
    private Integer numeroDerrotas = null;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Boolean getSupertrunfo() {
        return supertrunfo;
    }

    public void setSupertrunfo(Boolean supertrunfo) {
        this.supertrunfo = supertrunfo;
    }

    public Boolean getSelecionada() {
        return selecionada;
    }

    public void setSelecionada(Boolean selecionada) {
        this.selecionada = selecionada;
    }

    public Boolean getDescartada() {
        return descartada;
    }

    public void setDescartada(Boolean descartada) {
        this.descartada = descartada;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Integer getNumeroVitorias() {
        return numeroVitorias;
    }

    public void setNumeroVitorias(Integer numeroVitorias) {
        this.numeroVitorias = numeroVitorias;
    }

    public Integer getNumeroEmpates() {
        return numeroEmpates;
    }

    public void setNumeroEmpates(Integer numeroEmpates) {
        this.numeroEmpates = numeroEmpates;
    }

    public Integer getNumeroDerrotas() {
        return numeroDerrotas;
    }

    public void setNumeroDerrotas(Integer numeroDerrotas) {
        this.numeroDerrotas = numeroDerrotas;
    }
}
