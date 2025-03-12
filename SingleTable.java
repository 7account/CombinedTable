public class SingleTable {
    private int seats;
    private int height;
    private double viewQuality;
    
    public SingleTable(int s, double v, int h) {
        seats = s;
        viewQuality = v;
        height = h;
    }

    public int getNumSeats() {
        return seats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        viewQuality = value;
    }
}