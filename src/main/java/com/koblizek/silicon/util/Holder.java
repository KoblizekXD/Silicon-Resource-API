package com.koblizek.silicon.util;

@Deprecated(forRemoval = true, since = "1.0")
public final class Holder<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
