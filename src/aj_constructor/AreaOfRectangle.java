package aj_constructor;

 class AreaOfRectangle {
    int length;
    int width;

    public AreaOfRectangle(int l, int w) {
        this.length = l;
        this.width = w;

    }

    public static void main(String[] args) {
        AreaOfRectangle a1= new AreaOfRectangle(5,3);
        System.out.println("Area of rectangle is "+a1.length*a1.width);

        AreaOfRectangle a2= new AreaOfRectangle(12,4);
        System.out.println("Area of rectangle is "+a2.length*a2.width);

    }
}
