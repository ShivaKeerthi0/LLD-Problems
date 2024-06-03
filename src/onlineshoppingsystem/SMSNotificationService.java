package onlineshoppingsystem;

public class SMSNotificationService implements NotificationService{
    public void notificationService(User user) {
        sendSMS(user);
    }

    private void sendSMS(User user){
        System.out.println(user);
    }
}
