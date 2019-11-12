package task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArgsParser {

    public Set<Arg> parse(String argStr) {
        Set<Arg> args = new HashSet<>();
        List<String> pairs = getPairs(argStr);
        for (String pair : pairs) {
            Arg arg = parseArg(pair);
            if (arg != null) {
                args.add(arg);
            }
        }
        return args;
    }

    private Arg parseArg(String pair) {
        List<String> op = splitAndTrim(pair, " ");
        if (op.size() == 0) {
            return null;
        }
        Set<String> params = new HashSet<>();
        if (op.get(1) != null) {
            List<String> pas = splitAndTrim(op.get(1), ",");
            params.addAll(pas);
        }
        return new Arg(op.get(0), params);
    }

    public List<String> getPairs(String argStr) {
        return splitAndTrim(argStr, "-");
    }

    public static List<String> splitAndTrim(String strToSplit, String regex) {
        String[] split = strToSplit.trim().split(regex);
        List<String> result = new ArrayList<>();
        for (String str : split) {
            if (str != null && !str.trim().isEmpty()) {
                result.add(str.trim());
            }
        }
        return result;
    }

}
