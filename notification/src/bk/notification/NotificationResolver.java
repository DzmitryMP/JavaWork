package bk.notification;

import bk.notification.factory.NotificationSenderFactory;
import bk.notification.sender.LoggedNotificationSenderDecorator;
import bk.notification.sender.NotificationSender;

import java.util.HashMap;
import java.util.Map;

public class NotificationResolver {

    private final Map<NotificationType, NotificationSender> notificationSenderMap;

    public NotificationResolver(NotificationSenderFactory notificationSenderFactory) {
        notificationSenderMap = new HashMap<>();
        for (NotificationSender notificationSender : notificationSenderFactory.getNotificationSenderList()) {
            notificationSenderMap.put(notificationSender.getNotificationType(), notificationSender);
        }
    }

    public NotificationSender resolve(NotificationType notificationType) {
        return new LoggedNotificationSenderDecorator(notificationSenderMap.get(notificationType));
    }
}
