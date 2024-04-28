package ua.com.kievgreenclub.IntegrationTestes.Controller.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import ua.com.kievgreenclub.Controller.Controllers.PlantController;
import ua.com.kievgreenclub.Model.Entity.Plant;
import ua.com.kievgreenclub.Model.Service.PlantService;

import java.util.List;

import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PlantController.class)
public class PlantControllerIntegrationTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PlantService plantService;

    @Test
    public void testGetAllPlants() throws Exception {
        Plant plant = new Plant();
        plant.setName("Fern");
        given(plantService.findAllPlants()).willReturn(List.of(plant));

        mockMvc.perform(get("/plants")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Fern"));
    }

}
