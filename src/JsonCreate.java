
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kristof
 */
public class JsonCreate {

    JSONObject outerObject = new JSONObject();
    JSONArray outerArray = new JSONArray();
    JSONObject innerObject = new JSONObject();
    JSONArray innerArray = new JSONArray();

    String s = "[{\"shakil\",\"29\",\"7676\"}]";

    public void makeJson() {
        
        innerObject.put("mode", "1"); //0 - stop   1 - manual   2 - start 
        innerObject.put("up", "0.8");
        innerObject.put("down", "0.9");
        innerObject.put("left", "0.5");
        innerObject.put("right", "0.4");
        
        

        System.out.println(innerObject.toString());

    }
}
