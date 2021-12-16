import java.util.LinkedList;
import java.util.List;

public class PythagoreanTripletMaker {

    private int upperLimit;
    private int sum;

    public PythagoreanTripletMaker() {
        this.upperLimit = 0;
        this.sum = 0;
    }

    public PythagoreanTripletMaker withFactorsLessThanOrEqualTo(int n) {
        this.upperLimit = n;
        return this;
    }

    public PythagoreanTripletMaker thatSumTo(int n) {
        this.sum = n;
        return this;
    }

    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> tripletList = new LinkedList<>();
        for(int i=1; i<=this.upperLimit-2; i++) {
            for(int j=i+1; j<=this.upperLimit-1; j++) {
                double k = Math.sqrt(i*i+j*j);
                if(k > j && i+j+k == this.sum) {
                    System.out.println("==================> " + i + " " + j + " " + k + " sum: " + this.sum + " | " + i+j+k);
                    tripletList.add(new PythagoreanTriplet(i, j, (int)k));
                }
            }
        }
        return tripletList;
    }
}
