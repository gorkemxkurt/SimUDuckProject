public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void performFly(FlyBehavior flyBehavior) {
    flyBehavior.fly();
    }

    public void performQuack(QuackBehavior quackBehavior) {
    quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        quackBehavior.quack();
    }

    public void quack() {

    }

    public void swim() {

    }

    public abstract void display();




}

