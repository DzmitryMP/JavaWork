package bk.notification.sender;

import bk.notification.NotificationType;
import bk.notification.model.TelegramNotificationModel;

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
