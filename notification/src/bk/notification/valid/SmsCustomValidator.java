package bk.notification.valid;

import bk.notification.model.SMSNotificationModel;

public class SmsCustomValidator extends SMSNotificationValidator{
    @Override
    public ValidationResult validate(SMSNotificationModel notificationModel) {
        return new ValidationResult(true);
    }
}
