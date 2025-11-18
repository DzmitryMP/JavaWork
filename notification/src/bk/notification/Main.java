package bk.notification;

public class Main {
    public static void main(String[] args) {
        String notificationTypeStr = "SMS";
        NotificationType notificationType = NotificationType.valueOf(notificationTypeStr);
        NotificationSender notificationSender = new NotificationResolver(new DefaultNotificationSenderFactory())
                .resolve(notificationType);
        NotificationModel notificationModel = new EmailNotificationModel.EmailNotificationModelBuilder()
                .emailReceiver("Dims@gmail.com")
                .emailSender("Oleg@gmail.com")
                .subject("Test")
                .message("Test2")
                .build();


        NotificationModel smsNotificationModel = new SMSNotificationModel.SMSNotificationModelBuilder()
                .phoneNumberReceiver("+3121515")
                .phoneNumberSender("+3655555")
                .message("Вот так вот")
                .build();

        notificationSender.send(smsNotificationModel);

    }
}
