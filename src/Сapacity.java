public enum Сapacity {
    ESPECIALLY_SMALL (0,10),
    SMALL (0,25),
    AVERAGE(40,50),
    BIG(60,80),
    EXTRA_LARGE(100,120);

    private  final int from;

    private final int to;

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    Сapacity(int from, int to) {
        this.from = from;
        this.to = to;

    }
}
