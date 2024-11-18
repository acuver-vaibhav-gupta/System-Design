import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class App {
    public static void main(String[] args) throws Exception {
        StocksObservable ip = new IphoneObservableImpl();

        NotificationAlertObserver n1 = new EmailAlertObserverImpl("abc@gmail.com", ip);
        NotificationAlertObserver n2 = new MobileAlertObserverImpl("zyx@gmail.com", ip);
        NotificationAlertObserver n3 = new EmailAlertObserverImpl("asd@gmail.com", ip);

        ip.add(n1);
        ip.add(n2);
        ip.add(n3);

        ip.setStockCount(20);
    }
}
