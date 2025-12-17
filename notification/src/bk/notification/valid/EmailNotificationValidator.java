package bk.notification.valid;

import bk.notification.model.EmailNotificationModel;

public class EmailNotificationValidator implements NotificationValidator<EmailNotificationModel>  {
    @Override
    public ValidationResult validate(EmailNotificationModel notificationModel) {
        return new ValidationResult(true);
    }
}
