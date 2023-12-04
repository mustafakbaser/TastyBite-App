package net.mustafabaser.tastybite.data.entity;

public class CRUDResponse {
    private int success;
    private String message;

    public CRUDResponse() {
    }

    public CRUDResponse(int success, String message) {
        this.success = success;
        this.message = message;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
