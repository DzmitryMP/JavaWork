package bk.notification;

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
