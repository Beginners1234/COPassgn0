public class checkingUserInput () {
     String []  userInput;
   public checkingUserInput (String [] s) {
           userInput = s; }
      public Boolean validInput() {
         int len = s.length();
         
         Boolean valid =true;
         for (int i=0;i<len;i++){
         if (s[i].equals("")){valid = false;break;}
         }
         return valid;
         }
