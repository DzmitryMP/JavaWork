package bk.notification.factory;

import bk.notification.sender.NotificationSender;

import java.util.List;

public interface NotificationSenderFactory {

    List<NotificationSender> getNotificationSenderList();


}
