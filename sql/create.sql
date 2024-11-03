DROP TABLE IF EXISTS system_composition;
DROP TABLE IF EXISTS planet_discovery;
DROP TABLE IF EXISTS detections;
DROP TABLE IF EXISTS planet_parameters;
DROP TABLE IF EXISTS stellar_data;
DROP TABLE IF EXISTS system_data;
DROP TABLE IF EXISTS position;
DROP TABLE IF EXISTS photometry;
DROP TABLE IF EXISTS exoplanet_addition;
DROP TABLE IF EXISTS exoplanet;

CREATE TABLE exoplanet (
	id SERIAL PRIMARY KEY,
	pl_name VARCHAR(255),
	hostname VARCHAR(255),
	pl_letter VARCHAR(255),
	hd_name VARCHAR(255),
	hip_name VARCHAR(255),
	tic_id VARCHAR(255),
	gaia_id VARCHAR(255),
	pl_controv_flag BOOLEAN
);

COMMENT ON COLUMN exoplanet.pl_name IS 'Planet name most commonly used in the literature';
COMMENT ON COLUMN exoplanet.hostname IS 'Stellar name most commonly used in the literature';
COMMENT ON COLUMN exoplanet.pl_letter IS 'Letter assigned to the planetary component of a planetary system';
COMMENT ON COLUMN exoplanet.hd_name IS 'Name of the star as given by the Henry Draper Catalog';
COMMENT ON COLUMN exoplanet.hip_name IS 'Name of the star as given by the Hipparcos Catalog';
COMMENT ON COLUMN exoplanet.tic_id IS 'Name of the star as given by the TESS Input Catalog';
COMMENT ON COLUMN exoplanet.gaia_id IS 'Name of the star as given by the Gaia Catalog';
COMMENT ON COLUMN exoplanet.pl_controv_flag IS 'Flag indicating whether the confirmation status of a planet has been questioned in the published literature (1=yes, 0=no)';

CREATE TABLE system_composition (
	fk_exoplanet_id SERIAL PRIMARY KEY,
	sy_snum INTEGER,
	sy_pnum INTEGER,
	sy_mnum INTEGER,
	cb_flag BOOLEAN,
	CONSTRAINT fk_exoplanet
      FOREIGN KEY(fk_exoplanet_id) 
        REFERENCES exoplanet(id)
);

COMMENT ON COLUMN system_composition.sy_snum IS 'Number of stars in the planetary system';
COMMENT ON COLUMN system_composition.sy_pnum IS 'Number of confirmed planets in the planetary system';
COMMENT ON COLUMN system_composition.sy_mnum IS 'Number of moons in the planetary system';
COMMENT ON COLUMN system_composition.cb_flag IS 'Flag indicating whether the planet orbits a binary system (1=yes, 0=no)';

CREATE TABLE planet_discovery (
	fk_exoplanet_id SERIAL PRIMARY KEY,
	discoverymethod VARCHAR(255),
	disc_year INTEGER,
	disc_refname VARCHAR(255),
	disc_pubdate DATE,
	disc_locale VARCHAR(255),
	disc_facility VARCHAR(255),
	disc_telescope VARCHAR(255),
	disc_instrument VARCHAR(255),
	CONSTRAINT fk_exoplanet
      FOREIGN KEY(fk_exoplanet_id) 
        REFERENCES exoplanet(id)
);

COMMENT ON COLUMN planet_discovery.discoverymethod IS 'Method by which the planet was first identified';
COMMENT ON COLUMN planet_discovery.disc_year IS 'Year the planet was discovered';
COMMENT ON COLUMN planet_discovery.disc_refname IS 'Reference name for discovery publication';
COMMENT ON COLUMN planet_discovery.disc_pubdate IS 'Publication Date of the planet discovery referee publication';
COMMENT ON COLUMN planet_discovery.disc_locale IS 'Location of observation of planet discovery (Ground or Space)';
COMMENT ON COLUMN planet_discovery.disc_facility IS 'Name of facility of planet discovery observations';
COMMENT ON COLUMN planet_discovery.disc_telescope IS 'Name of telescope of planet discovery observations';
COMMENT ON COLUMN planet_discovery.disc_instrument IS 'Name of instrument of planet discovery observations';

