import java.util.regex.*;
class User{
    //Examples of regex use
    String email;
    String name;
    String initials;
    
    public User(String email, String name){
        Pattern namePattern = Pattern.compile("[A-Z][a-z]* [A-Z][a-z]*");
        if(namePattern.matcher(name).matches()){
            this.name = name;
        } else{
            throw new IllegalArgumentException("That is no name!");
        }
        Pattern emailPattern = Pattern.compile("([a-z0-9]+)@[a-z]+.[a-z]+");
        Matcher initMatch = emailPattern.matcher(email);
        if (initMatch.find()) {
            this.initials = initMatch.group(1);
            this.email = email;
        } else{
            throw new IllegalArgumentException("That is not an accepted email!");
        }
    }
    
    
} // if(emailPattern.matcher(email).matches()){