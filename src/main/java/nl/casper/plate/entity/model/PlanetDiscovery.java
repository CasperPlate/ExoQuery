package nl.casper.plate.entity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "planet_discovery")
@Builder
@Data
public class PlanetDiscovery {

    @Id
    @Column(name = "fk_exoplanet_id")
    public Integer exoplanetId;
    @Column(name = "discoverymethod")
    public String method;
    @Column(name = "disc_year")
    public Integer year;
    @Column(name = "disc_refname")
    public String referenceName;
    @Column(name = "disc_pubdate")
    public Date publishDate;
    @Column(name = "disc_locale")
    public String locale;
    @Column(name = "disc_facility")
    public String facility;
    @Column(name = "disc_telescope")
    public String telescope;
    @Column(name = "disc_instrument")
    public String instrument;
}
