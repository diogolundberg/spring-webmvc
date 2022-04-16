package webmvc.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import webmvc.Config;
import webmvc.service.CrudService;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class)
@WebAppConfiguration
class CityControllerTest {

    private final CrudService service = mock(CrudService.class);
    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new CityController(service)).build();
    }

    @Test
    public void getCitiesShouldReturnOK() throws Exception {
        final ResultActions result = mockMvc.perform(get("/cities").accept(APPLICATION_JSON_VALUE));

        result.andExpect(status().isOk());
    }
}