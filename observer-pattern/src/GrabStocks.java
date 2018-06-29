public class GrabStocks {
    public static void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.10);
        stockGrabber.setAplPrice(187.00);
        stockGrabber.setGoogPrice(198.02);
        StockObserver stockObserver2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(123.10);
        stockGrabber.setAplPrice(157.00);
        stockGrabber.setGoogPrice(168.02);
        StockObserver stockObserver3 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(147.10);
        stockGrabber.setAplPrice(167.00);
        stockGrabber.setGoogPrice(158.02);
        GetTheStock getAppleStock = new GetTheStock("APPLE",196,stockGrabber);
        GetTheStock getIBMStock = new GetTheStock("IBM",196,stockGrabber);
        GetTheStock getGooStock = new GetTheStock("GOOGLE",196,stockGrabber);
        new Thread(getAppleStock).start();
        new Thread(getIBMStock).start();
        new Thread(getGooStock).start();
    }
}
