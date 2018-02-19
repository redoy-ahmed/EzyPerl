package com.example.redoyahmed.ezyperl.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by redoy.ahmed on 19-Feb-2018.
 */

public class Data {

    @SerializedName("script")
    private String script;

    @SerializedName("language")
    private String language;

    @SerializedName("versionIndex")
    private String versionIndex;

    @SerializedName("clientId")
    private String clientId;

    @SerializedName("clientSecret")
    private String clientSecret;

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getVersionIndex() {
        return versionIndex;
    }

    public void setVersionIndex(String versionIndex) {
        this.versionIndex = versionIndex;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
