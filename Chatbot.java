public class Chatbot
{
 //Instant Constructors
 private int age = 16;
 private String name = "Justin";
 private String place = "New York";
 public static String username;
 //Default Constructor
 public Chatbot()
 {
   age = 16;
   name = "Justin";
   place = "New York";
 }
 public Chatbot(String n, int a, String p)
 {
  age = a;
  name = n;
  place = p;
 }
 //methods
 public String greeting()
 {
   return "Hello! What is your name?";
 }
 public String setUsername(String n)
 {
   username = n;
   return "Nice to meet you " + username +"!";
 }
 public String getUsername()
 {
   return username;
 }
 //changed from r to phrase pretty sure is right check on 11/21/19
 public String response(String phrase)
 {
  if((phrase.toLowerCase()).indexOf("what")>-1)
  {
   return whatResponse(phrase);
  }
  else if(phrase.toLowerCase().indexOf("how")>-1)
  {
   return howResponse(phrase);
  }
  else if(phrase.toLowerCase().indexOf("where")>-1)
  {
   return whereResponse(phrase); 
  }
  else if(phrase.toLowerCase().indexOf("my name")>-1)
  {
   String nameHolderTwo;
   String nameHolder = phrase.toLowerCase();
   nameHolderTwo = nameHolder.substring(nameHolder.indexOf("my name is"));
   setUsername(nameHolder);
  }
  else
  {
    return distractResponse(phrase);
  }
 }
 public String whatResponse(String phrase)
 {
   if(phrase.indexOf("name")>-1)
   {
     return "My name is " + name;
   }
   else if(phrase.indexOf("age")>-1)
   {
    return "My age is" + age;
   }
   else if(phrase.indexOf("+")>-1)
   {
     String stringHolder = "";
     while(phrase.indexOf(" ")>-1)
     {
       stringHolder = phrase.substring(phrase.indexOf(" "));
     }
     String strFirstNum = stringHolder.substring(0,phrase.indexOf("+")-1);
     String strLastNum =  stringHolder.substring(phrase.indexOf("+")+1);
     int intFirstNum = Integer.parseInt(strFirstNum);
     int intLastNum = Integer.parseInt(strLastNum);
     return intFirstNum + intLastNum + " ";   
   }
   else if(phrase.indexOf("-")>-1)
   {
     String stringHolder = "";
     while(phrase.indexOf(" ")>-1)
     {
       stringHolder = phrase.substring(phrase.indexOf(" "));
     }
     String strFirstNum = stringHolder.substring(0,phrase.indexOf("+")-1);
     String strLastNum =  stringHolder.substring(phrase.indexOf("+")+1);
     int intFirstNum = Integer.parseInt(strFirstNum);
     int intLastNum = Integer.parseInt(strLastNum);
     return intFirstNum - intLastNum + "";
   }
   else if(phrase.indexOf("*")>-1)
   {
     String stringHolder = "";
     while(phrase.indexOf(" ")>-1)
     {
       stringHolder = phrase.substring(phrase.indexOf(" "));
     }
     String strFirstNum = stringHolder.substring(0,phrase.indexOf("+")-1);
     String strLastNum =  stringHolder.substring(phrase.indexOf("+")+1);
     int intFirstNum = Integer.parseInt(strFirstNum);
     int intLastNum = Integer.parseInt(strLastNum);
     return (intFirstNum * intLastNum) + " ";
   }
   else if(phrase.indexOf("/")>-1)
   {
    String stringHolder = "";
     while(phrase.indexOf(" ")>-1)
     {
       stringHolder = phrase.substring(phrase.indexOf(" "));
     }
     String strFirstNum = stringHolder.substring(0,phrase.indexOf("+")-1);
     String strLastNum =  stringHolder.substring(phrase.indexOf("+")+1);
     int intFirstNum = Integer.parseInt(strFirstNum);
     int intLastNum = Integer.parseInt(strLastNum);
     return (intFirstNum / intLastNum) + "";
   }
   else{
     return "Youre a bully I DONT KNOW!!";
   }
   }
   public String howResponse(String phrase)
   {
     if(phrase.indexOf("age")>1)
     {
      return "I am " + age + "years old";
     }
     else
     {
       return "You think im dumb?";
     }
   }
public String whereResponse(String phrase)
{
 if(phrase.indexOf("from")>1)
 {
  return "I live in " + place;
 }
 else if(phrase.indexOf("from")>1)
 {
  return "I am from " + place; 
 }
 else
 {
   return "";
   
 }
}
public String distractResponse(String phrase)
{
 return "I dont know but my question is why dont you?";
}

}
    