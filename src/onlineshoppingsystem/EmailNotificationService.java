package onlineshoppingsystem;

public class EmailNotificationService implements NotificationService{

    @Override
    public void notificationService(User user) {
        sendEmail(user);
    }

    private void sendEmail(User user){
        System.out.println(user);
    }
}
