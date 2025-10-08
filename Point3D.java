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
 @Override
   public void affiche() {
        System.out.println("x= "+ this.x + " y= "+ this.y + " z= "+ this.z);
    }

   public Point3D milieu(Point3D other){
    Point3D p=
    new Point3D((this.x+other.x)/2, (this.y+other.y)/2, (this.z+other.z)/2);
    return p;
   } 
    

    
}
