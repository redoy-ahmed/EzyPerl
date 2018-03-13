package com.example.redoyahmed.ezyperl.Utils;

public class Content {
    static final String TYPE_CODE = "code";
    static final String TYPE_HTML = "html";
    static final String TYPE_TEXT = "text";
    private String text;
    private String type;

    public Content(String text, String type) {
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }
}
