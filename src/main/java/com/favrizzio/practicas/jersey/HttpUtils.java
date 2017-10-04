package com.favrizzio.practicas.jersey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public final class HttpUtils {

    // private static final Logger REQUEST_PERFORMED_LOGGER = Logger.getLogger("requests_performed");

    // TODO configure TIMEOUT
    private static final int CONN_DEFAULT_TIMEOUT = 120000;

    private HttpUtils() {
    }

    public static String doGet(String strUrl, String accept) throws Exception {
        // StopWatch chronometer = new StopWatch();
        // chronometer.start();

        URL url = new URL(strUrl);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setDefaultUseCaches(false);
        conn.setRequestProperty("Accept", accept);
        conn.setInstanceFollowRedirects(true);
        conn.setConnectTimeout(CONN_DEFAULT_TIMEOUT);
        conn.setReadTimeout(CONN_DEFAULT_TIMEOUT);
        conn.setUseCaches(false);

        String result = read(conn);

        // REQUEST_PERFORMED_LOGGER.debug("Response url: " + url + " Response: " + result.toString() + " apiUrl ={" + chronometer.getTime() + "} ms");
        // chronometer.stop();
        conn.disconnect();

        return result;
    }

    private static String read(HttpURLConnection connection) throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder result = new StringBuilder();
        if (bufferedReader != null) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
            }
        }

        return result.toString();
    }
}
