package Point;

import Point.point2D;

public class point3D extends point2D {
    float z = 0.0f;

    public point3D() {
    }

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] a = new float[3];
        a[0] = super.getX();
        a[1] = super.getY();
        a[2] = this.z;
        return a;
    }

    @Override
    public String toString() {
        return "This point has coordinates: "+getXYZ()[0]+ ", " +getXYZ()[1]+ ", " +getXYZ()[2];
    }
}
