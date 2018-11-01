public class Circle implements Resizeable{
    private double radius;
    Circle(){
    }

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void resize(double percent) {
        this.radius*=percent;
    }

    double area(){
        return radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius: "+this.radius + ", and area: "+area();
    }
}
