public class Toggle{

    public static String ToggleString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;  i < str.length();  i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
                sb.append(ch);
            }else if(Character.isUpperCase(ch)){
               ch =  Character.toLowerCase(ch);
                sb.append(ch);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) { 
        String str = "pRINce";
        System.out.println(ToggleString(str));
    }
}