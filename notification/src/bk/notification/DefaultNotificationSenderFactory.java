package bk.notification;

import java.util.Map;

public class DefaultNotificationSenderFactory implements NotificationSenderFactory {
    private final Map<NotificationType, NotificationSender> notificationSenderMap;

    public DefaultNotificationSenderFactory() {

        notificationSenderMap = Map.of(
                NotificationType.SMS, new NotificationSMSSender(),
                NotificationType.TELEGRAM, new NotificationTelegramSender(),
                NotificationType.EMAIL, new NotificationEMAILSender());
    }


    @Override
    public Map<NotificationType, NotificationSender> getNotificationSenderMap() {
        return notificationSenderMap;
    }
}
