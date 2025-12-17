package bk.notification.model;

import bk.notification.valid.SMSNotificationValidator;

public class SMSNotificationModel implements NotificationModel {
    private String phoneNumberSender;
    private String phoneNumberReceiver;
    private String message;
    private SMSNotificationValidator smsNotificationValidator = new SMSNotificationValidator();

    private SMSNotificationModel() {
    }

    public String getPhoneNumberSender() {
        return phoneNumberSender;
    }

    public String getPhoneNumberReceiver() {
        return phoneNumberReceiver;
    }

    @Override
    public String getMessage() {
        return message;
    }

    private void setPhoneNumberSender(String phoneNumberSender) {
        this.phoneNumberSender = phoneNumberSender;
    }

    private void setPhoneNumberReceiver(String phoneNumberReceiver) {
        this.phoneNumberReceiver = phoneNumberReceiver;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public SMSNotificationValidator getSmsNotificationValidator() {
        return smsNotificationValidator;
    }

    public void setSmsNotificationValidator(SMSNotificationValidator smsNotificationValidator) {
        this.smsNotificationValidator = smsNotificationValidator;
    }

    public static class SMSNotificationModelBuilder {
        private String phoneNumberSender;
        private String phoneNumberReceiver;
        private String message;

        public SMSNotificationModelBuilder phoneNumberSender(String phoneNumberSender) {
            this.phoneNumberSender = phoneNumberSender;
            return this;
        }

        public SMSNotificationModelBuilder phoneNumberReceiver(String phoneNumberReceiver) {
            this.phoneNumberReceiver = phoneNumberReceiver;
            return this;
        }

        public SMSNotificationModelBuilder message(String message) {
            this.message = message;
            return this;
        }

        public SMSNotificationModel build (){
            SMSNotificationModel smsNotificationModel = new SMSNotificationModel();
            smsNotificationModel.setMessage(message);
            smsNotificationModel.setPhoneNumberReceiver(phoneNumberReceiver);
            smsNotificationModel.setPhoneNumberSender(phoneNumberSender);
            return smsNotificationModel;

        }
    }
    }


