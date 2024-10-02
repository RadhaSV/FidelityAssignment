package small.example;

    class Area {

        public void calculateArea(double sideLength) {
            double area = sideLength * sideLength;
            System.out.println("Area of the square: " + area);
        }

        public void calculateArea(double length, double width) {
            double area = length * width;
            System.out.println("Area of the rectangle: " + area);
        }

        public void calculateArea(float radius) {
            double area = Math.PI * radius * radius;
            System.out.println("Area of the circle: " + area);
        }
    }

    class AreaCalculator{
        public static void main(String[] args) {
            Area calculator = new Area();
            calculator.calculateArea(5.0);
            calculator.calculateArea(4.0, 6.0);
            calculator.calculateArea(3.0);
        }
    }

