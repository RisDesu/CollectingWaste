/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.math.BigInteger;

public class GarbageCollection {
     private int[] garbageAtStations;
    private int totalCost;

    public GarbageCollection(int[] garbageAtStations) {
        this.garbageAtStations = garbageAtStations;
        this.totalCost = 0;
    }

    public void calculateCost() {
        int total = 0;
        int time = 0;

        for (int i = 0; i < garbageAtStations.length; i++) {
            total += garbageAtStations[i];
            time += 8;

            if (total >= 10000) {
                total = 0;
                time += 30;
            }

            if (i == garbageAtStations.length - 1) {
                time += 30;
            }
        }

        this.totalCost = time * 120000 + 57000;
    }

    public int getTotalCost() {
        return this.totalCost;
    }
}



