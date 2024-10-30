package nl.casper.plate.entity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "exoplanet_addition")
@Builder
@Data
public class ExoplanetAddition {

    @Id
    @Column(name = "fk_exoplanet_id")
    public Integer exoplanetId;
    @Column(name = "st_nphot")
    public Integer photometryTimeSeries;
    @Column(name = "st_nrvc")
    public Integer radialVelocityTimeSeries;
    @Column(name = "pl_ntranspec")
    public Integer transmissionSpectroscopyMeasurements;
    @Column(name = "pl_nespec")
    public Integer emissionSpectroscopyMeasurements;
    @Column(name = "st_nspec")
    public Integer stellarSpectraMeasurements;
}
