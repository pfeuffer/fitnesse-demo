package de.pfeufferweb.fitnesse.demo;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class ServerConfiguration {

    private static String user;
    private static String password;

    public void setUser(String user) {
        ServerConfiguration.user = user;
    }

    public void setPassword(String password) {
        ServerConfiguration.password = password;
    }

    public static String getEffectiveUser() {
        String userFromSystem = System.getenv("FITNESSE_USER");
        return userFromSystem == null ? user : userFromSystem;
    }

    public static String getEffectivePassword() {
        String passwordFromSystem = System.getenv("FITNESSE_PASSWORD");
        return passwordFromSystem == null ? password : passwordFromSystem;
    }

    public String effectiveUser() {
        return getEffectiveUser();
    }

    public String effectivePassword() {
        return getEffectivePassword();
    }

    public String effectivePasswordSet() {
        return getEffectivePassword() == null || getEffectivePassword().isEmpty() ? "no": "ok";
    }

    public String testEnv() {
        return System.getenv("fitnesseTestServer");
    }

    public String testProp() {
        return System.getProperty("project.version");
    }
}
