package bk.notification.sender;

import bk.notification.NotificationType;
import bk.notification.model.SMSNotificationModel;
import bk.notification.valid.SMSNotificationValidator;
import bk.notification.valid.ValidateNotificationException;
import bk.notification.valid.ValidationResult;

public class NotificationSMSSender implements NotificationSender<SMSNotificationModel> {

    @Override
    public void send(SMSNotificationModel smsNotificationModel) {
        SMSNotificationValidator smsNotificationValidator = smsNotificationModel.getSmsNotificationValidator();

        ValidationResult validateResult = smsNotificationValidator.validate(smsNotificationModel);
        if (!validateResult.isValid()) {
            throw new ValidateNotificationException(validateResult.getErrorList());
        }
        System.out.println("От " + smsNotificationModel.getPhoneNumberSender() + " для " + smsNotificationModel.getPhoneNumberReceiver()
                + " сообщение " + smsNotificationModel.getMessage());

    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.SMS;
    }
}
