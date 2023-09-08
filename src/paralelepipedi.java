public class paralelepipedi extends geometria implements I3DFigure{

    private int length;
    public paralelepipedi(int width,int height, int length){
        super(height,width);
        this.length = length;
    }
    @Override
    public String toString(){
        return super.toString() + "; " + length;
    }
    @Override
    public double getArea(){
        return  super.getArea()*2+width*length*2+height*length*2;
    }
    @Override
    public double getPerimeter(){
        return 4*(width + height + length);
    }
    @Override
    public double getVolume(){
        return  super.getArea()*length;
    }
}
