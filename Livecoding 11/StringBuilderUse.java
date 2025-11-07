import java.util.*;
class StringBuilderUse{
    static String concatanate(List<String> list){
        StringBuilder sb = new StringBuilder();
        //String badString = "";
        for(String s : list){
            //badString = badString + s;
            sb.append(s);
        }
        
        String newString = sb.toString();
        return newString;
        //return badString;
    }
}