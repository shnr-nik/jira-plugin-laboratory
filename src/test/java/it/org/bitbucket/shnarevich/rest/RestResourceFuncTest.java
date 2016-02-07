package it.org.bitbucket.shnarevich.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

import org.bitbucket.shnarevich.rest.RestResourceModel;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;

public class RestResourceFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {

        String baseUrl = System.getProperty("baseurl");
        String resourceUrl = baseUrl + "/rest/restresource/1.0/message";

        RestClient client = new RestClient();
        Resource resource = client.resource(resourceUrl);

        RestResourceModel message = resource.get(RestResourceModel.class);

        assertEquals("wrong message","Hello World",message.getMessage());
    }
}
