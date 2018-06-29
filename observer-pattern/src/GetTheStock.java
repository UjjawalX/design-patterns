import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
    private String stock;
    private double price;
    private Subject stockGrabber;

    public GetTheStock(String stock, double price, Subject stockGrabber) {
        this.stock = stock;
        this.price = price;
        this.stockGrabber = stockGrabber;
    }

    public void run(){
        for(int i=1; i<=20; i++){
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){

            }
            // Generates a random number between -.03 and .03
            double randNum = (Math.random()*(.06)) - 0.03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format((price + randNum)));
            System.out.println("Using threads");
            if(stock.equals("IBM"))
                ((StockGrabber)stockGrabber).setIbmPrice(price);
            if(stock.equals("APPLE"))
                ((StockGrabber)stockGrabber).setAplPrice(price);
            if(stock.equals("GOOGLE"))
                ((StockGrabber)stockGrabber).setGoogPrice(price);
            System.out.println("The value of :"+stock + ":" + df.format(price)+ " -- " + df.format(randNum) + "\n");
        }
    }

}
