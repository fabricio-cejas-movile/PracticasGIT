package com.favrizzio.practicas.general;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.MessageFormat;

/**
 * We generate encrypted data from a string using a public key that PERSONAL give us, this key never change.
 * @author Fabricio Cejas -fabricio.cejas@movile.com
 */
public class CryptoInfotainment {

    // private static final Logger SUBSCRIPTION_LOGGER = Loggers.SUBSCRIPTION.getLogger();
    //
    // private static final Logger EXCEPTIONS_LOGGER = Loggers.EXCEPTIONS.getLogger();

    private static final String PUBLIC_KEY_FILE = "pKey.crt";

    private static final String COMMAND_FRAGMENT = "echo \"{0}\" | /usr/bin/openssl rsautl -encrypt -certin -inkey {1} | /usr/bin/base64";

    private String queryStringToEncrypted;

    private String certificateKeyPath;

    public CryptoInfotainment(String queryStringToEncrypted) throws Exception {

        this.queryStringToEncrypted = queryStringToEncrypted;

        this.certificateKeyPath = getClass().getResource("/").getFile();
    }

    public String encryptDataCMD() throws Exception {

        StringBuilder encrypted = new StringBuilder();

        String filePath = this.certificateKeyPath + PUBLIC_KEY_FILE;

        String command = MessageFormat.format(COMMAND_FRAGMENT, this.queryStringToEncrypted, filePath);

        // SUBSCRIPTION_LOGGER.info("[Infotainmnet][Encrypt process will run][command : {}]", command);

        Process process = Runtime.getRuntime().exec(new String[] {"/bin/sh", "-c", command});

        BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));

        BufferedReader errorStream = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        String appender = null;

        boolean interrupted = false;
        try {
            process.waitFor();
        } catch (InterruptedException e) {
            interrupted = true;
        } finally {
            if (interrupted) {
                Thread.interrupted();
            }
        }

        int code = process.exitValue();

        if (code != 0) {

            // EXCEPTIONS_LOGGER.error("[CMD PROC] [FINISH] Execution has encontered an error, with exitValue={}", code);

            throw new Exception("[CMD PROC] [FINISH] Execution has encontered an error");
        }

        if (errorStream.readLine() == null) {
            while ((appender = inputStream.readLine()) != null) {
                encrypted.append(appender);
            }

        }

        return encrypted.toString();
    }

}
