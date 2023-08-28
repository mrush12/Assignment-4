class RegularPolygon {
    int n;
    double side;
    double x;
    double y;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        x = y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        return side * n;
    }

    double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }}

    And the
    RegularPolygonTest.java is:

class RegularPolygonTest
 {
     public static void main(String[] args)
      {
          RegularPolygon rp1 = new RegularPolygon();
          RegularPolygon rp2 = new RegularPolygon(6, 4);
          RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
          System.out.println("Area of rp1: " + rp1.getArea());
          System.out.println("Perimeter of rp1: " + rp1.getPerimeter());
          
          System.out.println("Area of rp2: " + rp2.getArea());
          System.out.println("Perimeter of rp2: " + rp2.getPerimeter());
          
          System.out.println("Area of rp3: " + rp3.getArea());
          System.out.println("Perimeter of rp3: " + rp3.getPerimeter());
      }
 }