CREATE TABLE detections (
	fk_exoplanet_id SERIAL PRIMARY KEY,
	rv_flag BOOLEAN,
	pul_flag BOOLEAN,
	ptv_flag BOOLEAN,
	tran_flag BOOLEAN,
	ast_flag BOOLEAN,
	obm_flag BOOLEAN,
	micro_flag BOOLEAN,
	etv_flag BOOLEAN,
	ima_flag BOOLEAN,
	dkin_flag BOOLEAN,
	CONSTRAINT fk_exoplanet
      FOREIGN KEY(fk_exoplanet_id) 
        REFERENCES exoplanet(id)
);

COMMENT ON COLUMN detections.rv_flag IS 'Flag indicating if the planet host star exhibits radial velocity variations due to the planet (1=yes, 0=no)';
COMMENT ON COLUMN detections.pul_flag IS 'Flag indicating if the planet host star exhibits pulsar timing variations due to the planet (1=yes, 0=no)';
COMMENT ON COLUMN detections.ptv_flag IS 'Flag indicating if the planet host star exhibits pulsation timing variations due to the planet (1=yes, 0=no)';
COMMENT ON COLUMN detections.tran_flag IS 'Flag indicating if the planet transits its host star (1=yes, 0=no)';
COMMENT ON COLUMN detections.ast_flag IS 'Flag indicating if the planet host star exhibits astrometrical variations due to the planet (1=yes, 0=no)';
COMMENT ON COLUMN detections.obm_flag IS 'Flag indicating whether the planet exhibits orbital modulations on the phase curve (1=yes, 0=no)';
COMMENT ON COLUMN detections.micro_flag IS 'Flag indicating if the planetary system acted as a lens during an observed microlensing event (1=yes, 0=no)';
COMMENT ON COLUMN detections.etv_flag IS 'Flag indicating whether a circumbinary planet that orbits an eclipsing binary induces eclipse timing variations (ETVs) in the binary pair (1=yes, 0=no)';
COMMENT ON COLUMN detections.ima_flag IS 'Flag indicating if the planet has been observed via imaging techniques (1=yes, 0=no)';
COMMENT ON COLUMN detections.dkin_flag IS 'Flag indicating if the presence of the planet was inferred due to its kinematic influence on the protoplanetary disk of its host star (1=yes, 0=no)';

