package bk.notification;

import java.util.Map;

public interface NotificationSenderFactory {

    Map<NotificationType, NotificationSender> getNotificationSenderMap ();

}
