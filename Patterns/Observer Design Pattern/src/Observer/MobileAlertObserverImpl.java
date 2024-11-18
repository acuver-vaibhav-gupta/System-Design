package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable){
        this.observable = observable;
        this.userName = emailId;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is in stock");
    }

    private void sendMsgOnMobile(String userName, String msg){
        System.out.println("Msg sent to : " + userName);
    }

    
}
