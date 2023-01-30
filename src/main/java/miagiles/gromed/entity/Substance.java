package miagiles.gromed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="substance")
public class Substance {
    @Id
    @Column(name="code")
    private long codeSubstance;

    @Column(name="denomination")
    private String denominationSubstance;

    @Column(name="nature_composant")
    private String natureComposant;

    public String getDenominationSubstance() {
        return denominationSubstance;
    }

    public void setDenominationSubstance(String denominationSubstance) {
        this.denominationSubstance = denominationSubstance;
    }

    public String getNatureComposant() {
        return natureComposant;
    }

    public void setNatureComposant(String natureComposant) {
        this.natureComposant = natureComposant;
    }
    
    public void setCodeSubstance(long codeSubstance) {
        this.codeSubstance = codeSubstance;
    }

    public long getCodeSubstance() {
        return codeSubstance;
    }
}
