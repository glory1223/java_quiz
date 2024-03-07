package ch13.Quiz02;

public class Container <A, B> {
    private A Kind;
    private B Model;

    public A getKind() {
        return Kind;
    }

    public void set(A kind, B Model) {
        this.Kind = Kind;
        this.Model = Model;
    }

    public B getModel() {
        return Model;
    }

}
