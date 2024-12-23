package src.myproject.stringutil;

public class Point {

    private int x;
    private int y;

    public Point() {
        x=-1;
        y=-1;
    }

    public Point(int inputX, int inputY){
        x=inputX;
        y=inputY;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(int x, int y){
//        return Math.abs(this.x - x) + Math.abs(this.y - y);
        return Math.sqrt(Math.pow(this.x - x,2) + Math.pow((this.y - y),2));
    }

    public double distance(Point inputPoint){
//        return Math.abs(this.x - inputPoint.getX()) + Math.abs(y - inputPoint.getY());
        return distance(inputPoint.x,inputPoint.y);
    }

}
