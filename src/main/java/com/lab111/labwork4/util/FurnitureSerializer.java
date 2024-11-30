package com.lab111.labwork4.util;

import java.io.*;
import com.lab111.labwork4.furniture.chair.Chair;

public class FurnitureSerializer {
    public static void serializeChair(Chair chair, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(chair);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Chair deserializeChair(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (Chair) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}