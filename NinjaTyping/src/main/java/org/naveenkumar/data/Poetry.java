package org.naveenkumar.data;

import java.util.Random;

public class Poetry {

    private String[] poems = {
            "Whose woods these are I think I know. His house is in the village though; He will not see me stopping here To watch his woods fill up with snow.\n" +
                    "My little horse must think it queer To stop without a farmhouse near Between the woods and frozen lakeThe darkest evening of the year.\n" +
                    "He gives his harness bells a shake To ask if there is some mistake. The only other sound’s the sweep Of easy wind and downy flake.   \n" +
                    "The woods are lovely, dark and deep, But I have promises to keep, And miles to go before I sleep, And miles to go before I sleep.",
            "The night is darkening round me, The wild winds coldly blow; But a tyrant spell has bound me, And I cannot, cannot go.\n" +
                    "The giant trees are bending Their bare boughs weighed with snow; The storm is fast descending, And yet I cannot go.\n" +
                    "Clouds beyond clouds above me, Wastes beyond wastes below; But nothing drear can move me; I will not, cannot go.",
            "Out of the night that covers me, Black as the pit from pole to pole, I thank whatever gods may be For my unconquerable soul.\n" +
                    "In the fell clutch of circumstance I have not winced nor cried aloud. Under the bludgeonings of chance My head is bloody, but unbowed.\n" +
                    "Beyond this place of wrath and tears Looms but the Horror of the shade, And yet the menace of the years Finds and shall find me unafraid.\n" +
                    "It matters not how strait the gate, How charged with punishments the scroll, I am the master of my fate, I am the captain of my soul.",
            "I met a traveller from an antique land,\n" +
                    "Who said—“Two vast and trunkless legs of stone\n" +
                    "Stand in the desert. . . . Near them, on the sand,\n" +
                    "Half sunk a shattered visage lies, whose frown,\n" +
                    "And wrinkled lip, and sneer of cold command,\n" +
                    "Tell that its sculptor well those passions read\n" +
                    "Which yet survive, stamped on these lifeless things,\n" +
                    "The hand that mocked them, and the heart that fed;\n" +
                    "And on the pedestal, these words appear:\n" +
                    "My name is Ozymandias, King of Kings;\n" +
                    "Look on my Works, ye Mighty, and despair!\n" +
                    "Nothing beside remains. Round the decay\n" +
                    "Of that colossal Wreck, boundless and bare\n" +
                    "The lone and level sands stretch far away.”"
    };

    public String[] getPoems() {
        return poems;
    }

    public String getRandomFruitVegetable(){
        Random rand = new Random();
        int randomIndex = rand.nextInt(this.poems.length);
        return this.poems[randomIndex];
    }
}
