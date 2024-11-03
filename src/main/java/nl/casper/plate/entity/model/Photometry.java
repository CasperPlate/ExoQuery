package nl.casper.plate.entity.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "photometry")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Photometry extends PanacheEntityBase {

    @Id
    @Column(name = "fk_exoplanet_id")
    public Integer exoplanetId;

    @Column(name = "sy_bmag")
    public double bMagnitude;
    @Column(name = "sy_bmagerr1")
    public double bMagnitudeErr1;
    @Column(name = "sy_bmagerr2")
    public double bMagnitudeErr2;
    @Column(name = "sy_bmag_reflink")
    public String bMagnitudeReference;

    @Column(name = "sy_vmag")
    public double vMagnitude;
    @Column(name = "sy_vmagerr1")
    public double vMagnitudeErr1;
    @Column(name = "sy_vmagerr2")
    public double vMagnitudeErr2;
    @Column(name = "sy_vmag_reflink")
    public String vMagnitudeReference;

    @Column(name = "sy_jmag")
    public double jMagnitude;
    @Column(name = "sy_jmagerr1")
    public double jMagnitudeErr1;
    @Column(name = "sy_jmagerr2")
    public double jMagnitudeErr2;
    @Column(name = "sy_jmag_reflink")
    public String jMagnitudeReference;

    @Column(name = "sy_hmag")
    public double hMagnitude;
    @Column(name = "sy_hmagerr1")
    public double hMagnitudeErr1;
    @Column(name = "sy_hmagerr2")
    public double hMagnitudeErr2;
    @Column(name = "sy_hmag_reflink")
    public String hMagnitudeReference;

    @Column(name = "sy_kmag")
    public double kMagnitude;
    @Column(name = "sy_kmagerr1")
    public double kMagnitudeErr1;
    @Column(name = "sy_kmagerr2")
    public double kMagnitudeErr2;
    @Column(name = "sy_kmag_reflink")
    public String kMagnitudeReference;

    @Column(name = "sy_umag")
    public double uMagnitude;
    @Column(name = "sy_umagerr1")
    public double uMagnitudeErr1;
    @Column(name = "sy_umagerr2")
    public double uMagnitudeErr2;
    @Column(name = "sy_umag_reflink")
    public String uMagnitudeReference;

    @Column(name = "sy_gmag")
    public double gMagnitude;
    @Column(name = "sy_gmagerr1")
    public double gMagnitudeErr1;
    @Column(name = "sy_gmagerr2")
    public double gMagnitudeErr2;
    @Column(name = "sy_gmag_reflink")
    public String gMagnitudeReference;

    @Column(name = "sy_rmag")
    public double rMagnitude;
    @Column(name = "sy_rmagerr1")
    public double rMagnitudeErr1;
    @Column(name = "sy_rmagerr2")
    public double rMagnitudeErr2;
    @Column(name = "sy_rmag_reflink")
    public String rMagnitudeReference;

    @Column(name = "sy_imag")
    public double iMagnitude;
    @Column(name = "sy_imagerr1")
    public double iMagnitudeErr1;
    @Column(name = "sy_imagerr2")
    public double iMagnitudeErr2;
    @Column(name = "sy_imag_reflink")
    public String iMagnitudeReference;

    @Column(name = "sy_zmag")
    public double zMagnitude;
    @Column(name = "sy_zmagerr1")
    public double zMagnitudeErr1;
    @Column(name = "sy_zmagerr2")
    public double zMagnitudeErr2;
    @Column(name = "sy_zmag_reflink")
    public String zMagnitudeReference;

    @Column(name = "sy_w1mag")
    public double w1Magnitude;
    @Column(name = "sy_w1magerr1")
    public double w1MagnitudeErr1;
    @Column(name = "sy_w1magerr2")
    public double w1MagnitudeErr2;
    @Column(name = "sy_w1mag_reflink")
    public String w1MagnitudeReference;

    @Column(name = "sy_w2mag")
    public double w2Magnitude;
    @Column(name = "sy_w2magerr1")
    public double w2MagnitudeErr1;
    @Column(name = "sy_w2magerr2")
    public double w2MagnitudeErr2;
    @Column(name = "sy_w2mag_reflink")
    public String w2MagnitudeReference;

    @Column(name = "sy_w3mag")
    public double w3Magnitude;
    @Column(name = "sy_w3magerr1")
    public double w3MagnitudeErr1;
    @Column(name = "sy_w3magerr2")
    public double w3MagnitudeErr2;
    @Column(name = "sy_w3mag_reflink")
    public String w3MagnitudeReference;

    @Column(name = "sy_w4mag")
    public double w4Magnitude;
    @Column(name = "sy_w4magerr1")
    public double w4MagnitudeErr1;
    @Column(name = "sy_w4magerr2")
    public double w4MagnitudeErr2;
    @Column(name = "sy_w4mag_reflink")
    public String w4MagnitudeReference;

    @Column(name = "sy_gaiamag")
    public double gaiaMagnitude;
    @Column(name = "sy_gaiamagerr1")
    public double gaiaMagnitudeErr1;
    @Column(name = "sy_gaiamagerr2")
    public double gaiaMagnitudeErr2;
    @Column(name = "sy_gaiamag_reflink")
    public String gaiaMagnitudeReference;

    @Column(name = "sy_icmag")
    public double icMagnitude;
    @Column(name = "sy_icmagerr1")
    public double icMagnitudeErr1;
    @Column(name = "sy_icmagerr2")
    public double icMagnitudeErr2;
    @Column(name = "sy_icmag_reflink")
    public String icMagnitudeReference;

    @Column(name = "sy_tmag")
    public double tMagnitude;
    @Column(name = "sy_tmagerr1")
    public double tMagnitudeErr1;
    @Column(name = "sy_tmagerr2")
    public double tMagnitudeErr2;
    @Column(name = "sy_tmag_reflink")
    public String tMagnitudeReference;

    @Column(name = "sy_kepmag")
    public double kepMagnitude;
    @Column(name = "sy_kepmagerr1")
    public double kepMagnitudeErr1;
    @Column(name = "sy_kepmagerr2")
    public double kepMagnitudeErr2;
    @Column(name = "sy_kepmag_reflink")
    public String kepMagnitudeReference;
}
