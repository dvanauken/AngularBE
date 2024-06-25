package com.example.backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.authenticated;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SecurityConfigTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldAllowAccessToLoginPage() throws Exception {
        mockMvc.perform(get("/login"))
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnUnauthorizedForUnauthenticatedRequests() throws Exception {
        mockMvc.perform(get("/app/protected"))
                .andExpect(status().isUnauthorized()); // Expect a 401 status
    }


    @Test
    public void shouldAuthenticateUserWithValidCredentials() throws Exception {
        mockMvc.perform(formLogin().user("admin").password("admin"))
                .andExpect(authenticated().withUsername("admin"));
    }
}
