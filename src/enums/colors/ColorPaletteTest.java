package enums.colors;

import java.util.Arrays;

public class ColorPaletteTest {
    Color[] colors_arr = Color.values();
    ColorPalette palette1;
    public ColorPaletteTest(){
        this.palette1 = new ColorPalette(colors_arr);
        for(int i = 0 ; i < colors_arr.length ; i++){
            System.out.println(colors_arr[i] + ": " + Arrays.toString(palette1.getColorByName(colors_arr[i].name()).getRGB()));
        }
    }
}
