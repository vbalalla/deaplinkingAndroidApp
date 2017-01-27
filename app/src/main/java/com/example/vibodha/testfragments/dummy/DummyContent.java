package com.example.vibodha.testfragments.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 5;

    static {
        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(createDummyItem(i));
//        }

        addItem(new DummyItem("1", "Cappuccino", "Coffee drink composed of double espresso and hot milk, with the surface topped with foamed milk", "https://upload.wikimedia.org/wikipedia/commons/7/7e/Cappuccino_(birds_eye).jpg"));
        addItem(new DummyItem("2", "Chocolate cupcake", "A rich, tender homemade chocolate cupcake topped with my favorite vanilla frosting. " , "https://s-media-cache-ak0.pinimg.com/236x/f7/0b/2a/f70b2ace35a1c6b3171eee6989c2de7a.jpg"));
        addItem(new DummyItem("3", "Strawberry Cheese", "The creamy texture and lovely look of this cheesecake always gets compliment" , "https://upload.wikimedia.org/wikipedia/commons/c/cd/Strawberry_Cheese_Cake.jpg"));
        addItem(new DummyItem("4", "Blueberry Cheese", "The creamy texture and lovely look of this cheesecake always gets compliment" , "https://c1.staticflickr.com/3/2159/1510061200_77f3d26dee_b.jpg"));
        addItem(new DummyItem("5", "Cafe Latte", "Creamy coffee drink made with espresso and steamed milk." , "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Koffie_verkeerd_cafe_MP_Amsterdam.jpg/926px-Koffie_verkeerd_cafe_MP_Amsterdam.jpg"));
        addItem(new DummyItem("6", "Vanilla Cream Puffs", "A rich, tender homemade cupcake topped with my favorite vanilla frosting. " , "https://cdn.pixabay.com/photo/2015/07/04/10/04/cream-puff-831133_960_720.jpg"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position) , "");
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String img;

        public DummyItem(String id, String content, String details, String img) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.img = img;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
