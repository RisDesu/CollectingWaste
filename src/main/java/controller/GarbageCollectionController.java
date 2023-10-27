/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.math.BigInteger;
import model.GarbageCollection;
import model.GarbageCollection;
import view.GarbageCollectionView;

/**
 *
 * @author HP
 */
public class GarbageCollectionController {
    private GarbageCollection model;
    private GarbageCollectionView view;

    public GarbageCollectionController(GarbageCollection model, GarbageCollectionView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printTotalCost(model.getTotalCost());
    }

    public void calculateCost() {
        model.calculateCost();
    }
}


