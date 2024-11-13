package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateSulfurasTest() {
        Item[] items = new Item[]{
            new Item("Sulfuras, Hand of Ragnaros", 5, 80)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, items[0].sellIn); // Check if a day has passed
        assertEquals(80, items[0].quality);

    }
    @Test
    void updateAgeBriesQuality() {
        Item[] items = new Item[]{
            new Item("Aged Brie", 2, 0)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, items[0].sellIn); // Check if a day has passed
        assertEquals(1, items[0].quality);
    }

    @Test
    void updateAgeBriesMaxQuality() {
        Item[] items = new Item[]{
            new Item("Aged Brie", 2, 49)
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(0, items[0].sellIn); // Check if a day has passed
        assertEquals(50, items[0].quality);
    }

    @Test
    void updateBackstagePasses15DaysQuality() {
        Item[] items = new Item[]{
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(14, items[0].sellIn); // Check if a day has passed
        assertEquals(21, items[0].quality);
    }

    @Test
    void updateBackstagePasses10DaysQuality() {
        Item[] items = new Item[]{
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, items[0].sellIn); // Check if a day has passed
        assertEquals(22, items[0].quality);
    }

    @Test
    void updateBackstagePasses5DaysQuality() {
        Item[] items = new Item[]{
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, items[0].sellIn); // Check if a day has passed
        assertEquals(23, items[0].quality);
    }

    @Test
    void updateBackstagePasses0DayQuality() {
        Item[] items = new Item[]{
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, items[0].sellIn); // Check if a day has passed
        assertEquals(0, items[0].quality);
    }

    @Test
    void updateBackstagePassesMaxQuality() {
        Item[] items = new Item[]{
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, items[0].sellIn); // Check if a day has passed
        assertEquals(50, items[0].quality);
    }

    @Test
    void updateQuality() {
        Item[] items = new Item[]{
            new Item("Elixir of the Mongoose", 5, 7),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, items[0].sellIn); // Check if a day has passed
        assertEquals(6, items[0].quality);
    }

    @Test
    void updateMinQuality() {
        Item[] items = new Item[]{
            new Item("Elixir of the Mongoose", 5, 0),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, items[0].sellIn); // Check if a day has passed
        assertEquals(0, items[0].quality);
    }

    @Test
    void updateTwiceFasterQuality() {
        Item[] items = new Item[]{
            new Item("Elixir of the Mongoose", 0, 10),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1, items[0].sellIn); // Check if a day has passed
        assertEquals(8, items[0].quality);
    }
}


