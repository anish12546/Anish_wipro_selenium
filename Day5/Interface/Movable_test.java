package assignment_5;
//Q2


//1. Define the Movable interface
interface Movable {
 void moveUp();
 void moveDown();
 void moveLeft();
 void moveRight();
}

//2. MovablePoint class
class MovablePoint implements Movable {
 int x, y;
 int xSpeed, ySpeed;

 public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
     this.x = x;
     this.y = y;
     this.xSpeed = xSpeed;
     this.ySpeed = ySpeed;
 }


 public void moveUp() {
     y -= ySpeed;
 }


 public void moveDown() {
     y += ySpeed;
 }

 
 public void moveLeft() {
     x -= xSpeed;
 }

 
 public void moveRight() {
     x += xSpeed;
 }

 
 public String toString() {
     return "(" + x + "," + y + ")";
 }
}

//3. MovableCircle class
class MovableCircle implements Movable {
 private int radius;
 private MovablePoint center;

 public MovableCircle(int radius, MovablePoint center) {
     this.radius = radius;
     this.center = center;
 }

 
 public void moveUp() {
     center.moveUp();
 }

 
 public void moveDown() {
     center.moveDown();
 }

 
 public void moveLeft() {
     center.moveLeft();
 }

 
 public void moveRight() {
     center.moveRight();
 }


 public String toString() {
     return "MovableCircle [radius=" + radius + ", center=" + center + "]";
 }
}

//4. MovableRectangle class
class MovableRectangle implements Movable {
 private MovablePoint topLeft;
 private MovablePoint bottomRight;

 public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
     // Ensure both points have same speed
     if (topLeft.xSpeed != bottomRight.xSpeed || topLeft.ySpeed != bottomRight.ySpeed) {
         throw new IllegalArgumentException("Points must have same speed");
     }
     this.topLeft = topLeft;
     this.bottomRight = bottomRight;
 }

 @Override
 public void moveUp() {
     topLeft.moveUp();
     bottomRight.moveUp();
 }

 @Override
 public void moveDown() {
     topLeft.moveDown();
     bottomRight.moveDown();
 }

 @Override
 public void moveLeft() {
     topLeft.moveLeft();
     bottomRight.moveLeft();
 }

 @Override
 public void moveRight() {
     topLeft.moveRight();
     bottomRight.moveRight();
 }

 @Override
 public String toString() {
     return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
 }
}

//5. Main class to test
public class Movable_test {
 public static void main(String[] args) {
     MovablePoint p1 = new MovablePoint(0, 0, 2, 3);
     MovablePoint p2 = new MovablePoint(4, 5, 2, 3);
     MovableCircle circle = new MovableCircle(5, new MovablePoint(10, 10, 1, 1));
     MovableRectangle rectangle = new MovableRectangle(p1, p2);

     System.out.println("Initial positions:");
     System.out.println(circle);
     System.out.println(rectangle);

     // Move shapes
     circle.moveUp();
     rectangle.moveRight();

     System.out.println("\nAfter moving circle up and rectangle right:");
     System.out.println(circle);
     System.out.println(rectangle);

     // Move shapes again
     circle.moveLeft();
     rectangle.moveDown();

     System.out.println("\nAfter moving circle left and rectangle down:");
     System.out.println(circle);
     System.out.println(rectangle);
 }
}


