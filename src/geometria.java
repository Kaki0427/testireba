public class geometria implements IFigure{
    protected int height;
    protected int width;

    public geometria(int height,int width){

        this.height = height;
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth() {
        return width;
    }
    @Override
    public String toString(){
        return width + "; " + height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2*(height+width);
    }
}
