package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkHours {
    private int minWork = 25;
    private StringBuilder stringBuilder = new StringBuilder();

    public String minWork(String path) {
        String line;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(path))) {
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        return stringBuilder.toString();
    }

    private void processLine(String line) {
        String[] splitted = line.split(",");
        if (Integer.parseInt(splitted[1]) < minWork) {
            stringBuilder.delete(0, stringBuilder.length());
            stringBuilder.append(splitted[0]).append(": ").append(splitted[2]);
            minWork = Integer.parseInt(splitted[1]);
        }
    }
}
