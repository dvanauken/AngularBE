package com.example.backend;

import com.example.backend.config.DatabaseConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;
import org.mockito.Mock;
import java.sql.Connection;
import java.sql.SQLException;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

@SpringBootTest
class DatabaseConfigTest {

    @Mock
    private Connection connection;

    @Test
    void testJdbcTemplateBean() throws SQLException {

        // Arrange
        DatabaseConfig config = new DatabaseConfig();

        // Mock data source
        DataSource dataSource = mock(DataSource.class);

        // Mock connection
        when(dataSource.getConnection()).thenReturn(connection);

        doNothing().when(connection).close();

        JdbcTemplate jdbcTemplate = config.jdbcTemplate(dataSource);

        assertNotNull(jdbcTemplate);

    }

}