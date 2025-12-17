package bk.notification.valid;

import bk.notification.model.TelegramNotificationModel;

public class TelegramNotificationValidator implements NotificationValidator<TelegramNotificationModel> {
    @Override
    public ValidationResult validate(TelegramNotificationModel notificationModel) {
        return new ValidationResult(true);
    }
}
