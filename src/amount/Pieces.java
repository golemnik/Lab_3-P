package amount;

public class Pieces implements Amount{
    int intNumber;
    String strNumber;

    public Pieces () {
        strNumber = "один";
    }
    public Pieces (int number) {
        switch (number){
            default:
                strNumber = "один";
                break;
            case 2:
                strNumber = "два";
                break;
            case 3:
                strNumber = "три";
                break;
        }
    }

    @Override
    public String amount () {
        return this.strNumber;
    }
}
