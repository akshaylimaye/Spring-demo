package com.geekster.utils;


import java.util.ArrayList;
import java.util.List;

public class Utiltiy {

   static List<String> docList = new ArrayList<>();

   public void saveDoc(String docName){
       docList.add(docName);
   }
}
