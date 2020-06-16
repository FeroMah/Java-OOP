package Encapsulation.Exercise.ClassBoxDataValidation_01.box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (isValid(length)) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
    }

    private void setWidth(double width) {
        if (isValid(width)) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
    }

    private void setHeight(double height) {
        if (isValid(height)) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
    }

    public double calculateLateralSurfaceArea () {
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateSurfaceArea() {
        return 2 * this.length * this.width +
                2 * this.length * this.height +
                2 * this.width * this.height;
    }

    public double calculateVolume() {
        return this.length * this.width * this.height;
    }

    private boolean isValid(double x) {
        return x > 0;
    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append(String.format("Surface Area - %.2f", calculateSurfaceArea()))
//                .append(String.format(System.lineSeparator()))
//                .append(String.format("Lateral Surface Area - %.2f", calculateLateralSurfaceArea()))
//                .append(String.format(System.lineSeparator()))
//                .append(String.format("Volume – %.2f", calculateVolume()));
//        return sb.toString();
//    }
}
