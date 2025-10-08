public class Point {

private  Double x ; 
private  Double y ;

public Point(){
    this.x =0.0;
    this.y=0.0 ;

}


public Point(Double x, Double y) {
    super(); // pour appeler le constructeur de la classe mere 
    this.x = x;
    this.y = y;
}


public Point(Double x) {
    super();
    this.x = x;
}



public Point (Point p) {
    super ();
    this.x = p.x ;
    this.y = p.y ;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Point other = (Point) obj;
    if (x == null) {
        if (other.x != null)
            return false;
    } else if (!x.equals(other.x))
        return false;
    if (y == null) {
        if (other.y != null)
            return false;
    } else if (!y.equals(other.y))
        return false;
    return true;
}
// comparison des objets with equals (ce methode j'ai ajouter avec source actions et je dois verifier la logic apres)
// l'operateur d'egalite compare les addresses 
// si nous qui difiner equals () comment ca marche

public void translate (Double dx , Double dy){
    this.x= this.x+dx ;
        this.y= this.y+dy ;
        System.out.println("("+this.x+","+this.y+")");


}
public void affiche(){
    System.out.println("("+this.x+","+this.y+")");
}
public static Double distance(Point p1 ,Point p2){
    Double r = Math.sqrt((Math.pow(p2.x-p1.x,2)) +(Math.pow(p2.y-p1.y,2)));    
    return r; 
}

public static Point milieu (Point p1 ,Point p2){
    Point r = new Point((p1.x+p2.x)/2 ,(p1.y+p2.y)/2  ) ;
    return r ;

}

}
