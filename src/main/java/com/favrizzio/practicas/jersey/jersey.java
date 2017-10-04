package com.favrizzio.practicas.jersey;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class jersey {

    private static Client client;

    static {
        client = Client.create();
        client.setConnectTimeout(10000);

    }

    private static String requestJSON(String url) throws Exception {
        long begin = System.currentTimeMillis();

        // REQUESTS_PERFORMED_LOGGER.info("Requesting: {}", url);
        WebResource webResource = client.resource(url);
        webResource.accept(MediaType.TEXT_PLAIN);

        String json = webResource.get(String.class);
        // REQUESTS_PERFORMED_LOGGER.info("Response of {} (in {} ms): {}", url, (System.currentTimeMillis() - begin), json);

        // List<String> responseData = OBJECT_MAPPER.readValue(json, TYPE_REFERENCE);

        return json;
    }

    public static void main(String[] args) throws Exception {
        jersey g = new jersey();

        g.requestJSON("http://wap-cycle.cyclelogic.com/wapestag/plugins/AdP/decrypt/smsc.php?xmsisdn=tsUViMMn4rVhNhRoiWYnISZ2y7KLwIhVxN2IYtJ/HS73kwmj6kRNgH2E5gFdK23exddTTN1k8xhEz9SgPxGODw==");
    }

}
