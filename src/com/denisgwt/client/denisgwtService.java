package com.denisgwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("denisgwtService")
public interface denisgwtService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use denisgwtService.App.getInstance() to access static instance of denisgwtServiceAsync
     */
    public static class App {
        private static denisgwtServiceAsync ourInstance = GWT.create(denisgwtService.class);

        public static synchronized denisgwtServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
