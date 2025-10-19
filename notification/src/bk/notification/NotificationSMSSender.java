package bk.notification;

public class NotificationSMSSender implements NotificationSender{

    @Override
    public void send() {
        System.out.println("SMS notification");
    }
}
