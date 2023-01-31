
package miagiles.gromed.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="med")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Medicament {


    @Id
    @Column(name="codeCIS")
    private long codeCIS;

    @Column(name="denomination")
    private String denomination;


    @ManyToOne
    private FormePharma formePharma;


}
