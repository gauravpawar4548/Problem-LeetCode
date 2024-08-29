//Remove Duplicate Character
   

        String s1="java Programing java";
           String s="";
           for(int i=0;i<s1.length();i++)
           {
               int cnt=0;
               for(int j=0;j<i;j++)
               {
                   if(s1.charAt(i)==s1.charAt(j))
                   {
                       cnt++;
                   }
               }
               if(cnt==0)
               {
                   System.out.print(s1.charAt(i));
               }
           }