package _01_ChainPattern.handlers;

import _01_ChainPattern.requests.Request;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