CREATE TABLE planet_parameters (
	fk_exoplanet_id SERIAL PRIMARY KEY,
	pl_orbper FLOAT(53),
	pl_orbpererr1 FLOAT(53),
	pl_orbpererr2 FLOAT(53),
	pl_orbperlim FLOAT(53),
	pl_orbper_reflink VARCHAR(255),
	pl_orbsmax FLOAT(53),
	pl_orbsmaxerr1 FLOAT(53),
	pl_orbsmaxerr2 FLOAT(53),
	pl_orbsmaxlim FLOAT(53),
	pl_orbsmax_reflink VARCHAR(255),
	pl_angsep FLOAT(53),
	pl_angseperr1 FLOAT(53),
	pl_angseperr2 FLOAT(53),
	pl_angseplim FLOAT(53),
	pl_angsep_reflink VARCHAR(255),
	pl_rade FLOAT(53),
	pl_radeerr1 FLOAT(53),
	pl_radeerr2 FLOAT(53),
	pl_radelim FLOAT(53),
	pl_rade_reflink VARCHAR(255),
	pl_radj FLOAT(53),
	pl_radjerr1 FLOAT(53),
	pl_radjerr2 FLOAT(53),
	pl_radjlim FLOAT(53),
	pl_radj_reflink VARCHAR(255),
	pl_bmasse FLOAT(53),
	pl_bmasseerr1 FLOAT(53),
	pl_bmasseerr2 FLOAT(53),
	pl_bmasselim FLOAT(53),
	pl_bmasse_reflink VARCHAR(255),
	pl_bmassj FLOAT(53),
	pl_bmassjerr1 FLOAT(53),
	pl_bmassjerr2 FLOAT(53),
	pl_bmassjlim FLOAT(53),
	pl_bmassj_reflink VARCHAR(255),
	pl_bmassprov VARCHAR(255),
	pl_dens FLOAT(53),
	pl_denserr1 FLOAT(53),
	pl_denserr2 FLOAT(53),
	pl_denslim FLOAT(53),
	pl_orbeccen FLOAT(53),
	pl_orbeccenerr1 FLOAT(53),
	pl_orbeccenerr2 FLOAT(53),
	pl_orbeccenlim FLOAT(53),
	pl_insol FLOAT(53),
	pl_insolerr1 FLOAT(53),
	pl_insolerr2 FLOAT(53),
	pl_insollim FLOAT(53),
	pl_insol_reflink VARCHAR(255),
	pl_eqt DOUBLE PRECISION,
	pl_eqterr1 DOUBLE PRECISION,
	pl_eqterr2 DOUBLE PRECISION,
	pl_eqtlim DOUBLE PRECISION,
	pl_eqt_reflink VARCHAR(255),
	pl_orbincl FLOAT(53),
	pl_orbinclerr1 FLOAT(53),
	pl_orbinclerr2 FLOAT(53),
	pl_orbincllim FLOAT(53),
	pl_tranmid FLOAT(53),
	pl_tranmiderr1 FLOAT(53),
	pl_tranmiderr2 FLOAT(53),
	pl_tranmidlim FLOAT(53),
	pl_tranmid_reflink VARCHAR(255),
	ttv_flag BOOLEAN,
	pl_imppar FLOAT(53),
	pl_impparerr1 FLOAT(53),
	pl_impparerr2 FLOAT(53),
	pl_impparlim FLOAT(53),
	pl_imppar_reflink VARCHAR(255),
	pl_trandep FLOAT(53),
	pl_trandeperr1 FLOAT(53),
	pl_trandeperr2 FLOAT(53),
	pl_trandeplim FLOAT(53),
	pl_trandep_reflink VARCHAR(255),
	pl_trandur FLOAT(53),
	pl_trandurerr1 FLOAT(53),
	pl_trandurerr2 FLOAT(53),
	pl_trandurlim FLOAT(53),
	pl_trandur_reflink VARCHAR(255),
	pl_ratdor FLOAT(53),
	pl_ratdorerr1 FLOAT(53),
	pl_ratdorerr2 FLOAT(53),
	pl_ratdorlim FLOAT(53),
	pl_ratdor_reflink VARCHAR(255),
	pl_ratror FLOAT(53),
	pl_ratrorerr1 FLOAT(53),
	pl_ratrorerr2 FLOAT(53),
	pl_ratrorlim FLOAT(53),
	pl_ratror_reflink VARCHAR(255),
	pl_occdep FLOAT(53),
	pl_occdeperr1 FLOAT(53),
	pl_occdeperr2 FLOAT(53),
	pl_occdeplim FLOAT(53),
	pl_occdep_reflink VARCHAR(255),
	pl_orbtper FLOAT(53),
	pl_orbtpererr1 FLOAT(53),
	pl_orbtpererr2 FLOAT(53),
	pl_orbtperlim FLOAT(53),
	pl_orbtper_reflink VARCHAR(255),
	pl_orblper FLOAT(53),
	pl_orblpererr1 FLOAT(53),
	pl_orblpererr2 FLOAT(53),
	pl_orblperlim FLOAT(53),
	pl_rvamp FLOAT(53),
	pl_rvamperr1 FLOAT(53),
	pl_rvamperr2 FLOAT(53),
	pl_rvamplim FLOAT(53),
	pl_rvamp_reflink VARCHAR(255),
	pl_projobliq FLOAT(53),
	pl_projobliqerr1 FLOAT(53),
	pl_projobliqerr2 FLOAT(53),
	pl_projobliqlim FLOAT(53),
	pl_projobliq_reflink VARCHAR(255),
	pl_trueobliq FLOAT(53),
	pl_trueobliqerr1 FLOAT(53),
	pl_trueobliqerr2 FLOAT(53),
	pl_trueobliqlim FLOAT(53),
	pl_trueobliq_reflink VARCHAR(255),
	CONSTRAINT fk_exoplanet
      FOREIGN KEY(fk_exoplanet_id) 
        REFERENCES exoplanet(id)
);

