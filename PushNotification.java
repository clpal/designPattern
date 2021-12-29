package designPattern.factory;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending Push notification");
    }
}
