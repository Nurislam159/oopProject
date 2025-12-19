class Truck extends Vehicle {
    private String workPurpose;

    public Truck(double size, double weight, double height, String workPurpose) {
        super(size, weight, height);
        this.workPurpose = workPurpose;
    }

    @Override
    public void toMove() {
        System.out.println("Truck is carrying cargo");
    }
}