package common;

import java.util.HashMap;

public class Validation {
public static String value;
public static HashMap<String, String> capitalCities;
public static String m1(String key)
{
capitalCities = new HashMap<String, String>();
   capitalCities.put("OpenFB", "Facebook – log in or sign up");
   value=capitalCities.get(key);
return value;
   
}
public static String m2(String key)
{
capitalCities = new HashMap<String, String>();
   capitalCities.put("OpenLoginPage", "Facebook – log in or sign up");
   value=capitalCities.get(key);
return value;
   
}
public static String m3(String key)
{
capitalCities = new HashMap<String, String>();
   capitalCities.put("EnterEmailid", "Facebook – log in or sign up");
   value=capitalCities.get(key);
return value;
   

}
public static String m4(String key)
{
capitalCities = new HashMap<String, String>();
   capitalCities.put("EnterPassword", "Facebook – log in or sign up");
   value=capitalCities.get(key);
return value;
   

}
public static String m5(String key)
{
capitalCities = new HashMap<String, String>();
   capitalCities.put("Submit", "Facebook – log in or sign up");
   value=capitalCities.get(key);
return value;
   

}
public static String m6(String key)
{
capitalCities = new HashMap<String, String>();
   capitalCities.put("Searchitem", "Facebook – log in or sign up");
   value=capitalCities.get(key);
return value;
   
}
}
