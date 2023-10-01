package Task3;

public class Task3 {
    public static void main(String[] args) {

        System.out.println(validateEmail("v[icsi@ukr.net"));

    }

    private static boolean validateEmail(final String email){

        //String forbiddenSymbols = "!#$%^&*()+=;:[]<> ";

        String [] parts = email.split("@");
        String username = parts[0];
        String domain = parts[1];

        if(parts.length != 2){
            return false;
        }

        if(username.length() == 0 || domain.length() == 0){
            return false;
        }


        if(!domain.contains(".")){
            return false;
        }

        if(username.startsWith(".") || username.endsWith(".") ||
                domain.startsWith(".") || domain.endsWith(".")){
            return false;
        }

        String forbiddenSymbols = "!#$%^&*()+=;:[]<> ";
        for (char c : forbiddenSymbols.toCharArray()) {
            if (username.indexOf(c) != -1 || domain.indexOf(c) != -1) {
                return false;
            }
        }

        return true;
    }
}
