package bk.notification;

import java.io.InputStream;

public class TelegramNotificationModel implements NotificationModel {
    private final String senderId;
    private final String receiverId;
    private final String message;
    private InputStream file;
    private String sticker;

    public TelegramNotificationModel(String senderId, String receiverId, String message) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.message = message;
    }

    public void setFile(InputStream file) {
        this.file = file;
    }

    public void setSticker(String sticker) {
        this.sticker = sticker;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public InputStream getFile() {
        return file;
    }

    public String getSticker() {
        return sticker;
    }
}
