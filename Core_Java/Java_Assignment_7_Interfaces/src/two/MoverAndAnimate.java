package two;

public class MoverAndAnimate implements Animatable {
    @Override
    public void move() {
        System.out.println("I Moved!");
    }

    @Override
    public void animate() {
        System.out.println("I'm Animated!");
    }
}
