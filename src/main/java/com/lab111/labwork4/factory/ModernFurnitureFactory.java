package com.lab111.labwork4.factory;

import com.lab111.labwork4.furniture.chair.Chair;
import com.lab111.labwork4.furniture.chair.ModernChair;
import com.lab111.labwork4.furniture.table.Table;
import com.lab111.labwork4.furniture.table.ModernTable;
import com.lab111.labwork4.furniture.sofa.Sofa;
import com.lab111.labwork4.furniture.sofa.ModernSofa;
import com.lab111.labwork4.furniture.bookshelf.Bookshelf;
import com.lab111.labwork4.furniture.bookshelf.ModernBookshelf;

public class ModernFurnitureFactory implements FurnitureFactory {
    private static ModernFurnitureFactory instance;

    public ModernFurnitureFactory() {}

    public static ModernFurnitureFactory getInstance() {
        if (instance == null) {
            instance = new ModernFurnitureFactory();
        }
        return instance;
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Bookshelf createBookshelf() {
        return new ModernBookshelf();
    }
}