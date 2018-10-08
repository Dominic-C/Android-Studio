package PublisherSubscriber;

public class Grabstock {
    public static void main(String[] args) {
        /*
        * create subject object, it will handle all the observers
        * */
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMprice(213);
        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setApplePrice(231);
        stockGrabber.setGooglePrice(600);
    }
}
