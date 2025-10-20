package bk.notification;

public interface NotificationSender {

    void send();
    NotificationType getNotificationType ();
}
