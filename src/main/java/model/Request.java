package model;

public abstract class Request<T> {
    private final long requestNum; // Should be a uniquely generated number

    public Request(long requestNum){
        this.requestNum = requestNum;
    }

    public long getRequestNum(){
        return requestNum;
    }

    public abstract T completeRequest(T data);
}
