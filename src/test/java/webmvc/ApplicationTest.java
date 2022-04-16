package webmvc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


class ApplicationTest {

    @Test
    void shouldRun() {
        assertDoesNotThrow(() -> Application.main(new String[]{}));
    }
}