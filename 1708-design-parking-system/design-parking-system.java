class ParkingSystem {

    int bigCounter;
    int mediumCounter;
    int smallCounter;
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        bigCounter = 0;
        mediumCounter = 0;
        smallCounter = 0;
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (bigCounter < big) {
                    bigCounter++;
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (mediumCounter < medium) {
                    mediumCounter++;
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (smallCounter < small) {
                    smallCounter++;
                    return true;
                } else {
                    return false;
                }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */