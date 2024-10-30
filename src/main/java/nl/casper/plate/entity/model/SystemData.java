package nl.casper.plate.entity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "system_data")
@Builder
@Data
public class SystemData {

    @Id
    @Column(name = "fk_exoplanet_id")
    public Integer exoplanetId;

    @Column(name = "sy_pm")
    public double properMotion;
    @Column(name = "sy_pmerr1")
    public double properMotionErr1;
    @Column(name = "sy_pmerr2")
    public double properMotionErr2;
    @Column(name = "sy_pm_reflink")
    public String properMotionReference;

    @Column(name = "sy_pmra")
    public double properMotionRA;
    @Column(name = "sy_pmraerr1")
    public double properMotionRAErr1;
    @Column(name = "sy_pmraerr2")
    public double properMotionRAErr2;

    @Column(name = "sy_pmdec")
    public double properMotionDEC;
    @Column(name = "sy_pmdecerr1")
    public double properMotionDECErr1;
    @Column(name = "sy_pmdecerr2")
    public double properMotionDECErr2;

    @Column(name = "sy_dist")
    public double distance;
    @Column(name = "sy_disterr1")
    public double distanceErr1;
    @Column(name = "sy_disterr2")
    public double distanceErr2;
    @Column(name = "sy_dist_reflink")
    public String distanceReference;

    @Column(name = "sy_plx")
    public double paralax;
    @Column(name = "sy_plxerr1")
    public double paralaxErr1;
    @Column(name = "sy_plxerr2")
    public double paralaxErr2;
    @Column(name = "sy_plx_reflink")
    public String paralaxReference;

    @Column(name = "pl_nnotes")
    public Integer notes;
}
