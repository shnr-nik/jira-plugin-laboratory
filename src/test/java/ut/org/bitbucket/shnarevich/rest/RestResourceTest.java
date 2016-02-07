package ut.org.bitbucket.shnarevich.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.bitbucket.shnarevich.rest.RestResourcecopy;

public class RestResourceTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {
        RestResourcecopy resource = new RestResourcecopy();

//        Response response = resource.getMessage();
//        final RestResourceModel message = (RestResourceModel) response.getEntity();

//        assertEquals("wrong message","Hello World",message.getMessage());
    }
}
