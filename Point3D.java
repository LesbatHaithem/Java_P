public class Point3D extends Point {
    private Double z ;
    
    public Point3D() {
    super();
    z = 0.0;
        }

public Point3D(Double x) {
        super(x);
        z = x;
    }

    public Point3D(Double x, Double y, Double z) {
        super(x, y);
        this.z = z;
    }
    public Point3D (Point3D p) {
        super(p.x, p.y);
        this.z =p.z;
    }
    void afficher () {
        System.out.println("x= "+ this.x + " y= "+ this.y + " z= "+ this.z);
    }

    
}
