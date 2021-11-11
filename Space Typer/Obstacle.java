public interface Obstacle {
    void act();
    void removeLabel();
    String getValue();
    void explode();
    int getX();
    int getY();
}