COMMENT ON COLUMN planet_parameters.pl_orbper IS 'Time the planet takes to make a complete orbit around the host star or system';
COMMENT ON COLUMN planet_parameters.pl_orbper_reflink IS 'Reference of publication used for given planet parameter set';
COMMENT ON COLUMN planet_parameters.pl_orbsmax IS 'The longest radius of an elliptic orbit, or, for exoplanets detected via gravitational microlensing or direct imaging, the projected separation in the plane of the sky';
COMMENT ON COLUMN planet_parameters.pl_orbsmax_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_angsep IS 'Angular separation on the sky between the star and planet.';
COMMENT ON COLUMN planet_parameters.pl_angsep_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_rade IS 'Length of a line segment from the center of the planet to its surface, measured in units of radius of the Earth';
COMMENT ON COLUMN planet_parameters.pl_rade_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_radj IS 'Length of a line segment from the center of the planet to its surface, measured in units of radius of Jupiter';
COMMENT ON COLUMN planet_parameters.pl_radj_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_bmasse IS 'Best planet mass estimate available, in order of preference: Mass, M*sin(i)/sin(i), or M*sin(i), depending on availability, and measured in Earth masses';
COMMENT ON COLUMN planet_parameters.pl_bmasse_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_bmassj IS 'Best planet mass estimate available, in order of preference: Mass, M*sin(i)/sin(i), or M*sin(i), depending on availability, and measured in Jupiter masses';
COMMENT ON COLUMN planet_parameters.pl_bmassj_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_bmassprov IS 'Provenance of the measurement of the best mass. Options are: Mass, M*sin(i)/sin(i), and M*sini';
COMMENT ON COLUMN planet_parameters.pl_dens IS 'Amount of mass per unit of volume of the planet';
COMMENT ON COLUMN planet_parameters.pl_orbeccen IS 'Amount by which the orbit of the planet deviates from a perfect circle';
COMMENT ON COLUMN planet_parameters.pl_insol IS 'Insolation flux is another way to give the equilibrium temperature. It''s given in units relative to those measured for the Earth from the Sun.';
COMMENT ON COLUMN planet_parameters.pl_insol_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_eqt IS 'The equilibrium temperature of the planet as modeled by a black body heated only by its host star, or for directly imaged planets, the effective temperature of the planet required to match the measured luminosity if the planet were a black body';
COMMENT ON COLUMN planet_parameters.pl_eqt_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_orbincl IS 'Angle of the plane of the orbit relative to the plane perpendicular to the line-of-sight from Earth to the object';
COMMENT ON COLUMN planet_parameters.pl_tranmid IS 'The time given by the average of the time the planet begins to cross the stellar limb and the time the planet finishes crossing the stellar limb';
COMMENT ON COLUMN planet_parameters.pl_tranmid_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.ttv_flag IS 'Flag indicating if the planet orbit exhibits transit timing variations from another planet in the system (1=yes, 0=no)';
COMMENT ON COLUMN planet_parameters.pl_imppar IS 'The sky-projected distance between the center of the stellar disc and the center of the planet disc at conjunction, normalized by the stellar radius';
COMMENT ON COLUMN planet_parameters.pl_imppar_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_trandep IS 'The size of the relative flux decrement caused by the orbiting body transiting in front of the star';
COMMENT ON COLUMN planet_parameters.pl_trandep_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_trandur IS 'The length of time from the moment the planet begins to cross the stellar limb to the moment the planet finishes crossing the stellar limb';
COMMENT ON COLUMN planet_parameters.pl_trandur_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_ratdor IS 'The distance between the planet and the star at mid-transit divided by the stellar radius. For the case of zero orbital eccentricity, the distance at mid-transit is the semi-major axis of the planetary orbit.';
COMMENT ON COLUMN planet_parameters.pl_ratdor_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_ratror IS 'The planet radius divided by the stellar radius';
COMMENT ON COLUMN planet_parameters.pl_ratror_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_occdep IS 'Depth of occultation of secondary eclipse';
COMMENT ON COLUMN planet_parameters.pl_occdep_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_orbtper IS 'The time of the planet''s periastron passage';
COMMENT ON COLUMN planet_parameters.pl_orbtper_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_orblper IS 'The angular separation between the orbit''s ascending node and periastron';
COMMENT ON COLUMN planet_parameters.pl_rvamp IS 'Half the peak-to-peak amplitude of variability in the stellar radial velocity';
COMMENT ON COLUMN planet_parameters.pl_rvamp_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_projobliq IS 'The angle between the angular momentum vector of the rotation of the host star and the angular momentum vector of the orbit of the planet, projected into the plane of the sky. Depending on the choice of coordinate system, projected obliquity is represented in the literature as either lambda (λ) or beta (β), where λ is defined as the negative of β (i.e., λ = -β). Since λ is reported more often than β, all values of β have been converted to λ.';
COMMENT ON COLUMN planet_parameters.pl_projobliq_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN planet_parameters.pl_trueobliq IS 'The angle between the angular momentum vector of the rotation of the host star and the angular momentum vector of the orbit of the planet';
COMMENT ON COLUMN planet_parameters.pl_trueobliq_reflink IS 'Reference of publication used for given parameter set';

