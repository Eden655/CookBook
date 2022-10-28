public class Tasters {

    private String TastersName;
    private int Rating;

    public Tasters(String tastersName, int rating) {
        TastersName = tastersName;
        Rating = rating;
    }

    public Tasters(String tastersName) {
        TastersName = tastersName;
    }

    public String getTastersName() {return TastersName;}
    public void setTastersName(String tastersName) {TastersName = tastersName;}

    public int getRating() {return Rating;}
    public void setRating(int rating) {Rating = rating;}
}
