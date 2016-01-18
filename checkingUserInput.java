public class checkingUserInput () {
     String []  userInput;
   public checkingUserInput (String [] s) {
           userInput = s; }
      public Boolean validInput() {
          Boolean name_empty= false ;
         Boolean one_empty = false;
         Boolean two_empty = false;
         Boolean three_empty = false;
         Boolean three_complete_empty= false ;
         
         if (s[0]==null) name_empty = true;
         if ((s[1]==null)||(s[2]==null)) one_empty = true;
         if ((s[3]==null)||(s[4]==null)) two_empty = true;
         if ((s[5]==null)||(s[6]==null)) three_empty = true;
         if ((s[5]==null)&&(s[6]==null))three_complete_empty  = true;
         
         Boolean valid =true;
         
         if ((one_empty)||(two_empty)||((three_empty)&&(!three_complete_empty)))valid = false;
         
         return valid;
         }
