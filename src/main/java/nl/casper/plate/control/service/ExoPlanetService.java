package nl.casper.plate.control.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nl.casper.plate.entity.dto.PSCompParsDTO;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@ApplicationScoped
public class ExoPlanetService {

    private ObjectMapper objectMapper;

    @Inject
    public ExoPlanetService(final ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void importExoPlanetsFromJson() throws IOException {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM"));

        final File file = new File("src/main/resources/pscomppars.json");
        final PSCompParsDTO[] dtos = objectMapper.readValue(file, PSCompParsDTO[].class);
        System.out.println(Arrays.stream(dtos).findFirst());
    }
}
