package com.github.yeriomin.smsscheduler;

public class SmsSentReceiver extends WakefulBroadcastReceiver {

    @Override
    protected Class getServiceClass() {
        return SmsSentService.class;
    }
}
