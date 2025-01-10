// TIMOTHY BERNARDO
// 1/10/25
// FUNDIES 2

package org.example;

public class Vector3D {

    // QUESTION 1
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // QUESTION 2
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // QUESTION 3
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    // QUESTION 4
    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    // QUESTION 5
    public Vector3D normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0) {
            throw new IllegalStateException("Operation cannot be completed");
        }
        return new Vector3D(x / magnitude, y / magnitude, z / magnitude);
    }

    // QUESTION 6
    public Vector3D add(Vector3D vector) {
        return new Vector3D(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    // QUESTION 7
    public Vector3D multiply(double constant) {
        return new Vector3D(this.x * constant, this.y * constant, this.z * constant);
    }

    // QUESTION 8
    public double dotProduct(Vector3D vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

}
