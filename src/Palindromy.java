public class Palindromy {
    public boolean Palindromy(String str){
        return str.replaceAll("[^a-zA-Z]", "").toLowerCase().replaceAll("\\s+", "").equals(new StringBuilder(str.replaceAll("[^a-zA-Z]", "").toLowerCase().replaceAll("\\s+", "")).reverse().toString());
    }
    public static void main(String[] args) {
        Palindromy p = new Palindromy();
        System.out.println(p.Palindromy("kajak"));
        System.out.println(p.Palindromy("kajwk"));
        System.out.println(p.Palindromy("wa w "));
    }
}
