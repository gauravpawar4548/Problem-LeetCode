//Find the Index first Word

  public class Practicedmain {
    public static void main(String[] args) {

        String s1 = "hello world";
        int cnt =0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=' ')
            {
                cnt++;
            }else if(cnt>0)
            {
                break;
            }
        }
        System.out.println("print the length : "+cnt);