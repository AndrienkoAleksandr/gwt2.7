package com.test.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Created by antey on 27.07.15.
 */
public interface GreetingServiceAsync {
    void greetServer(String name, AsyncCallback<String> async);
}
