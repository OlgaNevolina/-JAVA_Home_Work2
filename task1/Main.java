package task1;

public class Main {

    private double x;
    private double y;
    private double z;
    
    public Main(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Main add(Main v) {
        return new Main(this.x + v.getX(), this.y + v.getY(), this.z + v.getZ());
    }
    
    public Main subtract(Main v) {
        return new Main(this.x - v.getX(), this.y - v.getY(), this.z - v.getZ());
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getZ() {
        return z;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public void setZ(double z) {
        this.z = z;
    }
    
    public Main multiply(double scalar) {
        return new Main(this.x * scalar, this.y * scalar, this.z * scalar);
    }
    
    public double dotProduct(Main v) {
        return this.x * v.getX() + this.y * v.getY() + this.z * v.getZ();
    }
    
    public Main crossProduct(Main v) {
        double newX = this.y * v.getZ() - this.z * v.getY();
        double newY = this.z * v.getX() - this.x * v.getZ();
        double newZ = this.x * v.getY() - this.y * v.getX();
        return new Main(newX, newY, newZ);
    }
    
    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    
    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}