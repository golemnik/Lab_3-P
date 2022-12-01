package amount;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        return Objects.hash(intNumber, strNumber);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pieces pieces)) return false;
        return intNumber == pieces.intNumber && Objects.equals(strNumber, pieces.strNumber);
    }

    @Override
    public String toString() {
        return "Pieces{" +
                "intNumber=" + intNumber +
                ", strNumber='" + strNumber + '\'' +
                '}';
    }
}
