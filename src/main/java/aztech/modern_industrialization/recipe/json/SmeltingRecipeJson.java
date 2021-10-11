/*
 * MIT License
 *
 * Copyright (c) 2020 Azercoco & Technici4n
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package aztech.modern_industrialization.recipe.json;

@SuppressWarnings({ "FieldCanBeLocal", "MismatchedQueryAndUpdateOfCollection", "UnusedDeclaration" })
public class SmeltingRecipeJson implements RecipeJson {
    private final String type;
    private final int cookingtime;
    private final double experience;
    private final Ingredient ingredient;
    private final String result;

    public enum SmeltingRecipeType {
        SMELTING,
        BLASTING;

        public static SmeltingRecipeType ofBlasting(boolean blasting) {
            return blasting ? BLASTING : SMELTING;
        }
    }

    public static class Ingredient {
        String item;
    }

    public SmeltingRecipeJson(SmeltingRecipeType type, String inputItem, String outputItem, int cookingtime, double experience) {
        this.type = type == SmeltingRecipeType.SMELTING ? "minecraft:smelting" : "minecraft:blasting";
        this.cookingtime = cookingtime;
        this.experience = experience;
        this.ingredient = new Ingredient();
        ingredient.item = inputItem;
        result = outputItem;
    }
}
