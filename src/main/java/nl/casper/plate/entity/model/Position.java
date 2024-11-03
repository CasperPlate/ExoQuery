package nl.casper.plate.entity.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "position")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position extends PanacheEntityBase {

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
