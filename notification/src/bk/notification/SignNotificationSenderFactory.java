package bk.notification;

import java.util.Map;

public class SignNotificationSenderFactory implements NotificationSenderFactory{
    private final Map<NotificationType, NotificationSender> notificationSenderMap;

    public SignNotificationSenderFactory() {

        notificationSenderMap = Map.of(
                NotificationType.SMS, new NotificationSMSSender(),
                NotificationType.EMAIL, new NotificationEMAILSender());
    }


    @Override
    public Map<NotificationType, NotificationSender> getNotificationSenderMap() {
        return notificationSenderMap;
    }
}