CREATE TABLE stellar_data (
	fk_exoplanet_id SERIAL PRIMARY KEY,
	st_spectype VARCHAR(255),
	st_spectype_reflink VARCHAR(255),
	st_teff FLOAT(53),
	st_tefferr1 FLOAT(53),
	st_tefferr2 FLOAT(53),
	st_tefflim FLOAT(53),
	st_teff_reflink VARCHAR(255),
	st_rad FLOAT(53),
	st_raderr1 FLOAT(53),
	st_raderr2 FLOAT(53),
	st_radlim FLOAT(53),
	st_rad_reflink VARCHAR(255),
	st_mass FLOAT(53),
	st_masserr1 FLOAT(53),
	st_masserr2 FLOAT(53),
	st_masslim FLOAT(53),
	st_mass_reflink VARCHAR(255),
	st_met FLOAT(53),
	st_meterr1 FLOAT(53),
	st_meterr2 FLOAT(53),
	st_metlim FLOAT(53),
	st_met_reflink VARCHAR(255),
	st_metratio FLOAT(53),
	st_lum FLOAT(53),
	st_lumerr1 FLOAT(53),
	st_lumerr2 FLOAT(53),
	st_lumlim FLOAT(53),
	st_lum_reflink VARCHAR(255),
	st_logg FLOAT(53),
	st_loggerr1 FLOAT(53),
	st_loggerr2 FLOAT(53),
	st_logglim FLOAT(53),
	st_logg_reflink VARCHAR(255),
	st_age FLOAT(53),
	st_ageerr1 FLOAT(53),
	st_ageerr2 FLOAT(53),
	st_agelim FLOAT(53),
	st_age_reflink VARCHAR(255),
	st_dens FLOAT(53),
	st_denserr1 FLOAT(53),
	st_denserr2 FLOAT(53),
	st_denslim FLOAT(53),
	st_dens_reflink VARCHAR(255),
	st_vsin FLOAT(53),
	st_vsinerr1 FLOAT(53),
	st_vsinerr2 FLOAT(53),
	st_vsinlim FLOAT(53),
	st_vsin_reflink VARCHAR(255),
	st_rotp FLOAT(53),
	st_rotperr1 FLOAT(53),
	st_rotperr2 FLOAT(53),
	st_rotplim FLOAT(53),
	st_rotp_reflink VARCHAR(255),
	st_radv FLOAT(53),
	st_radverr1 FLOAT(53),
	st_radverr2 FLOAT(53),
	st_radvlim FLOAT(53),
	st_radv_reflink VARCHAR(255),
	CONSTRAINT fk_exoplanet
      FOREIGN KEY(fk_exoplanet_id) 
        REFERENCES exoplanet(id)
);

COMMENT ON COLUMN stellar_data.st_spectype IS 'Classification of the star based on their spectral characteristics following the Morgan-Keenan system';
COMMENT ON COLUMN stellar_data.st_spectype_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN stellar_data.st_teff IS 'Temperature of the star as modeled by a black body emitting the same total amount of electromagnetic radiation';
COMMENT ON COLUMN stellar_data.st_teff_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN stellar_data.st_rad IS 'Length of a line segment from the center of the star to its surface, measured in units of radius of the Sun';
COMMENT ON COLUMN stellar_data.st_rad_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN stellar_data.st_mass IS 'Amount of matter contained in the star, measured in units of masses of the Sun';
COMMENT ON COLUMN stellar_data.st_mass_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN stellar_data.st_met IS 'Measurement of the metal content of the photosphere of the star as compared to the hydrogen content';
COMMENT ON COLUMN stellar_data.st_met_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN stellar_data.st_metratio IS 'Ratio for the Metallicity Value ([Fe/H] denotes iron abundance, [M/H] refers to a general metal content)';
COMMENT ON COLUMN stellar_data.st_lum IS 'Amount of energy emitted by a star per unit time, measured in units of solar luminosities';
COMMENT ON COLUMN stellar_data.st_lum_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN stellar_data.st_logg IS 'Gravitational acceleration experienced at the stellar surface';
COMMENT ON COLUMN stellar_data.st_logg_reflink IS 'Reference of publication used for given parameter setst_age';
COMMENT ON COLUMN stellar_data.st_age IS 'The age of the host star';
COMMENT ON COLUMN stellar_data.st_age_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN stellar_data.st_dens IS 'Amount of mass per unit of volume of the star';
COMMENT ON COLUMN stellar_data.st_dens_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN stellar_data.st_vsin IS 'Rotational velocity at the equator of the star multiplied by the sine of the inclination';
COMMENT ON COLUMN stellar_data.st_vsin_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN stellar_data.st_rotp IS 'The time required for the planet host star to complete one rotation, assuming it is a solid body';
COMMENT ON COLUMN stellar_data.st_rotp_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN stellar_data.st_radv IS 'Velocity of the star in the direction of the line of sight';
COMMENT ON COLUMN stellar_data.st_radv_reflink IS 'Reference of publication used for given parameter set';

