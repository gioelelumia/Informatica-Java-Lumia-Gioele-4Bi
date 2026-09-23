package gestionefilm;

public class Stagione {
    private int numeroStagione;
    private int numeroEpisodi;
    private String trama;
    private String sceneggiatore;

    

    public Stagione(int numeroStagione, int numeroEpisodi, String trama, String sceneggiatore) {
        this.numeroStagione = numeroStagione;
        this.numeroEpisodi = numeroEpisodi;
        this.trama = trama;
        this.sceneggiatore = sceneggiatore;
    }

    public Stagione() {
        this(0, 0, "", "");
    }

    public int getNumeroStagione() {
        return numeroStagione;
    }
    
    public void setNumeroStagione(int numeroStagione) {
        this.numeroStagione = numeroStagione;
    }

    public int getNumeroEpisodi() {
        return numeroEpisodi;
    }

    public void setNumeroEpisodi(int numeroEpisodi) {
        this.numeroEpisodi = numeroEpisodi;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    public String getSceneggiatore() {
        return sceneggiatore;
    }

    public void setSceneggiatore(String sceneggiatore) {
        this.sceneggiatore = sceneggiatore;
    }

    @Override
    public String toString() {
        return "Stagione [numeroStagione=" + numeroStagione + ", numeroEpisodi=" + numeroEpisodi + ", trama=" + trama
                + ", sceneggiatore=" + sceneggiatore + "]";
    }

}
