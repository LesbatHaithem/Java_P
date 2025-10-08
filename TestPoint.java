public class TestPoint {
    public static void main(String[] args) {
        Point p1;
                Point p2 ,p3;

        p1=new Point(14.0,-14.5);
                p2=new Point(14.0,-14.5);
                p3=p2;

                System.out.println(p1==p2); // false
                 System.out.println(p3==p2); // true 
                  System.out.println(p1.equals(p2)); // true

            System.out.println(p1.toString()); // ici affiche le nom de la classe et l'adresse ou se trouve les objets 
                                               // (les points sont les objets dans ce cas) 
            System.out.println(p2.toString()); 
            p1.affiche();
            p1.translate(10.0, -10.0);

            Point3D p3d1= new Point3D(1.0,2.0,3.0);
            Point3D p3d2= new Point3D(4.0,5.0,6.0);
                p3d1.affiche();
                p3d1.milieu(p3d2).affiche();
                

        



                


    }
    
}
