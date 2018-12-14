package ru.bodrov.interview.lesson1.task3;

abstract class Figure {

    private String colorBorder;
    private String colorBackground;
    private int widthLine;

    abstract void draw();

    protected void delete(){
        System.out.println("The figure has deleted");
    }

    public String getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(String colorBorder) {
        this.colorBorder = colorBorder;
    }

    public String getColorBackground() {
        return colorBackground;
    }

    public void setColorBackground(String colorBackground) {
        this.colorBackground = colorBackground;
    }

    public int getWidthLine() {
        return widthLine;
    }

    public void setWidthLine(int widthLine) {
        this.widthLine = widthLine;
    }
}
