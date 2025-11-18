package bk.notification;

public class NotificationTelegramSender implements NotificationSender<TelegramNotificationModel> {
    @Override
    public void send(TelegramNotificationModel telegramNotificationModel) {
        System.out.println("Telegram notification");
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.TELEGRAM;
    }
}
