package com.denisgwt.server;

import com.denisgwt.client.denisgwtService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class denisgwtServiceImpl extends RemoteServiceServlet implements denisgwtService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}