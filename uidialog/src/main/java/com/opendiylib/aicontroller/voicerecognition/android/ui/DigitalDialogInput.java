package com.opendiylib.aicontroller.voicerecognition.android.ui;


import com.opendiylib.aicontroller.core.recog.MyRecognizer;
import com.opendiylib.aicontroller.core.recog.listener.ChainRecogListener;

import java.util.Map;

/**
 * Created by fujiayi on 2017/10/18.
 */

public class DigitalDialogInput {
    private MyRecognizer myRecognizer;

    private ChainRecogListener listener;

    private int code;

    private Map<String, Object> startParams;

    public DigitalDialogInput(MyRecognizer myRecognizer, ChainRecogListener listener, Map<String, Object> startParams) {
        if (myRecognizer == null) {
            throw new NullPointerException("myRecogizer param is null");
        }
        if (listener == null) {
            throw new NullPointerException("listener param is null");
        }
        if (startParams == null) {
            throw new NullPointerException("startParams param is null");
        }

        this.myRecognizer = myRecognizer;
        this.listener = listener;
        this.startParams = startParams;
    }

    public MyRecognizer getMyRecognizer() {
        return myRecognizer;
    }

    public ChainRecogListener getListener() {
        return listener;
    }

    public Map<String, Object> getStartParams() {
        return startParams;
    }
}
