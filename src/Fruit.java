public class Fruit extends Food{
    private boolean isReadyToEat = true;
    Fruit(){}
    public boolean getIsReadyToEat() {
        return isReadyToEat;
    }

    public void setReadyToEat(boolean readyToEat) {
        isReadyToEat = readyToEat;
    }
}
