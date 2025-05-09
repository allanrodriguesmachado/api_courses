package br.com.course;

import br.com.course.controller.FirstControllers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(FirstControllers.class)
public class FirstControllersTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testRootEndPoint() throws Exception
    {
        mockMvc.perform(get("/list")).andExpect(status().isOk());
    }
}
