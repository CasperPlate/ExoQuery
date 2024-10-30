package nl.casper.plate.entity.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "exoplanet")
@Builder
@Data
public class Exoplanet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer exoplanetId;

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
