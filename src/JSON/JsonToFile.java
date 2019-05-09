/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author rizky
 */
public class JsonToFile {
       public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "Rizky Abraham");
        obj.put("age", 30);

        JSONArray list = new JSONArray();
        list.add("I'll");
        list.add("be");
        list.add("back!");

        obj.put("quote", list);
        
        //create a jsonprojects folder first
        try (FileWriter file = new FileWriter("c:\\jsonprojects\\test.json")) {
            file.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }
}
