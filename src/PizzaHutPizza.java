import java.util.Objects;

public class PizzaHutPizza extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;


        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override public PizzaHutPizza build() {
            return new PizzaHutPizza(this);
        }

        @Override protected Builder self() {
            return this;
        }
    }

    private PizzaHutPizza(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
