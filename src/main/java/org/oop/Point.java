package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static double distance(Point from, Point to) {
        double xDistance = to.x - from.x;
        double yDistance = to.y - from.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(Point from, Point to) {
        double xDistance = to.x - from.x;
        double yDistance = to.y - from.y;
        return Math.atan2(yDistance, xDistance);
    }
}
