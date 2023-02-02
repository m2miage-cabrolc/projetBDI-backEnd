package miagiles.gromed.controller;

import static org.mockito.Mockito.mock;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;
import org.apache.catalina.connector.Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PresentationControllerTest {
    /**
     * Method under test: {@link PresentationController#read(HttpServletResponse, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRead() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        PresentationController presentationController = new PresentationController();
        presentationController.read(new Response(), 3, 1);
    }

    /**
     * Method under test: {@link PresentationController#read(HttpServletResponse, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRead2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new PresentationController()).read(mock(HttpServletResponseWrapper.class), 3, 1);
    }

    /**
     * Method under test: {@link PresentationController#read(HttpServletResponse, int, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRead3() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        PresentationController presentationController = new PresentationController();
        presentationController.read(new Response(), 0, 1);
    }

    /**
     * Method under test: {@link PresentationController#getById(long, HttpServletResponse)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetById() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        PresentationController presentationController = new PresentationController();
        presentationController.getById(1L, new Response());
    }

    /**
     * Method under test: {@link PresentationController#getById(long, HttpServletResponse)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetById2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new PresentationController()).getById(1L, mock(HttpServletResponseWrapper.class));
    }

    /**
     * Method under test: {@link PresentationController#getMeds(String, HttpServletResponse)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMeds() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        PresentationController presentationController = new PresentationController();
        presentationController.getMeds("Denom", new Response());
    }

    /**
     * Method under test: {@link PresentationController#getMeds(String, HttpServletResponse)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetMeds2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new PresentationController()).getMeds("Denom", mock(HttpServletResponseWrapper.class));
    }

    /**
     * Method under test: {@link PresentationController#getPresentationsByFiltre(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPresentationsByFiltre() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new PresentationController()).getPresentationsByFiltre("Denom", "Forme Pharma").iterator();
    }

    /**
     * Method under test: {@link PresentationController#getPresentationsByFiltre(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetPresentationsByFiltre2() {
        // TODO: Complete this test.
        //   Diffblue AI was unable to find a test

        (new PresentationController()).getPresentationsByFiltre("foo", "foo").iterator();
    }
}

