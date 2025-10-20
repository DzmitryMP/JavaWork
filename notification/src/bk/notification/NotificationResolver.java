package bk.notification;

import java.util.HashMap;
import java.util.Map;

public class NotificationResolver {

    private final Map<NotificationType, NotificationSender> notificationSenderMap = new HashMap<>();

    public NotificationResolver() {
        notificationSenderMap.put(NotificationType.SMS, new NotificationSMSSender());
        notificationSenderMap.put(NotificationType.TELEGRAM, new NotificationTelegramSender());
        notificationSenderMap.put(NotificationType.EMAIL, new NotificationEMAILSender());
    }

    public NotificationSender resolve(NotificationType notificationType) {
        return notificationSenderMap.get(notificationType);
    }
}
