class Triangle {
    int x,y,z;
    public Triangle(int a,int b,int c){
        x=a;
        y=b;
        z=c;
    }
/* Can also be defined by :
    public Triangle(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    */

    public int getLongestSide(){
        int MaxSize = Math.max(this.z,Math.max(this.x, this.y));
        return MaxSize;
    }

}

public class Main {

    public static void main(String[] args) {
	  Triangle testTriangle = new Triangle(5,7,9);
    int longestSide = testTriangle.getLongestSide();
    System.out.println("The longest side of the triangle is "+longestSide);
    }
}