CREATE TABLE system_data (
	fk_exoplanet_id SERIAL PRIMARY KEY,
	sy_pm FLOAT(53),
	sy_pmerr1 FLOAT(53),
	sy_pmerr2 FLOAT(53),
	sy_pm_reflink VARCHAR(255),
	sy_pmra FLOAT(53),
	sy_pmraerr1 FLOAT(53),
	sy_pmraerr2 FLOAT(53),
	sy_pmdec FLOAT(53),
	sy_pmdecerr1 FLOAT(53),
	sy_pmdecerr2 FLOAT(53),
	sy_dist FLOAT(53),
	sy_disterr1 FLOAT(53),
	sy_disterr2 FLOAT(53),
	sy_dist_reflink VARCHAR(255),
	sy_plx FLOAT(53),
	sy_plxerr1 FLOAT(53),
	sy_plxerr2 FLOAT(53),
	sy_plx_reflink VARCHAR(255),
	pl_nnotes INTEGER,
	CONSTRAINT fk_exoplanet
      FOREIGN KEY(fk_exoplanet_id) 
        REFERENCES exoplanet(id)
);

COMMENT ON COLUMN system_data.sy_pm IS 'Angular change in position over time as seen from the center of mass of the Solar System';
COMMENT ON COLUMN system_data.sy_pm_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN system_data.sy_pmra IS 'Angular change in right ascension over time as seen from the center of mass of the Solar System';
COMMENT ON COLUMN system_data.sy_pmdec IS 'Angular change in declination over time as seen from the center of mass of the Solar System';
COMMENT ON COLUMN system_data.sy_dist IS 'Distance to the planetary system in units of parsecs';
COMMENT ON COLUMN system_data.sy_dist_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN system_data.sy_plx IS 'Difference in the angular position of a star as measured at two opposite positions within the Earth''s orbit';
COMMENT ON COLUMN system_data.sy_plx_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN system_data.pl_nnotes IS 'Number of Notes associated with the planet. View all notes in the Confirmed Planet Overview page';

CREATE TABLE position(
	fk_exoplanet_id SERIAL PRIMARY KEY,
	rastr VARCHAR(255),
	decstr VARCHAR(255),
	ra FLOAT(53),
	dec FLOAT(53),
	glat FLOAT(53),
	glaterr1 FLOAT(53),
	glaterr2 FLOAT(53),
	glon FLOAT(53),
	glonterr1 FLOAT(53),
	glonterr2 FLOAT(53),
	elat FLOAT(53),
	elatterr1 FLOAT(53),
	elatterr2 FLOAT(53),
	elon FLOAT(53),
	elonterr1 FLOAT(53),
	elonterr2 FLOAT(53),
	CONSTRAINT fk_exoplanet
      FOREIGN KEY(fk_exoplanet_id) 
        REFERENCES exoplanet(id)
);

COMMENT ON COLUMN position.rastr IS 'Right Ascension of the planetary system in sexagesimal format';
COMMENT ON COLUMN position.decstr IS 'Declination of the planetary system in sexagesimal notation';
COMMENT ON COLUMN position.ra IS 'Right Ascension of the planetary system in decimal degrees';
COMMENT ON COLUMN position.dec IS 'Declination of the planetary system in decimal degrees';
COMMENT ON COLUMN position.glat IS 'Galactic latitude of the planetary system in units of decimal degrees';
COMMENT ON COLUMN position.glon IS 'Galactic longitude of the planetary system in units of decimal degrees';
COMMENT ON COLUMN position.elat IS 'Ecliptic latitude of the planetary system in units of decimal degrees';
COMMENT ON COLUMN position.elon IS 'Ecliptic longitude of the planetary system in units of decimal degrees';

