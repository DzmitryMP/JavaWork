package bk.notification;

import bk.notification.factory.DefaultNotificationSenderFactory;
import bk.notification.model.EmailNotificationModel;
import bk.notification.model.NotificationModel;
import bk.notification.model.SMSNotificationModel;
import bk.notification.sender.NotificationSender;
import bk.notification.valid.SmsCustomValidator;

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


        SMSNotificationModel smsNotificationModel = new SMSNotificationModel.SMSNotificationModelBuilder()
                .phoneNumberReceiver("+37529837174")
                .phoneNumberSender("+3655555")
                .message("Вот так вот10000022222111122233335")
                .build();
        //smsNotificationModel.setSmsNotificationValidator(new SmsCustomValidator());
        notificationSender.send(smsNotificationModel);

    }
}
