package com.lab111.labwork4.factory;

import com.lab111.labwork4.furniture.chair.Chair;
import com.lab111.labwork4.furniture.chair.MinimalistChair;
import com.lab111.labwork4.furniture.table.Table;
import com.lab111.labwork4.furniture.table.MinimalistTable;
import com.lab111.labwork4.furniture.sofa.Sofa;
import com.lab111.labwork4.furniture.sofa.MinimalistSofa;
import com.lab111.labwork4.furniture.bookshelf.Bookshelf;
import com.lab111.labwork4.furniture.bookshelf.MinimalistBookshelf;

public class MinimalistFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MinimalistChair();
    }

    @Override
    public Table createTable() {
        return new MinimalistTable();
    }

    @Override
    public Sofa createSofa() {
        return new MinimalistSofa();
    }

    @Override
    public Bookshelf createBookshelf() {
        return new MinimalistBookshelf();
    }
}