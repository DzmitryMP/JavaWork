package bk.notification.factory;

import bk.notification.sender.NotificationEMAILSender;
import bk.notification.sender.NotificationSMSSender;
import bk.notification.sender.NotificationSender;

import java.util.List;

public class SignNotificationSenderFactory implements NotificationSenderFactory{
    private final List<NotificationSender> notificationSenderList;

    public SignNotificationSenderFactory() {

        notificationSenderList = List.of(
                new NotificationSMSSender(),
                new NotificationEMAILSender());
    }


    @Override
    public List<NotificationSender> getNotificationSenderList() {
        return notificationSenderList;
    }
}
