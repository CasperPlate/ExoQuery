package nl.casper.plate.entity.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "system_composition")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemComposition extends PanacheEntityBase {

    @Id
    @Column(name = "fk_exoplanet_id")
    public Integer exoplanetId;

    @Column(name = "sy_snum")
    public Integer numberOfStars;
    @Column(name = "sy_pnum")
    public Integer numberOfPlanets;
    @Column(name = "sy_mnum")
    public Integer numberOfMoons;
    @Column(name = "cb_flag")
    public boolean circumbinaryFlag;
}
