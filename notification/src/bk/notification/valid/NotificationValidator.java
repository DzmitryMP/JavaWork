package bk.notification.valid;

import bk.notification.model.NotificationModel;

public interface NotificationValidator  <T extends NotificationModel> {

   ValidationResult validate(T notificationModel);
}
