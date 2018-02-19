package com.example.redoyahmed.ezyperl.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by redoy.ahmed on 19-Feb-2018.
 */

public class OutputResponse {

    @SerializedName("output")
    private String output;

    @SerializedName("statusCode")
    private String statusCode;

    @SerializedName("memory")
    private String memory;

    @SerializedName("cpuTime")
    private String cpuTime;

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(String cpuTime) {
        this.cpuTime = cpuTime;
    }
}
