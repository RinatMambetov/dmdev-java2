package com.rinat.hw18;

public final class PairUtil<K, V> {
    private PairUtil() {
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        K first = pair.getFirst();
        V second = pair.getSecond();
        return new Pair<>(second, first);
    }
}
