package ua.com.kievgreenclub;

public class ApiResponse {

    private boolean status;
    private String message;

    // Default constructor
    public ApiResponse() {
    }

    // Constructor with all parameters
    public ApiResponse(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    // Getter and setter for status
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Getter and setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
