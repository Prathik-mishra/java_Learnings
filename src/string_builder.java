public class string_builder {
    public static void main(String[] args) {
        //***StringBuilder are mutable***//"imp"
        StringBuilder sb = new StringBuilder();
        // This adds the char at end of the string:
        sb.append("prathik");
        sb.append('o');
        sb.append('p');
        System.out.println(sb);

        //for knowing the length of a String:
        int n = sb.length();
        System.out.println(n);

        //to know/get the char at given index:
        System.out.println(sb.charAt(2));

        //to insert a char at particular index we use insert method:
        sb.insert(2,'a');
        System.out.println(sb);

        //setCharAt sets/changes the char at a given index with given char:
        sb.setCharAt(3,'d');
        System.out.println(sb);

        //deleteCharAt helps in deleting the char at given index:
        sb.deleteCharAt(0);
        System.out.println(sb);
        //the range goes from starting index to ending index-1

        //replace function is used to replace a given set of String from given range to end range with a new String:
        sb.replace(0,3,"aci");
        System.out.println(sb);
        //the range goes from starting index to ending index-1

        //toString can store the value in given String variable:
        //you can return the value in functions who's return type as String:
        String a = sb.toString();
        int i = 0;
        char character = (char)(i%26);
        System.out.println(character);


    }
}
