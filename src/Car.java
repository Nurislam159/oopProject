class Car extends Vehicle {
    private String model;

    public Car(double size, double weight, double height, String model) {
        super(size, weight, height);
        this.model = model;
    }

    @Override
    public void toMove() {
        System.out.println("Car is driving on the road");
    }
}