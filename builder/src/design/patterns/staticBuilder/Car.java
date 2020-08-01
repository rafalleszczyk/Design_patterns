package design.patterns.staticBuilder;

/** Builder
 * Concepts
 - Handle complex constructors
 - Large number of parameters
 - Immutability

 * Design
 - Flexibility over telescoping constructors
 - Static inner class
 - Calls appropriate constructor
 - Negates the need for exposed setters
 **/

public class Car {

    private final String engine;
    private final String tyres;
    private final String brakes;
    private final String accessories;

    public Car(Builder builder) {
        this.engine = builder.engine;
        this.tyres = builder.tyres;
        this.brakes = builder.brakes;
        this.accessories = builder.accessories;
    }

    public static class Builder {
        private String engine;
        private String tyres;
        private String brakes;
        private String accessories;

        public Builder() {

        }

        public Car build() {
            return new Car(this);
        }

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder tyres(String tyres) {
            this.tyres = tyres;
            return this;
        }

        public Builder brakes(String brakes) {
            this.brakes = brakes;
            return this;
        }

        public Builder accessories(String accessories) {
            this.accessories = accessories;
            return this;
        }
    }

    public String getEngine() {
        return engine;
    }

    public String getTyres() {
        return tyres;
    }

    public String getBrakes() {
        return brakes;
    }

    public String getAccessories() {
        return accessories;
    }
}
