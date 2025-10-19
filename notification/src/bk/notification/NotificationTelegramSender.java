package bk.notification;

public class NotificationTelegramSender implements NotificationSender{
    @Override
    public void send() {
        System.out.println("Telegram notification");
    }
}
