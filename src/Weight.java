public enum Weight {
    E_SMALL(0, 10),SMALL( 10,25 ),AVERAGE( 40, 50 ),LARGE( 60, 80),BIG( 100, 120);
private final  int from;
private final int to;

    Weight(int from, int to) {
        this.from = from;
        this.to = to;
    }
}

