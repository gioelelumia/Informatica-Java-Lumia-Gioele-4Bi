package gestionefilm;

import java.util.Arrays;

public class CollezioneTelefilm {
    private Telefilm[] telefilm;
    private int numeroTelefilm;

    public CollezioneTelefilm() {
        this.telefilm = new Telefilm[10];
        this.numeroTelefilm = 0;
    }

    public CollezioneTelefilm(int dimensione) {
        this.telefilm = new Telefilm[dimensione];
        this.numeroTelefilm = 0;
    }

    public Telefilm[] getTelefilm() {
        return telefilm;
    }

    public void setTelefilm(Telefilm[] telefilm) {
        this.telefilm = telefilm;
    }

    public int getNumeroTelefilm() {
        return numeroTelefilm;
    }

    public void setNumeroTelefilm(int numeroTelefilm) {
        this.numeroTelefilm = numeroTelefilm;
    }

    @Override
    public String toString() {
        return "CollezioneTelefilm [telefilm=" + Arrays.toString(telefilm) + ", numeroTelefilm=" + numeroTelefilm + "]";
    }

    public void aggiungiTelefilm(Telefilm t) {
        if (numeroTelefilm < telefilm.length) {
            telefilm[numeroTelefilm] = t;
            numeroTelefilm++;
        } else {
            System.out.println("Collezione piena: impossibile aggiungere altri telefilm.");
        }
    }

    public void ordinaPerNome() {
        for (int i = 0; i < numeroTelefilm - 1; i++) {
            for (int j = 0; j < numeroTelefilm - 1 - i; j++) {
                if (telefilm[j].getTitolo().compareToIgnoreCase(telefilm[j + 1].getTitolo()) > 0) {
                    Telefilm temp = telefilm[j];
                    telefilm[j] = telefilm[j + 1];
                    telefilm[j + 1] = temp;
                }
            }
        }
    }
}
