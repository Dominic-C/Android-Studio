package PublisherSubscriber;

public class StockObserver implements Observer {

    private double ibmprice;
    private double appleprice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber)
    {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New observer: Observer id "+this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmprice, double appleprice, double googPrice) {
        this.ibmprice = ibmprice;
        this.appleprice = appleprice;
        this.googPrice = googPrice;

        printPrices(); // this prints the prices everytime the subject is updated
    }

    public void printPrices()
    {
        System.out.println(observerID + "\nIBM: " + ibmprice + "\nApple: " + appleprice + "\nGoogle: " + googPrice);
    }
}
