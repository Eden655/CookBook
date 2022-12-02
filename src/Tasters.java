public class Tasters {

    private String TastersName;
    private int Marks;
    private int TotalAverage;

    public Tasters(String tastersName, int marks) {
        TastersName = tastersName;
        Marks = marks;
    }

    public Tasters(int marks) {
        Marks = marks;
    }

    public Tasters(String tastersName, int marks, int totalAverage) {
        TastersName = tastersName;
        Marks = marks;
        TotalAverage = totalAverage;
    }
    public Tasters(String tastersName) {
        TastersName = tastersName;
    }

    public String getTastersName() {return TastersName;}
    public void setTastersName(String tastersName) {TastersName = tastersName;}
    public int getMarks() {return Marks;}
    public void setMarks(int marks) {Marks = marks;}
    public int getTotalAverage() {return TotalAverage;}
    public void setTotalAverage(int totalAverage) {TotalAverage = totalAverage;}
}
