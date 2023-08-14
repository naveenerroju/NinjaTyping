package org.naveenkumar.data;

import java.util.Random;

public class Colors {
    
    private final String[] colors = {
            "White","Black","Orange","Maroon",
            "Red","Yellow","Lime green","Salmon",
            "Green","Sky blue","Crimson","Aqua",
            "Grey","Purple","Mustard","Peach",
            "Violet","Magenta","Coral","Saffron",
            "Brown","Pink","Tan","Teal","" +
            "Navy Blue","Turquoise","Lavender","Beige",
            "Lemon yellow","Grape vine","Indigo","Fuchsia",
            "Amber","Sea green","Dark green","Burgundy",
            "Charcoal","Bronze","Cream","Mauve",
            "Olive","Cyan","Silver","Rust",
            "Ruby","Azure","Mint","Pearl",
            "Ivory","Tangerine","Cherry red","Garnet",
            "Emerald","Sapphire","Rosewood","Lilac",
            "Arctic blue","Pista green","Coffee brown","Umber",
            "Brunette","Mocha","Ash","Jet black"
    };

    public String[] getColors() {
        return colors;
    }

    public String getRandomcolor(){
        Random rand = new Random();
        int randomIndex = rand.nextInt(this.colors.length);
        return this.colors[randomIndex];
    }
}
