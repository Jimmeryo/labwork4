package com.lab111.labwork4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.lab111.labwork4.factory.ModernFurnitureFactory;
import com.lab111.labwork4.furniture.chair.Chair;
import com.lab111.labwork4.furniture.chair.ModernChair;
import com.lab111.labwork4.furniture.table.Table;
import com.lab111.labwork4.furniture.table.ModernTable;
import com.lab111.labwork4.furniture.sofa.Sofa;
import com.lab111.labwork4.furniture.sofa.ModernSofa;
import com.lab111.labwork4.furniture.bookshelf.Bookshelf;
import com.lab111.labwork4.furniture.bookshelf.ModernBookshelf;

public class ModernFurnitureFactoryTest {

    @Test
    public void testCreateChair() {
        ModernFurnitureFactory factory = ModernFurnitureFactory.getInstance();
        Chair chair = factory.createChair();
        assertNotNull(chair);
        assertTrue(chair instanceof ModernChair);
    }

    @Test
    public void testCreateTable() {
        ModernFurnitureFactory factory = ModernFurnitureFactory.getInstance();
        Table table = factory.createTable();
        assertNotNull(table);
        assertTrue(table instanceof ModernTable);
    }

    @Test
    public void testCreateSofa() {
        ModernFurnitureFactory factory = ModernFurnitureFactory.getInstance();
        Sofa sofa = factory.createSofa();
        assertNotNull(sofa);
        assertTrue(sofa instanceof ModernSofa);
    }

    @Test
    public void testCreateBookshelf() {
        ModernFurnitureFactory factory = ModernFurnitureFactory.getInstance();
        Bookshelf bookshelf = factory.createBookshelf();
        assertNotNull(bookshelf);
        assertTrue(bookshelf instanceof ModernBookshelf);
    }

    @Test
    public void testSingletonInstance() {
        ModernFurnitureFactory factory1 = ModernFurnitureFactory.getInstance();
        ModernFurnitureFactory factory2 = ModernFurnitureFactory.getInstance();
        assertSame(factory1, factory2, "ModernFurnitureFactory should be a singleton");
    }
}