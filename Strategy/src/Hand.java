public enum Hand {
    ROCK("rock",0),
    SCISSORS("sci", 1),
    PAPER("pap", 2);

    private String name;
    private int handValue;
    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    private Hand(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand h) {return fight(h)==1;}
    public boolean isWeakerThan(Hand h) {return fight(h)==-1;}

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            System.out.println(this);
            System.out.println(h);
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
