package enums.colors;

public enum Color {  //מה הטעם בכלל להשתמש ב-enum בתרגיל כזה, גם ככה זה פשוט להעתיק מ-GPT כי זאת לא דרך רגילה להשתמש ב-enums..
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
