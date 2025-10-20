package bk.notification;

public class NotificationEMAILSender implements NotificationSender{
    @Override
    public void send() {
        System.out.println("EMAIL notification");
    }
}
