package miagiles.gromed.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="medicament")
public class Medicament {

    public Medicament() {
    }

    public Medicament(long codeCIS, String denomination) {
        this.codeCIS = codeCIS;
        this.denomination = denomination;
    }

    @Id
    @Column(name="codeCIS")
    private long codeCIS;

    @Column(name="denomination")
    private String denomination;


    @ManyToOne
    private FormePharma formePharma;


    public long getCodeCIS() {
        return codeCIS;
    }

    public void setCodeCIS(long codeCIS) {
        this.codeCIS = codeCIS;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }
}
