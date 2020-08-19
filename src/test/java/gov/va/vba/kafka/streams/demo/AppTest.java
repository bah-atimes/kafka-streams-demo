package gov.va.vba.kafka.streams.demo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @InjectMocks
    App app;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testTheApp() {
        String arr[] = new String[]{"something"};
        app.main(arr);
    }
}
