public boolean stoneGame(int[] piles) {
    int alice = 0;
    int bob = 0;

    int start = 0;
    int end = piles.length - 1;
    while (start < end) {
        alice = alice + piles[start];
        bob = bob + piles[end];
        start++;
        end--;
    }
    if (alice > bob) {
        return true;
    }
    start = 0;
    end = piles.length - 1;
    alice = 0;
    bob = 0;
    while (start < end) {
        bob = bob + piles[start];
        alice = alice + piles[end];
        start++;
        end--;
    }
    if (alice > bob) {
        return true;
    }
    return false;
}