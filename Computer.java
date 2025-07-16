public class Computer extends TangibleAsset {
    private String maker;

    Public Computer (String name, int price, String color, String maker) {
        super(name, price, color);
	this.maker = maker;
    }
    public String getMaker() {
    }
}

