package nl.casper.plate.entity.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "detections")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Detections extends PanacheEntityBase {

    @Id
    @Column(name = "fk_exoplanet_id")
    public Integer exoplanetId;
    @Column(name = "rv_flag")
    public boolean radialVelocity;
    @Column(name = "pul_flag")
    public boolean pulsarTiming;
    @Column(name = "ptv_flag")
    public boolean pulsationTiming;
    @Column(name = "tran_flag")
    public boolean transits;
    @Column(name = "ast_flag")
    public boolean astrometric;
    @Column(name = "obm_flag")
    public boolean oribitalBrightness;
    @Column(name = "micro_flag")
    public boolean microlensing;
    @Column(name = "etv_flag")
    public boolean eclipseTiming;
    @Column(name = "ima_flag")
    public boolean imaging;
    @Column(name = "dkin_flag")
    public boolean diskKinematics;
}
