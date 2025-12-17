package bk.notification.factory;

import bk.notification.sender.NotificationEMAILSender;
import bk.notification.sender.NotificationSMSSender;
import bk.notification.sender.NotificationSender;
import bk.notification.sender.NotificationTelegramSender;

import java.util.List;

public class DefaultNotificationSenderFactory implements NotificationSenderFactory {

    private final List<NotificationSender> notificationSenderList;

    public DefaultNotificationSenderFactory() {

        notificationSenderList = List.of(
                new NotificationSMSSender(),
                new NotificationTelegramSender(),
                new NotificationEMAILSender());
    }


    @Override
    public List<NotificationSender> getNotificationSenderList() {
        return notificationSenderList;
    }
}
