package com.denisgwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.uibinder.client.UiBinder;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 24.11.12
 * Time: 2:01
 * To change this template use File | Settings | File Templates.
 */
public class TestForm {
    interface TestFormUiBinder extends UiBinder<DivElement, TestForm> {
    }

    private static TestFormUiBinder ourUiBinder = GWT.create(TestFormUiBinder.class);

    public TestForm() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);

    }
}