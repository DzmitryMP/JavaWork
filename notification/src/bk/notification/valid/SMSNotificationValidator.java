package bk.notification.valid;

import bk.notification.model.SMSNotificationModel;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SMSNotificationValidator implements NotificationValidator<SMSNotificationModel> {

    public static final String PHONE_REGEX_BY = "\\+375\\d{9}$";
    public static final int MESSAGE_LENGTH = 10;

    @Override
    public ValidationResult validate(SMSNotificationModel notificationModel) {
        String phoneNumberReceiver = notificationModel.getPhoneNumberReceiver();
        Pattern pattern = Pattern.compile(PHONE_REGEX_BY);
        Matcher matcher = pattern.matcher(phoneNumberReceiver);
        String message = notificationModel.getMessage();
        int length = message.length();
        List<String> errorList = new ArrayList<>();
        if (!matcher.find()) {
            errorList.add("Номер телефона должен быть Беларуским");
        }
        if (length > MESSAGE_LENGTH) {
            errorList.add("Длинна сообщения должно быть не более " + MESSAGE_LENGTH + " символов");
        }
        if (!errorList.isEmpty()) {
            return new ValidationResult(false, errorList);
        }
        return new ValidationResult(true);

    }
}
