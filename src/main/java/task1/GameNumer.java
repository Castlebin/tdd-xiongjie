package task1;

import static java.lang.String.valueOf;

public class GameNumer {
    private int rawNum;

    public GameNumer(int rawNum) {
        this.rawNum = rawNum;
    }

    @Override
    public String toString() {
        String result = "";
        if (isRelatedTo(3)) result += "Fizz";
        if (isRelatedTo(5)) result += "Buzz";
        return !"".equals(result) ? result : valueOf(rawNum);
    }

    private boolean isRelatedTo(int divider) {
        return rawNum % divider == 0 || valueOf(rawNum).contains(valueOf(divider));
    }

}
