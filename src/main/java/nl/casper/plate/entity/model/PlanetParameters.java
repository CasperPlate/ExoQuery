package nl.casper.plate.entity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "planet_parameters")
@Builder
@Data
public class PlanetParameters {

    @Id
    @Column(name = "fk_exoplanet_id")
    public Integer exoplanetId;

    @Column(name = "pl_orbper")
    public double orbitalPeriod;
    @Column(name = "pl_orbpererr1")
    public double orbitalPeriodErr1;
    @Column(name = "pl_orbpererr2")
    public double orbitalPeriodErr2;
    @Column(name = "pl_orbperlim")
    public double orbitalPeriodLimit;
    @Column(name = "pl_orbper_reflink")
    public String orbitalPeriodReference;

    @Column(name = "pl_orbsmax")
    public double orbitSemiMajorAxis;
    @Column(name = "pl_orbsmaxerr1")
    public double orbitSemiMajorAxisErr1;
    @Column(name = "pl_orbsmaxerr2")
    public double orbitSemiMajorAxisErr2;
    @Column(name = "pl_orbsmaxlim")
    public double orbitSemiMajorAxisLimit;
    @Column(name = "pl_orbsmax_reflink")
    public String orbitSemiMajorAxisReference;

    @Column(name = "pl_angsep")
    public double angularSeparation;
    @Column(name = "pl_angseperr1")
    public double angularSeparationErr1;
    @Column(name = "pl_angseperr2")
    public double angularSeparationErr2;
    @Column(name = "pl_angseplim")
    public double angularSeparationLimit;
    @Column(name = "pl_angsep_reflink")
    public String angularSeparationReference;

    @Column(name = "pl_rade")
    public double planetRadiusEarth;
    @Column(name = "pl_radeerr1")
    public double planetRadiusEarthErr1;
    @Column(name = "pl_radeerr2")
    public double planetRadiusEarthErr2;
    @Column(name = "pl_radelim")
    public double planetRadiusEarthLimit;
    @Column(name = "pl_rade_reflink")
    public String planetRadiusEarthReference;

    @Column(name = "pl_radj")
    public double planetRadiusJupiter;
    @Column(name = "pl_radjerr1")
    public double planetRadiusJupiterErr1;
    @Column(name = "pl_radjerr2")
    public double planetRadiusJupiterErr2;
    @Column(name = "pl_radjlim")
    public double planetRadiusJupiterLimit;
    @Column(name = "pl_radj_reflink")
    public String planetRadiusJupiterReference;

    @Column(name = "pl_bmasse")
    public double planetMassEarth;
    @Column(name = "pl_bmasseerr1")
    public double planetMassEarthErr1;
    @Column(name = "pl_bmasseerr2")
    public double planetMassEarthErr2;
    @Column(name = "pl_bmasselim")
    public double planetMassEarthLimit;
    @Column(name = "pl_bmasse_reflink")
    public String planeMassEarthReference;

    @Column(name = "pl_bmassj")
    public double planetMassJupiter;
    @Column(name = "pl_bmassjerr1")
    public double planetMassJupiterErr1;
    @Column(name = "pl_bmassjerr2")
    public double planetMassJupiterErr2;
    @Column(name = "pl_bmassjlim")
    public double planetMassJupiterLimit;
    @Column(name = "pl_bmassj_reflink")
    public String planetMassJupiterReference;

    @Column(name = "pl_bmassprov")
    public String planetMassProvenance;

    @Column(name = "pl_dens")
    public double planetDensity;
    @Column(name = "pl_denserr1")
    public double planetDensityErr1;
    @Column(name = "pl_denserr2")
    public double planetDensityErr2;
    @Column(name = "pl_denslim")
    public double planetDensityLimit;

    @Column(name = "pl_orbeccen")
    public double eccentricity;
    @Column(name = "pl_orbeccenerr1")
    public double eccentricityErr1;
    @Column(name = "pl_orbeccenerr2")
    public double eccentricityErr2;
    @Column(name = "pl_orbeccenlim")
    public double eccentricityLimit;

    @Column(name = "pl_insol")
    public double insolationFlux;
    @Column(name = "pl_insolerr1")
    public double insolationFluxrErr1;
    @Column(name = "pl_insolerr2")
    public double insolationFluxErr2;
    @Column(name = "pl_insollim")
    public double insolationFluxLimit;
    @Column(name = "pl_insol_reflink")
    public String insolationFluxReference;

    @Column(name = "pl_eqt")
    public double equilibriumTemperature;
    @Column(name = "pl_eqterr1")
    public double equilibriumTemperatureErr1;
    @Column(name = "pl_eqterr2")
    public double equilibriumTemperatureErr2;
    @Column(name = "pl_eqtlim")
    public double equilibriumTemperatureLimit;
    @Column(name = "pl_eqt_reflink")
    public String equilibriumTemperatureReference;

    @Column(name = "pl_orbincl")
    public double inclination;
    @Column(name = "pl_orbinclerr1")
    public double inclinationErr1;
    @Column(name = "pl_orbinclerr2")
    public double inclinationErr2;
    @Column(name = "pl_orbincllim")
    public double inclinationLimit;
    @Column(name = "pl_orbincl_reflink")
    public String inclinationReference;

