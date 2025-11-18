package bk.notification;

public interface NotificationSender <T extends NotificationModel> {

    void send(T notificationModel);
    NotificationType getNotificationType ();
}
