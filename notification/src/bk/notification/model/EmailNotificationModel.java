package bk.notification.model;

import java.io.InputStream;

public class EmailNotificationModel implements NotificationModel {
    private  String emailReceiver;
    private  String emailSender;
    private  String message;
    private  String subject;
    private InputStream file;

    private EmailNotificationModel() {
    }

    public String getEmailReceiver() {
        return emailReceiver;
    }

    public String getEmailSender() {
        return emailSender;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getSubject() {
        return subject;
    }

    public InputStream getFile() {
        return file;
    }

    private void setFile(InputStream file) {
        this.file = file;
    }

    private void setEmailReceiver(String emailReceiver) {
        this.emailReceiver = emailReceiver;
    }

    private void setEmailSender(String emailSender) {
        this.emailSender = emailSender;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    private void setSubject(String subject) {
        this.subject = subject;
    }

    public static class EmailNotificationModelBuilder {
        private String emailReceiver;
        private String emailSender;
        private String message;
        private String subject;
        private InputStream file;

        public EmailNotificationModelBuilder() {
        }

        public EmailNotificationModelBuilder emailReceiver(String emailReceiver) {
            this.emailReceiver = emailReceiver;
            return this;
        }

        public EmailNotificationModelBuilder emailSender(String emailSender) {
            this.emailSender = emailSender;
            return this;
        }

        public EmailNotificationModelBuilder message(String message) {
            this.message = message;
            return this;
        }

        public EmailNotificationModelBuilder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailNotificationModelBuilder file(InputStream file) {
            this.file = file;
            return this;
        }

        public EmailNotificationModel build (){
            EmailNotificationModel emailNotificationModel = new EmailNotificationModel();
            emailNotificationModel.setEmailReceiver(emailReceiver);
            emailNotificationModel.setEmailSender(emailSender);
            emailNotificationModel.setMessage(message);
            emailNotificationModel.setSubject(subject);
            emailNotificationModel.setFile(file);
            return emailNotificationModel;
        }

    }
}
