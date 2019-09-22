
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(this.getTotalPrice() - otherApartment.getTotalPrice());
    }
    
    public int getTotalPrice() {
        return this.squareMeters * this.pricePerSquareMeter;
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        return this.getTotalPrice() > otherApartment.getTotalPrice();
    }
}
