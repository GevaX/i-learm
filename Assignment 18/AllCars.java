public class AllCars {
    private Car[] cars;
    private int num;

    public AllCars(int max) {
        this.cars = new Car[max];
        this.num = 0;
    }

    public boolean addCar(Car car) {
        if (num < cars.length) {
            cars[num] = car;
            num++;
            return true;
        }
        return false;
    }

    public void print(int max, int min) {
        for (int i = 0; i < num; i++) {
            if (cars[i].range(min, max) && !cars[i].hadAccident()) {
                System.out.println(cars[i].getLicenseNum());
            }
        }
    }
}
