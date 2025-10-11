package enums.colors;

public class ColorPalette {
    private Color[] colors_arr;
    public ColorPalette(Color[] Colors_arr_Input){
        this.colors_arr = Colors_arr_Input;
    }
    public Color getColorByName(String color_str){
        for(Color c : Color.values()){
            if(c.name() == color_str) return c;
        }
        return null;
    }
}
