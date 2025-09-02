/* 5) create abstract class Shape. declare "draw()" function as abstract. 
From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function. */
abstract class Shape {
    abstract void draw();
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle");
    }
}

class Polygon extends Shape {
    void draw() {
        System.out.println("Polygon");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}

class Fifth {
    public static void main(String[] args) {
        // Create an array of Shape
        Shape[] arr = new Shape[3];

        // Store child objects
        arr[0] = new Triangle();
        arr[1] = new Polygon();
        arr[2] = new Circle();

        // Call draw() for each
        for (int i = 0; i < arr.length; i++) {
            arr[i].draw(); 
        }
    }
}
