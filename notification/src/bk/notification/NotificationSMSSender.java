package bk.notification;

public class NotificationSMSSender implements NotificationSender<SMSNotificationModel> {

    @Override
    public void send(SMSNotificationModel smsNotificationModel) {
        System.out.println("От " + smsNotificationModel.getPhoneNumberSender() + " для " + smsNotificationModel.getPhoneNumberReceiver()
                + " сообщение " + smsNotificationModel.getMessage());
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.SMS;
    }
}
