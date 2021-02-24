package ke.co.lawrencekaranja.covidvaccinetracker.vaccinetracker.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PopulationControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    PopulationController populationController;
    private MockMvc mockMvc;

    @Test
    void contextLoads(){
        assertThat(populationController).isNotNull();
    }

    @Test
    public void shouldCreateNewUser() throws Exception{
//        this.mockMvc.perform(get("/population")).andDo(print()).andDo(populationController.createNewUser("077777777")).andExpect(status().isCreated())
    }
}