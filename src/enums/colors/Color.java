package enums.colors;

public enum Color {  //חשבתי בהתחלה שאין טעם להשתמש פה ב-enum אז GPT עזר לי להבין איך ליצור את ההצהרה הזאת נכון:
    RED(new int[]{255, 0, 0}),
    GREEN(new int[]{0, 255, 0}),
    BLUE(new int[]{0, 0, 255}),
    WHITE(new int[]{255, 255, 255}),
    BLACK(new int[]{0, 0, 0});

    private final int[] rgb;

    Color(int[] rgb) {
        this.rgb = rgb;
    }

    public int[] getRGB() {
        return rgb;
    }
}
