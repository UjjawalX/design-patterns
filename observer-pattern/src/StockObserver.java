public class StockObserver implements Observer {
    private double ibmPrice;
    private double applPrice;
    private double googPrice;
    private Subject stockGrabber;
    private int observerId;
    private static int observerIdTracker = 0;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        System.out.println("New Observer: " + this.observerId);
        stockGrabber.register(this);
    }

    /**
     * overrides the update method
     *
     * @param ibmPrice
     * @param applPrice
     * @param googPrice
     */
    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.applPrice = applPrice;
        this.googPrice = googPrice;
        printThePrices();
    }

    private void printThePrices() {
        System.out.println("ObserverId:" + observerId
                + "\nibm:" + ibmPrice + "\napple :" + applPrice + "\n google :" + googPrice);
    }


}