    @Column(name = "pl_tranmid")
    public double timeOfConjunction;
    @Column(name = "pl_tranmiderr1")
    public double timeOfConjunctionErr1;
    @Column(name = "pl_tranmiderr2")
    public double timeOfConjunctionErr2;
    @Column(name = "pl_tranmidlim")
    public double timeOfConjunctionLimit;
    @Column(name = "pl_tranmid_reflink")
    public String timeOfConjunctionReference;

    @Column(name = "ttv_flag")
    public boolean transitTimingVariations;

    @Column(name = "pl_imppar")
    public double impactParameter;
    @Column(name = "pl_impparerr1")
    public double impactParameterErr1;
    @Column(name = "pl_impparerr2")
    public double impactParameterErr2;
    @Column(name = "pl_impparlim")
    public double impactParameterLimit;
    @Column(name = "pl_imppar_reflink")
    public String impactParameterReference;

    @Column(name = "pl_trandep")
    public double transitDepth;
    @Column(name = "pl_trandeperr1")
    public double transitDepthErr1;
    @Column(name = "pl_trandeperr2")
    public double transitDepthErr2;
    @Column(name = "pl_trandeplim")
    public double transitDepthLimit;
    @Column(name = "pl_trandep_reflink")
    public String transitDepthReference;

    @Column(name = "pl_trandur")
    public double transitDuration;
    @Column(name = "pl_trandurerr1")
    public double transitDurationErr1;
    @Column(name = "pl_trandurerr2")
    public double transitDurationErr2;
    @Column(name = "pl_trandurlim")
    public double transitDurationLimit;
    @Column(name = "pl_trandur_reflink")
    public String transitDurationReference;

    @Column(name = "pl_ratdor")
    public double ratioToStellarRadius;
    @Column(name = "pl_ratdorerr1")
    public double ratioToStellarRadiusErr1;
    @Column(name = "pl_ratdorerr2")
    public double ratioToStellarRadiusErr2;
    @Column(name = "pl_ratdorlim")
    public double ratioToStellarRadiusLimit;
    @Column(name = "pl_ratdor_reflink")
    public String ratioToStellarRadiusReference;

    @Column(name = "pl_ratror")
    public double ratioPlanetToStellarRadius;
    @Column(name = "pl_ratrorerr1")
    public double ratioPlanetToStellarRadiusErr1;
    @Column(name = "pl_ratrorerr2")
    public double ratioPlanetToStellarRadiusErr2;
    @Column(name = "pl_ratrorlim")
    public double ratioPlanetToStellarRadiusLimit;
    @Column(name = "pl_ratror_reflink")
    public String ratioPlanetToStellarRadiusReference;

    @Column(name = "pl_occdep")
    public double occultationDepth;
    @Column(name = "pl_occdeperr1")
    public double occultationDepthErr1;
    @Column(name = "pl_occdeperr2")
    public double occultationDepthErr2;
    @Column(name = "pl_occdeplim")
    public double occultationDepthLimit;
    @Column(name = "pl_occdep_reflink")
    public String occultationDepthReference;

    @Column(name = "pl_orbtper")
    public double epochOfPeriastron;
    @Column(name = "pl_orbtpererr1")
    public double epochOfPeriastronErr1;
    @Column(name = "pl_orbtpererr2")
    public double epochOfPeriastronErr2;
    @Column(name = "pl_orbtperlim")
    public double epochOfPeriastronLimit;
    @Column(name = "pl_orbtper_reflink")
    public String epochOfPeriastronReference;

    @Column(name = "pl_orblper")
    public double argumentOfPeriastron;
    @Column(name = "pl_orblpererr1")
    public double argumentOfPeriastronErr1;
    @Column(name = "pl_orblpererr2")
    public double argumentOfPeriastronErr2;
    @Column(name = "pl_orblperlim")
    public double argumentOfPeriastronLimit;
    @Column(name = "pl_orblper_reflink")
    public String argumentOfPeriastronReference;

    @Column(name = "pl_rvamp")
    public double radialVelocity;
    @Column(name = "pl_rvamperr1")
    public double radialVelocityErr1;
    @Column(name = "pl_rvamperr2")
    public double radialVelocityErr2;
    @Column(name = "pl_rvamplim")
    public double radialVelocityLimit;
    @Column(name = "pl_rvamp_reflink")
    public String radialVelocityReference;

    @Column(name = "pl_projobliq")
    public double projectedObliquity;
    @Column(name = "pl_projobliqerr1")
    public double projectedObliquityErr1;
    @Column(name = "pl_projobliqerr2")
    public double projectedObliquityErr2;
    @Column(name = "pl_projobliqlim")
    public double projectedObliquityLimit;
    @Column(name = "pl_projobliq_reflink")
    public String projectedObliquityReference;

    @Column(name = "pl_trueobliq")
    public double trueObliquity;
    @Column(name = "pl_trueobliqerr1")
    public double trueObliquityErr1;
    @Column(name = "pl_trueobliqerr2")
    public double trueObliquityErr2;
    @Column(name = "pl_trueobliqlim")
    public double trueObliquityLimit;
    @Column(name = "pl_trueobliq_reflink")
    public String trueObliquityReference;
}