package web.model;


public class Car {


    private String body; //Hatchback, Liftback, Limousine, Crossover

    private String model;

    private boolean hasMotor;

    public Car() {
    }

    public Car(String body, String model, boolean hasMotor) {
        this.body = body;
        this.model = model;
        this.hasMotor = hasMotor;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHasMotor() {
        return hasMotor;
    }

    public void setHasMotor(boolean hasMotor) {
        this.hasMotor = hasMotor;
    }
}
