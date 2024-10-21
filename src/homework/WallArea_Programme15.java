package homework;

public class WallArea_Programme15 {

    // instance variables
    private double width;
    private double height;

    // no - arg constructor
    public WallArea_Programme15(){
        this.width = 0;
        this.height =0;
    }
    // constructor with params
    public WallArea_Programme15(double width, double height){
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    // method to get width
    public double getWidth(){
        return width;
    }

    // method to het height
    public double getHeight(){
        return height;
    }

    // method to set width
    public void setWidth(double width){
        if (width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }

    }

    // method to set height
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    // method to calculate the area
    public double getArea() {
        return this.width * this.height;
    }

    // main method to test the class
    public static void main(String[] args) {
        WallArea_Programme15 wall = new WallArea_Programme15(5,4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height =" + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }
}
