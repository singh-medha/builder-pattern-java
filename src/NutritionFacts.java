public class NutritionFacts {
    /*
    Capture Nutrition Facts of a dish
    i.e., serving size, servings, calories, fat, sodium, carbs
    using Builder Pattern
     */

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        //Required Parameters
        private final int servingSize;
        private final int servings;

        //Optional Parameters
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            validityCheck("serving size", servingSize);
            validityCheck("servings", servings);

            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            validityCheck("calories", val);

            calories = val;
            return this;
        }

        public Builder fat(int val) {
            validityCheck("fat", val);

            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            validityCheck("sodium", val);

            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            validityCheck("carbohydrate", val);

            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

        private static void validityCheck(String field, int val) {
            if(val < 0) {
                throw new IllegalArgumentException("Value of " + field + " cannot be less than zero");
            }
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        fat = builder.fat;
        calories = builder.calories;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public int getCalories() {
        return this.calories;
    }
}
