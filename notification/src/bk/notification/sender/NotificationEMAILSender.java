package bk.notification.sender;

import bk.notification.NotificationType;
import bk.notification.model.EmailNotificationModel;

public class NotificationEMAILSender implements NotificationSender<EmailNotificationModel> {
    @Override
    public void send(EmailNotificationModel emailNotificationModel) {
        System.out.println("От " + emailNotificationModel.getEmailSender() + " для " + emailNotificationModel.getEmailReceiver()
                + " тема " + emailNotificationModel.getSubject() + " текст " + emailNotificationModel.getMessage());
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.EMAIL;
    }
}
