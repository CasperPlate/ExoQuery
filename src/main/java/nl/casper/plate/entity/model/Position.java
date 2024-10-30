package nl.casper.plate.entity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "position")
@Builder
@Data
public class Position {

    @Id
    @Column(name = "fk_exoplanet_id")
    public Integer exoplanetId;

    @Column(name = "rastr")
    public String rightAscensionSex;
    @Column(name = "decstr")
    public String declinationSex;

    @Column(name = "ra")
    public double rightAscensionDec;
    @Column(name = "dec")
    public double declinationDec;

    @Column(name = "glat")
    public double galacticLatitude;
    @Column(name = "glon")
    public double galacticLongitude;
    @Column(name = "elat")
    public double eclipticLatitude;
    @Column(name = "elon")
    public double eclipticLongitude;
}
