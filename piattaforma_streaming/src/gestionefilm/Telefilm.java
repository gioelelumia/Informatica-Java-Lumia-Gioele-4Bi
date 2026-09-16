package gestionefilm;

import java.util.Arrays;

public class Telefilm {
    private String titolo;
    private String genere;
    private Produzione produzione;
    private Stagione[] stagioni;

    public Telefilm(String titolo, String genere, Produzione produzione, int stagioni) {
        this.titolo = titolo;
        this.genere = genere;
        this.produzione = produzione;
        this.stagioni = new Stagione[stagioni];
    }

    public Telefilm() {
       this("", "", null, 0);
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public Produzione getProduzione() {
        return produzione;
    }

    public void setProduzione(Produzione produzione) {
        this.produzione = produzione;
    }

    public Stagione[] getStagioni() {
        return stagioni;
    }

    public void setStagioni(Stagione[] stagioni) {
        this.stagioni = stagioni;
    }

    @Override
    public String toString() {
        return "Telefilm [titolo=" + titolo + ", genere=" + genere + ", produzione=" + produzione + ", stagioni="
                + Arrays.toString(stagioni) + "]";
    }

    public double mediaEpisodi() {
        if (stagioni.length == 0) {
            return 0;
        }
        int totaleEpisodi = 0;
        for (int i = 0; i < stagioni.length; i++) {
            totaleEpisodi += stagioni[i].getNumeroEpisodi();
        }
        return (double) totaleEpisodi / stagioni.length;
    }

    public boolean scenegggiatorePresente(String sceneggiatore) {
        for (int i = 0; i < stagioni.length; i++) {
            if (stagioni[i].getSceneggiatore().equals(sceneggiatore)) {
                return true;
            }
        }
        return false;
    }

    public void ordinamentoStagioni() {
        for (int i = 0; i < stagioni.length - 1; i++) {
            for (int j = 0; j < stagioni.length - i - 1; j++) {
                if (stagioni[j].getNumeroEpisodi() > stagioni[j + 1].getNumeroEpisodi()) {
                    Stagione temp = stagioni[j];
                    stagioni[j] = stagioni[j + 1];
                    stagioni[j + 1] = temp;
                }
            }
        }
    }
}
