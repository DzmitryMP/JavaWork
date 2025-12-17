package bk.notification.sender;

import bk.notification.NotificationType;
import bk.notification.model.NotificationModel;

public interface NotificationSender <T extends NotificationModel> {

    void send(T notificationModel);
    NotificationType getNotificationType ();
}
