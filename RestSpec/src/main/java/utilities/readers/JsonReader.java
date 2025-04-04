package utilities.readers;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {
    public JSONObject jsonObject;

    public JsonReader(String file) {
        parseJson(file);
    }

    public void parseJson(String file) {
        String jsonData = readFile(file);
        try {
            jsonObject = new JSONObject(jsonData);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public String readFile(String file) {
        String result = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String Line = bufferedReader.readLine();

            while (Line != null) {
                stringBuilder.append(Line);
                Line = bufferedReader.readLine();
            }
            result = stringBuilder.toString();
            return result;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
