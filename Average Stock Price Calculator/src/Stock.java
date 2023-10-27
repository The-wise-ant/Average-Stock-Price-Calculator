/**
 * The Stock class represents a simple model of a stock investment. 
 * It keeps track of the number of shares owned, their purchase price, and the capital invested.
 */
public class Stock {

    // Private instance variables to store the state of the Stock
    private int shares;     // Number of shares owned
    private double price;   // The price of each share
    private double capital; // Total capital invested

    /**
     * Buy a specified number of shares at a given price.
     * This method increases the number of shares and updates the capital.
     *
     * @param p The purchase price of each share.
     * @param s The number of shares to buy.
     */
    public void buy(double p, int s) {
        shares += s;
        price = p;
        capital += s * p;
    }

    /**
     * Sell a specified number of shares at a given price.
     * This method decreases the number of shares and updates the capital.
     *
     * @param p The selling price of each share.
     * @param s The number of shares to sell.
     */
    public void sell(double p, int s) {
        shares -= s;
        price = p;
        capital -= s * p;
    }

    /**
     * Get the current number of shares owned.
     *
     * @return The number of shares.
     */
    public int getShares() {
        return this.shares;
    }

    /**
     * Get the current price of each share.
     *
     * @return The price of each share.
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Calculate and return the average price of shares owned.
     *
     * @return The average price of shares owned, which is the total capital invested divided by the number of shares.
     */
    public double getAveragePrice() {
        // The average price is calculated by dividing the total capital by the number of shares owned.
        return capital / shares;
    }
}
