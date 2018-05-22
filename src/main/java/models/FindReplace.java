package models;

import java.util.List;
import java.util.ArrayList;

public class FindReplace {

    public FindReplace(){

    }

    public String replace(String originalString, String target, String replacement) {
        String lowerOriginalString = originalString.toLowerCase();
        String lowerTarget = target.toLowerCase();
        String lowerReplacement = replacement.toLowerCase();
        return lowerOriginalString.replace(lowerTarget, lowerReplacement);
    }


}