CREATE TABLE photometry(
	fk_exoplanet_id SERIAL PRIMARY KEY,
	sy_bmag FLOAT(53),
	sy_bmagerr1 FLOAT(53),
	sy_bmagerr2 FLOAT(53),
	sy_bmag_reflink VARCHAR(255),
	sy_vmag FLOAT(53),
	sy_vmagerr1 FLOAT(53),
	sy_vmagerr2 FLOAT(53),
	sy_vmag_reflink VARCHAR(255),
	sy_jmag FLOAT(53),
	sy_jmagerr1 FLOAT(53),
	sy_jmagerr2 FLOAT(53),
	sy_jmag_reflink VARCHAR(255),
	sy_hmag FLOAT(53),
	sy_hmagerr1 FLOAT(53),
	sy_hmagerr2 FLOAT(53),
	sy_hmag_reflink VARCHAR(255),
	sy_kmag FLOAT(53),
	sy_kmagerr1 FLOAT(53),
	sy_kmagerr2 FLOAT(53),
	sy_kmag_reflink VARCHAR(255),
	sy_umag FLOAT(53),
	sy_umagerr1 FLOAT(53),
	sy_umagerr2 FLOAT(53),
	sy_umag_reflink VARCHAR(255),
	sy_gmag FLOAT(53),
	sy_gmagerr1 FLOAT(53),
	sy_gmagerr2 FLOAT(53),
	sy_gmag_reflink VARCHAR(255),
	sy_rmag FLOAT(53),
	sy_rmagerr1 FLOAT(53),
	sy_rmagerr2 FLOAT(53),
	sy_rmag_reflink VARCHAR(255),
	sy_imag FLOAT(53),
	sy_imagerr1 FLOAT(53),
	sy_imagerr2 FLOAT(53),
	sy_imag_reflink VARCHAR(255),
	sy_zmag FLOAT(53),
	sy_zmagerr1 FLOAT(53),
	sy_zmagerr2 FLOAT(53),
	sy_zmag_reflink VARCHAR(255),
	sy_w1mag FLOAT(53),
	sy_w1magerr1 FLOAT(53),
	sy_w1magerr2 FLOAT(53),
	sy_w1mag_reflink VARCHAR(255),
	sy_w2mag FLOAT(53),
	sy_w2magerr1 FLOAT(53),
	sy_w2magerr2 FLOAT(53),
	sy_w2mag_reflink VARCHAR(255),
	sy_w3mag FLOAT(53),
	sy_w3magerr1 FLOAT(53),
	sy_w3magerr2 FLOAT(53),
	sy_w3mag_reflink VARCHAR(255),
	sy_w4mag FLOAT(53),
	sy_w4magerr1 FLOAT(53),
	sy_w4magerr2 FLOAT(53),
	sy_w4mag_reflink VARCHAR(255),
	sy_gaiamag FLOAT(53),
	sy_gaiamagerr1 FLOAT(53),
	sy_gaiamagerr2 FLOAT(53),
	sy_gaiamag_reflink VARCHAR(255),
	sy_icmag FLOAT(53),
	sy_icmagerr1 FLOAT(53),
	sy_icmagerr2 FLOAT(53),
	sy_icmag_reflink VARCHAR(255),
	sy_tmag FLOAT(53),
	sy_tmagerr1 FLOAT(53),
	sy_tmagerr2 FLOAT(53),
	sy_tmag_reflink VARCHAR(255),
	sy_kepmag FLOAT(53),
	sy_kepmagerr1 FLOAT(53),
	sy_kepmagerr2 FLOAT(53),
	sy_kepmag_reflink VARCHAR(255),
	CONSTRAINT fk_exoplanet
      FOREIGN KEY(fk_exoplanet_id) 
        REFERENCES exoplanet(id)
);

