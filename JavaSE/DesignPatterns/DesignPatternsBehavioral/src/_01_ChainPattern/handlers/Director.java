package _01_ChainPattern.handlers;

import _01_ChainPattern.requests.Request;
import _01_ChainPattern.requests.RequestType;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
