 // reverce print String for constant


         String s1="Java Langauge";

         String result = "";
                  for(int i= s1.length()-1;i>=0;i--)
         {
             result = result + s1.charAt(i);
         }
        System.out.println(result);