COMMENT ON COLUMN photometry.sy_bmag IS 'Brightness of the host star as measured using the B (Johnson) band in units of magnitudes';
COMMENT ON COLUMN photometry.sy_bmag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_vmag IS 'Brightness of the host star as measured using the V (Johnson) band in units of magnitudes';
COMMENT ON COLUMN photometry.sy_vmag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_jmag IS 'Brightness of the host star as measured using the J (2MASS) band in units of magnitudes';
COMMENT ON COLUMN photometry.sy_jmag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_hmag IS 'Brightness of the host star as measured using the H (2MASS) band in units of magnitudes';
COMMENT ON COLUMN photometry.sy_hmag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_kmag IS 'Brightness of the host star as measured using the K (2MASS) band in units of magnitudes';
COMMENT ON COLUMN photometry.sy_kmag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_umag IS 'Brightness of the host star as measured using the Sloan Digital Sky Survey (SDSS) u band, in units of magnitudes';
COMMENT ON COLUMN photometry.sy_umag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_gmag IS 'Brightness of the host star as measured using the Sloan Digital Sky Survey (SDSS) g band, in units of magnitudes';
COMMENT ON COLUMN photometry.sy_gmag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_rmag IS 'Brightness of the host star as measured using the Sloan Digital Sky Survey (SDSS) r band, in units of magnitudes';
COMMENT ON COLUMN photometry.sy_rmag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_imag IS 'Brightness of the host star as measured using the Sloan Digital Sky Survey (SDSS) i band, in units of magnitudes';
COMMENT ON COLUMN photometry.sy_imag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_zmag IS 'Brightness of the host star as measured using the Sloan Digital Sky Survey (SDSS) z band, in units of magnitudes';
COMMENT ON COLUMN photometry.sy_zmag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_w1mag IS 'Brightness of the host star as measured using the 3.4um (WISE) band in units of magnitudes';
COMMENT ON COLUMN photometry.sy_w1mag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_w2mag IS 'Brightness of the host star as measured using the 4.6um (WISE) band in units of magnitudes';
COMMENT ON COLUMN photometry.sy_w2mag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_w3mag IS 'Brightness of the host star as measured using the 12.um (WISE) band in units of magnitudes';
COMMENT ON COLUMN photometry.sy_w3mag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_w4mag IS 'Brightness of the host star as measured using the 22.um (WISE) band in units of magnitudes';
COMMENT ON COLUMN photometry.sy_w4mag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_gaiamag IS 'Brightness of the host star as measured using the Gaia band in units of magnitudes. Objects matched to Gaia using the Hipparcos or 2MASS IDs provided in Gaia DR2';
COMMENT ON COLUMN photometry.sy_gaiamag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_icmag IS 'Brightness of the host star as measured using the I (Cousins) band in units of magnitudes';
COMMENT ON COLUMN photometry.sy_icmag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_tmag IS 'Brightness of the host star as measured using the TESS bandpass, in units of magnitudes	]';
COMMENT ON COLUMN photometry.sy_tmag_reflink IS 'Reference of publication used for given parameter set';
COMMENT ON COLUMN photometry.sy_kepmag IS 'Brightness of the host star as measured using the Kepler bandpass, in units of magnitudes';
COMMENT ON COLUMN photometry.sy_kepmag_reflink IS 'Reference of publication used for given parameter set';

CREATE TABLE exoplanet_addition (
	fk_exoplanet_id SERIAL PRIMARY KEY,
	st_nphot INTEGER,
	st_nrvc INTEGER,
	pl_ntranspec INTEGER,
	pl_nespec INTEGER,
	st_nspec INTEGER,
	CONSTRAINT fk_exoplanet
      FOREIGN KEY(fk_exoplanet_id) 
        REFERENCES exoplanet(id)
);

COMMENT ON COLUMN exoplanet_addition.st_nphot IS 'Number of photometric time series records, including planet transit light curves, general transit light curves, and amateur light curves';
COMMENT ON COLUMN exoplanet_addition.st_nrvc IS 'Number of literature radial velocity curves available for this star in the NASA Exoplanet Archive';
COMMENT ON COLUMN exoplanet_addition.pl_ntranspec IS 'Number of literature transmission spectrum measurements for this star in the NASA Exoplanet Archive';
COMMENT ON COLUMN exoplanet_addition.pl_nespec IS 'Number of literature emission spectrum measurements for this star in the NASA Exoplanet Archive';
COMMENT ON COLUMN exoplanet_addition.st_nspec IS 'Number of literature spectra available for this star in the NASA Exoplanet Archive';

