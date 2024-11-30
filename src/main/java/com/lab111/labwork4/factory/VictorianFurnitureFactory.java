package com.lab111.labwork4.factory;

import com.lab111.labwork4.furniture.chair.Chair;
import com.lab111.labwork4.furniture.chair.VictorianChair;
import com.lab111.labwork4.furniture.table.Table;
import com.lab111.labwork4.furniture.table.VictorianTable;
import com.lab111.labwork4.furniture.sofa.Sofa;
import com.lab111.labwork4.furniture.sofa.VictorianSofa;
import com.lab111.labwork4.furniture.bookshelf.Bookshelf;
import com.lab111.labwork4.furniture.bookshelf.VictorianBookshelf;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Bookshelf createBookshelf() {
        return new VictorianBookshelf();
    }
}