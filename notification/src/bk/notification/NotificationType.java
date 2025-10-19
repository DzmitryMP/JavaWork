package bk.notification;

import java.util.Map;
import java.util.Objects;

public enum NotificationType {
    SMS {
        @Override
        void send(Map<Object,Object> parametrMap) {
            System.out.println("SMS");
        }
    },
    TELEGRAM {
        @Override
        void send(Map<Object,Object> parametrMap) {
            System.out.println("TELEGRAM");
        }
    },
    EMAIL {
        @Override
        void send(Map<Object,Object> parametrMap) {
            System.out.println("EMAIL");
        }
    };

    abstract void send(Map<Object,Object> parametrMap);
}
