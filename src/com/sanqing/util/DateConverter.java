 package com.sanqing.util;
 
 import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.util.Map;
 
 public class DateConverter extends DefaultTypeConverter
 {
   private static final DateFormat[] ACCEPT_DATE_FORMATS = { 
     new SimpleDateFormat("dd/MM/yyyy"), 
     new SimpleDateFormat("yyyy-MM-dd"), 
     new SimpleDateFormat("yyyy/MM/dd") };
 
   public Object convertValue(Map context, Object value, Class toType)
   {
     if (toType == Date.class) {
       Date date = null;
       String dateString = null;
       String[] params = (String[])value;
       dateString = params[0];
       for (DateFormat format : ACCEPT_DATE_FORMATS) {
         try {
           return format.parse(dateString);
         }
         catch (Exception localException)
         {
         }
       }
 
       return null;
     }if (toType == String.class)
     {
       Date date = (Date)value;
       return new SimpleDateFormat("yyyy-MM-dd").format(date);
     }
     return null;
   }
 }

