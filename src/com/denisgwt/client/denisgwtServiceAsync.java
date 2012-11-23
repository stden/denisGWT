package com.denisgwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface denisgwtServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
