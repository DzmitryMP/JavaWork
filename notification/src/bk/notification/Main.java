package bk.notification;

public class Main {
    public static void main(String[] args) {
        String notificationTypeStr = "SMS";
        NotificationType notificationType = NotificationType.valueOf(notificationTypeStr);
        NotificationSender notificationSender = new  NotificationResolver(new DefaultNotificationSenderFactory())
                .resolve(notificationType);
        notificationSender.send();
    }
}
