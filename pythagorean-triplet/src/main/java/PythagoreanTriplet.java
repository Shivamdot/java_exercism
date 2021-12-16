public class PythagoreanTriplet {

    private final int a;
    private final int b;
    private final int c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object obj) {
        PythagoreanTriplet pt = (PythagoreanTriplet) obj;
        if(this.a == pt.a && this.b == pt.b && this.c == pt.c) {
            return true;
        } else {
            return false;
        }
    }

    public static PythagoreanTripletMaker makeTripletsList() {
        return new PythagoreanTripletMaker();
    }
}
