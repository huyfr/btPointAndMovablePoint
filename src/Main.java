public class Main {
    public static void main(String[] args) {
        try {
            Point point =new Point(4.3f,10.10f);
            System.out.println("Point: "+point.toString());

            MovablePoint movablePoint = new MovablePoint(5.5f, 6.6f, 3.2f, 1.2f);
            System.out.println("Movable point before: "+movablePoint.toString());
            movablePoint.move();
            System.out.println("Movable point after: "+movablePoint.toString());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }
}
