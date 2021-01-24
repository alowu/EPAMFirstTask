package com.epam.task.first.data;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {

    public List<String> readData(String fileName) throws DataException {
        List<String> lines = new ArrayList<>();
        try (FileReader fr = new FileReader(fileName)) {
            Scanner scanner = new Scanner(fr);

            lines.add(scanner.nextLine());
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }

        return lines;
    }
}
