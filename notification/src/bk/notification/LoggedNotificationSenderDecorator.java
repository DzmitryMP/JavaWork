package bk.notification;

public class LoggedNotificationSenderDecorator implements NotificationSender {


    private final NotificationSender notificationSender;

    public LoggedNotificationSenderDecorator(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    @Override
    public void send(NotificationModel notificationModel) {
        System.out.println(notificationSender.getNotificationType() + " отправляется");
        notificationSender.send(notificationModel);
        System.out.println(notificationSender.getNotificationType() + "  отправлено");
    }

    @Override
    public NotificationType getNotificationType() {
        return notificationSender.getNotificationType();
    }
}
