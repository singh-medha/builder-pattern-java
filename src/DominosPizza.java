import java.util.Objects;

public class DominosPizza extends Pizza {
    public enum Size {REGULAR, MEDIUM, LARGE};
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override public DominosPizza build() {
            return new DominosPizza(this);
        }

        @Override protected Builder self() {
            return this;
        }
    }

    private DominosPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
