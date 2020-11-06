package model;

import java.util.Date;

public class MostRecent {

    private String message;
    private Long timestamp;

    public MostRecent( Long timestamp ,  String message) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public  Long getTimestamp() {
        return this.timestamp;
    }

    public  String getMessage() {
        return this.message;
    }

    public String toString(){
        return  timestamp +  " : " + message;
    }

}
