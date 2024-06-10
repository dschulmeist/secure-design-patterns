package org.secureStrategyFactory.model;

public class Credentials {
    private String type;
    private String username;
    private String password;
    private String token;
    private byte[] biometricData;

    public Credentials(String type, String username, String password, String token, byte[] biometricData) {
        this.type = type;
        this.username = username;
        this.password = password;
        this.token = token;
        this.biometricData = biometricData;
    }

    public String getType() {
        return type;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getToken() {
        return token;
    }

    public byte[] getBiometricData() {
        return biometricData;
    }
}
