package nl.casper.plate.entity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "photometry")
@Builder
@Data
public class Photometry {

    @Id
    @Column(name = "fk_exoplanet_id")
    public Integer exoplanetId;

    @Column(name = "sy_bmag")
    public String bMagnitude;
    @Column(name = "sy_bmagerr1")
    public String bMagnitudeErr1;
    @Column(name = "sy_bmagerr2")
    public String bMagnitudeErr2;
    @Column(name = "sy_bmag_reflink")
    public String bMagnitudeReference;

    @Column(name = "sy_vmag")
    public String vMagnitude;
    @Column(name = "sy_vmagerr1")
    public String vMagnitudeErr1;
    @Column(name = "sy_vmagerr2")
    public String vMagnitudeErr2;
    @Column(name = "sy_vmag_reflink")
    public String vMagnitudeReference;

    @Column(name = "sy_jmag")
    public String jMagnitude;
    @Column(name = "sy_jmagerr1")
    public String jMagnitudeErr1;
    @Column(name = "sy_jmagerr2")
    public String jMagnitudeErr2;
    @Column(name = "sy_jmag_reflink")
    public String jMagnitudeReference;

    @Column(name = "sy_hmag")
    public String hMagnitude;
    @Column(name = "sy_hmagerr1")
    public String hMagnitudeErr1;
    @Column(name = "sy_hmagerr2")
    public String hMagnitudeErr2;
    @Column(name = "sy_hmag_reflink")
    public String hMagnitudeReference;

    @Column(name = "sy_kmag")
    public String kMagnitude;
    @Column(name = "sy_kmagerr1")
    public String kMagnitudeErr1;
    @Column(name = "sy_kmagerr2")
    public String kMagnitudeErr2;
    @Column(name = "sy_kmag_reflink")
    public String kMagnitudeReference;

    @Column(name = "sy_umag")
    public String uMagnitude;
    @Column(name = "sy_umagerr1")
    public String uMagnitudeErr1;
    @Column(name = "sy_umagerr2")
    public String uMagnitudeErr2;
    @Column(name = "sy_umag_reflink")
    public String uMagnitudeReference;

    @Column(name = "sy_gmag")
    public String gMagnitude;
    @Column(name = "sy_gmagerr1")
    public String gMagnitudeErr1;
    @Column(name = "sy_gmagerr2")
    public String gMagnitudeErr2;
    @Column(name = "sy_gmag_reflink")
    public String gMagnitudeReference;

    @Column(name = "sy_rmag")
    public String rMagnitude;
    @Column(name = "sy_rmagerr1")
    public String rMagnitudeErr1;
    @Column(name = "sy_rmagerr2")
    public String rMagnitudeErr2;
    @Column(name = "sy_rmag_reflink")
    public String rMagnitudeReference;

    @Column(name = "sy_imag")
    public String iMagnitude;
    @Column(name = "sy_imagerr1")
    public String iMagnitudeErr1;
    @Column(name = "sy_imagerr2")
    public String iMagnitudeErr2;
    @Column(name = "sy_imag_reflink")
    public String iMagnitudeReference;

    @Column(name = "sy_zmag")
    public String zMagnitude;
    @Column(name = "sy_zmagerr1")
    public String zMagnitudeErr1;
    @Column(name = "sy_zmagerr2")
    public String zMagnitudeErr2;
    @Column(name = "sy_zmag_reflink")
    public String zMagnitudeReference;

    @Column(name = "sy_w1mag")
    public String w1Magnitude;
    @Column(name = "sy_w1magerr1")
    public String w1MagnitudeErr1;
    @Column(name = "sy_w1magerr2")
    public String w1MagnitudeErr2;
    @Column(name = "sy_w1mag_reflink")
    public String w1MagnitudeReference;

    @Column(name = "sy_w2mag")
    public String w2Magnitude;
    @Column(name = "sy_w2magerr1")
    public String w2MagnitudeErr1;
    @Column(name = "sy_w2magerr2")
    public String w2MagnitudeErr2;
    @Column(name = "sy_w2mag_reflink")
    public String w2MagnitudeReference;

    @Column(name = "sy_w3mag")
    public String w3Magnitude;
    @Column(name = "sy_w3magerr1")
    public String w3MagnitudeErr1;
    @Column(name = "sy_w3magerr2")
    public String w3MagnitudeErr2;
    @Column(name = "sy_w3mag_reflink")
    public String w3MagnitudeReference;

    @Column(name = "sy_w4mag")
    public String w4Magnitude;
    @Column(name = "sy_w4magerr1")
    public String w4MagnitudeErr1;
    @Column(name = "sy_w4magerr2")
    public String w4MagnitudeErr2;
    @Column(name = "sy_w4mag_reflink")
    public String w4MagnitudeReference;

    @Column(name = "sy_gaiamag")
    public String gaiaMagnitude;
    @Column(name = "sy_gaiamagerr1")
    public String gaiaMagnitudeErr1;
    @Column(name = "sy_gaiamagerr2")
    public String gaiaMagnitudeErr2;
    @Column(name = "sy_gaiamag_reflink")
    public String gaiaMagnitudeReference;

    @Column(name = "sy_icmag")
    public String icMagnitude;
    @Column(name = "sy_icmagerr1")
    public String icMagnitudeErr1;
    @Column(name = "sy_icmagerr2")
    public String icMagnitudeErr2;
    @Column(name = "sy_icmag_reflink")
    public String icMagnitudeReference;

    @Column(name = "sy_tmag")
    public String tMagnitude;
    @Column(name = "sy_tmagerr1")
    public String tMagnitudeErr1;
    @Column(name = "sy_tmagerr2")
    public String tMagnitudeErr2;
    @Column(name = "sy_tmag_reflink")
    public String tMagnitudeReference;

    @Column(name = "sy_kepmag")
    public String kepMagnitude;
    @Column(name = "sy_kepmagerr1")
    public String kepMagnitudeErr1;
    @Column(name = "sy_kepmagerr2")
    public String kepMagnitudeErr2;
    @Column(name = "sy_kepmag_reflink")
    public String kepMagnitudeReference;
}
