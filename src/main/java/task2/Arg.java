package task2;

import java.util.Collections;
import java.util.Set;

public class Arg {
    private String option;
    private Set<String> params;

    public Arg(String option, Set<String> params) {
        this.option = option;
        this.params = Collections.unmodifiableSet(params);
    }

    public String getOption() {
        return option;
    }

    public Set<String> getParams() {
        return params;
    }

    @Override
    public int hashCode() {
        return option.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return option.equals(obj);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(option + " ");
        for (String param : params) {
            result.append(param);
        }
        return result.append("\n").toString();
    }
}
