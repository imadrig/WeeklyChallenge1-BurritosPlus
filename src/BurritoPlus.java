import java.util.Random;

public class BurritoPlus {
    public static void main(String[] args){
        //Price variables
        double basePrice = 3.00;
        double addIngredient = .50;
        double totalPrice;
        //Random generator for choosing ingredients
        Random genRand = new Random();

        //Arrays that hold ingredient list
        String rice [] = {"white rice", "brown rice", "no rice", "all rice"};
        String meat [] = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie meat", "no meat", "all meat"};
        String beans [] = {"pinto beans", "black beans", "no beans", "all beans"};
        String salsa [] = {"mild salsa", "medium salsa", "hot salsa", "no salsa", "all salsa"};
        String veggies [] = {"lettuce", "fajita veggies", "no veggies", "all veggies"};
        String cheese [] = {"add cheese", "no cheese"};
        String guac [] = {"add guac", "no guac"};
        String queso [] = {"add queso", "no queso"};
        String sourCream [] = {"add sour cream", "no sour cream"};


        //Loop for 25 burritos with randomly generated ingredients & display burrito orders
        for (int count = 1; count <= 25; count++){

            //Selecting random ingredients
            int ingredientRice = genRand.nextInt(rice.length);
            int ingredientMeat = genRand.nextInt(meat.length);
            int ingredientBeans = genRand.nextInt(beans.length);
            int ingredientSalsa = genRand.nextInt(salsa.length);
            int ingredientVeggies = genRand.nextInt(veggies.length);
            int ingredientCheese = genRand.nextInt(cheese.length);
            int ingredientGuac = genRand.nextInt(guac.length);
            int ingredientQueso = genRand.nextInt(queso.length);
            int ingredientSourCream = genRand.nextInt(sourCream.length);

            //Finding Price
            if (ingredientRice != 2) {
                totalPrice = basePrice + addIngredient;
                if (ingredientMeat != 6)
                    totalPrice = totalPrice + addIngredient;
                    if (ingredientBeans != 2)
                        totalPrice = totalPrice + addIngredient;
                        if (ingredientSalsa != 3)
                            totalPrice = totalPrice + addIngredient;
                            if (ingredientVeggies != 2)
                                totalPrice = totalPrice + addIngredient;
                                if (ingredientCheese != 1)
                                    totalPrice = totalPrice + addIngredient;
                                    if (ingredientGuac != 1)
                                        totalPrice = totalPrice + addIngredient;
                                        if (ingredientQueso != 1)
                                            totalPrice = totalPrice + addIngredient;
                                            if (ingredientSourCream != 1)
                                                totalPrice = totalPrice + addIngredient;

                //Displaying results
                System.out.println("\nBurrito " + count + " " + ("($"
                        + totalPrice + "0)") + ": "
                        + rice[ingredientRice] + ", "
                        + meat[ingredientMeat] + ", "
                        + beans[ingredientBeans] + ", "
                        + salsa[ingredientSalsa] + ", "
                        + veggies[ingredientVeggies] + ", "
                        + cheese[ingredientCheese] + ", "
                        + guac[ingredientGuac] + ", "
                        + queso[ingredientQueso] + ", "
                        + sourCream[ingredientSourCream]);
            }
        }
    }
}
