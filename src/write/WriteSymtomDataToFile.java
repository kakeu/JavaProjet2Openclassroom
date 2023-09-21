package write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class WriteSymtomDataToFile implements IWriteSymptomDataToFile{
    private String filename;

    /**
     * on écrit les symptoms dans le fichier result.out
     * @param filename
     */

    public WriteSymtomDataToFile(String filename) {
        this.filename = filename;
    }
    @Override
    public void write(List<String> symptoms, Map<String, Integer> symptomsCounter) {

        try {
            FileWriter writer = new FileWriter (filename);
            for (String symptom : symptoms) {
                writer.write(symptom+" = "+symptomsCounter.get(symptom)+"\n");
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
