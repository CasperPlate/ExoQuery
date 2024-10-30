package nl.casper.plate.entity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "stellar_data")
@Builder
@Data
public class StellarData {

    @Id
    @Column(name = "fk_exoplanet_id")
    public Integer exoplanetId;

    @Column(name = "st_spectype")
    public String spectralType;
    @Column(name = "st_spectype_reflink")
    public String spectralTypeReference;

    @Column(name = "st_teff")
    public double effectiveTemperature;
    @Column(name = "st_tefferr1")
    public double effectiveTemperatureErr1;
    @Column(name = "st_tefferr2")
    public double effectiveTemperatureErr2;
    @Column(name = "st_tefflim")
    public double effectiveTemperatureLim;
    @Column(name = "st_teff_reflink")
    public String effectiveTemperatureReference;

    @Column(name = "st_rad")
    public double radius;
    @Column(name = "st_raderr1")
    public double radiusErr1;
    @Column(name = "st_raderr2")
    public double radiusErr2;
    @Column(name = "st_radlim")
    public double radiusLim;
    @Column(name = "st_rad_reflink")
    public String radiusReference;

    @Column(name = "st_mass")
    public double mass;
    @Column(name = "st_masserr1")
    public double massErr1;
    @Column(name = "st_masserr2")
    public double massErr2;
    @Column(name = "st_masslim")
    public double massLim;
    @Column(name = "st_mass_reflink")
    public String massReference;

    @Column(name = "st_met")
    public double metallicity;
    @Column(name = "st_meterr1")
    public double metallicityErr1;
    @Column(name = "st_meterr2")
    public double metallicityErr2;
    @Column(name = "st_metlim")
    public double metallicityLim;
    @Column(name = "st_met_reflink")
    public String metallicityReference;

    @Column(name = "st_metratio")
    public double metallicityRatio;

    @Column(name = "st_lum")
    public double luminosity;
    @Column(name = "st_lumerr1")
    public double luminosityErr1;
    @Column(name = "st_lumerr2")
    public double luminosityErr2;
    @Column(name = "st_lumlim")
    public double luminosityLim;
    @Column(name = "st_lum_reflink")
    public String luminosityReference;

    @Column(name = "st_logg")
    public double surfaceGravity;
    @Column(name = "st_loggerr1")
    public double surfaceGravityErr1;
    @Column(name = "st_loggerr2")
    public double surfaceGravityErr2;
    @Column(name = "st_logglim")
    public double surfaceGravityLim;
    @Column(name = "st_logg_reflink")
    public String surfaceGravityReference;

    @Column(name = "st_age")
    public double age;
    @Column(name = "st_ageerr1")
    public double ageErr1;
    @Column(name = "st_ageerr2")
    public double ageErr2;
    @Column(name = "st_agelim")
    public double ageLim;
    @Column(name = "st_age_reflink")
    public String ageReference;

    @Column(name = "st_dens")
    public double density;
    @Column(name = "st_denserr1")
    public double densityErr1;
    @Column(name = "st_denserr2")
    public double densityErr2;
    @Column(name = "st_denslim")
    public double densityLim;
    @Column(name = "st_dens_reflink")
    public String densityReference;

    @Column(name = "st_vsin")
    public double rotationalVelocity;
    @Column(name = "st_vsinerr1")
    public double rotationalVelocityErr1;
    @Column(name = "st_vsinerr2")
    public double rotationalVelocityErr2;
    @Column(name = "st_vsinlim")
    public double rotationalVelocityLim;
    @Column(name = "st_vsin_reflink")
    public String rotationalVelocityReference;

    @Column(name = "st_rotp")
    public double rotationalPeriod;
    @Column(name = "st_rotperr1")
    public double rotationalPeriodErr1;
    @Column(name = "st_rotperr2")
    public double rotationalPeriodErr2;
    @Column(name = "st_rotplim")
    public double rotationalPeriodLim;
    @Column(name = "st_rotp_reflink")
    public String rotationalPeriodReference;

    @Column(name = "st_radv")
    public double radialVelocity;
    @Column(name = "st_radverr1")
    public double radialVelocityErr1;
    @Column(name = "st_radverr2")
    public double radialVelocityErr2;
    @Column(name = "st_radvlim")
    public double radialVelocityLim;
    @Column(name = "st_radv_reflink")
    public String radialVelocityReference;
}
