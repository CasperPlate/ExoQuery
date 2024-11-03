package nl.casper.plate.entity.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "exoplanet")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exoplanet extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "pl_name")
    public String planetName;
    @Column(name = "hostname")
    public String hostName;
    @Column(name = "pl_letter")
    public String planetLetter;
    @Column(name = "hd_name")
    public String henryDraperName;
    @Column(name = "hip_name")
    public String hipparcosName;
    @Column(name = "tic_id")
    public String tessName;
    @Column(name = "gaia_id")
    public String gaiaName;
    @Column(name = "pl_controv_flag")
    public boolean controversialFlag;
}
