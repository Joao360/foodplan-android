package com.joaograca.recipes.data.remote.response

const val INVALID_GET_RECIPE_RESPONSE = """
    {
    "vegqetarian": true,
    "vegean": true,
    "glutenFree": false,
    "dairwwyFree": true,
    "veryHesdalthy": true,
    "cheap": false,
    "veryPopular": false,
    "sussdatainable": false,
    "lowFodmap": false,
    "weightWatcherSmartPoints": 16,
    "gapsz": "no",
    "preparationMinutes": -1,
    "cookingMinutes": -1,
    "aggregateLikes": 156,
    "healthScore": 98,
    "creditsText": "Lisa's Vegetarian Kitchen",
    "sadlicense": "CC BY 2.5 CA",
    "sourceName": "Food and Spice",
    "pricePerServing": 178.57,
    "extenxczdedIngredients": [
        {
            "id": 10016049,
            "aisle": "Pasta and Rice;Canned and Jarred",
            "image": "dry-cannellini-beans.jpg",
            "consistency": "SOLID",
            "name": "dried cannellini beans",
            "nameClean": "dried cannellini beans",
            "original": "1 1/4 cups dried cannellini beans (3 1/2 cups cooked)",
            "originalName": "1/4 cups dried cannellini beans cooked)",
            "amount": 3.5,
            "unit": "cups",
            "meta": [
                "dried",
                "cooked"
            ],
            "measures": {
                "us": {
                    "amount": 3.5,
                    "unitShort": "cups",
                    "unitLong": "cups"
                },
                "metric": {
                    "amount": 828.058,
                    "unitShort": "ml",
                    "unitLong": "milliliters"
                }
            }
        },
        {
            "id": 2018,
            "aisle": "Spices and Seasonings",
            "image": "fennel-seeds.jpg",
            "consistency": "SOLID",
            "name": "fennel seeds",
            "nameClean": "fennel seeds",
            "original": "1/2 teaspoon fennel seeds",
            "originalName": "fennel seeds",
            "amount": 0.5,
            "unit": "teaspoon",
            "meta": [],
            "measures": {
                "us": {
                    "amount": 0.5,
                    "unitShort": "tsps",
                    "unitLong": "teaspoons"
                },
                "metric": {
                    "amount": 0.5,
                    "unitShort": "tsps",
                    "unitLong": "teaspoons"
                }
            }
        },
        {
            "id": 11215,
            "aisle": "Produce",
            "image": "garlic.png",
            "consistency": "SOLID",
            "name": "garlic",
            "nameClean": "garlic",
            "original": "3 cloves garlic, thinly sliced",
            "originalName": "garlic, thinly sliced",
            "amount": 3.0,
            "unit": "cloves",
            "meta": [
                "thinly sliced"
            ],
            "measures": {
                "us": {
                    "amount": 3.0,
                    "unitShort": "cloves",
                    "unitLong": "cloves"
                },
                "metric": {
                    "amount": 3.0,
                    "unitShort": "cloves",
                    "unitLong": "cloves"
                }
            }
        },
        {
            "id": 1002030,
            "aisle": "Spices and Seasonings",
            "image": "pepper.jpg",
            "consistency": "SOLID",
            "name": "ground pepper",
            "nameClean": "black pepper",
            "original": "fresh ground black pepper",
            "originalName": "fresh ground black pepper",
            "amount": 6.0,
            "unit": "servings",
            "meta": [
                "fresh",
                "black"
            ],
            "measures": {
                "us": {
                    "amount": 6.0,
                    "unitShort": "servings",
                    "unitLong": "servings"
                },
                "metric": {
                    "amount": 6.0,
                    "unitShort": "servings",
                    "unitLong": "servings"
                }
            }
        },
        {
            "id": 10028033,
            "aisle": "Bakery/Bread",
            "image": "italian-bread.jpg",
            "consistency": "SOLID",
            "name": "italian bread",
            "nameClean": "italian bread",
            "original": "Italian bread, cut into 1/2-inch thick slices and toasted",
            "originalName": "Italian bread, cut into 1/2-inch thick slices and toasted",
            "amount": 6.0,
            "unit": "servings",
            "meta": [
                "italian",
                "toasted",
                "cut into 1/ slices and "
            ],
            "measures": {
                "us": {
                    "amount": 6.0,
                    "unitShort": "servings",
                    "unitLong": "servings"
                },
                "metric": {
                    "amount": 6.0,
                    "unitShort": "servings",
                    "unitLong": "servings"
                }
            }
        },
        {
            "id": 11233,
            "aisle": "Produce",
            "image": "kale.jpg",
            "consistency": "SOLID",
            "name": "kale",
            "nameClean": "kale",
            "original": "1 lb (450 g) fresh kale, stemmed and coarsely chopped",
            "originalName": "lb fresh kale, stemmed and coarsely chopped",
            "amount": 450.0,
            "unit": "g",
            "meta": [
                "fresh",
                "stemmed",
                "coarsely chopped"
            ],
            "measures": {
                "us": {
                    "amount": 15.873,
                    "unitShort": "oz",
                    "unitLong": "ounces"
                },
                "metric": {
                    "amount": 450.0,
                    "unitShort": "g",
                    "unitLong": "grams"
                }
            }
        },
        {
            "id": 4053,
            "aisle": "Oil, Vinegar, Salad Dressing",
            "image": "olive-oil.jpg",
            "consistency": "LIQUID",
            "name": "olive oil",
            "nameClean": "olive oil",
            "original": "2 tablespoons olive oil",
            "originalName": "olive oil",
            "amount": 2.0,
            "unit": "tablespoons",
            "meta": [],
            "measures": {
                "us": {
                    "amount": 2.0,
                    "unitShort": "Tbsps",
                    "unitLong": "Tbsps"
                },
                "metric": {
                    "amount": 2.0,
                    "unitShort": "Tbsps",
                    "unitLong": "Tbsps"
                }
            }
        },
        {
            "id": 11282,
            "aisle": "Produce",
            "image": "brown-onion.png",
            "consistency": "SOLID",
            "name": "onions",
            "nameClean": "onion",
            "original": "2 medium onions, finely chopped",
            "originalName": "onions, finely chopped",
            "amount": 2.0,
            "unit": "medium",
            "meta": [
                "finely chopped"
            ],
            "measures": {
                "us": {
                    "amount": 2.0,
                    "unitShort": "medium",
                    "unitLong": "mediums"
                },
                "metric": {
                    "amount": 2.0,
                    "unitShort": "medium",
                    "unitLong": "mediums"
                }
            }
        },
        {
            "id": 11819,
            "aisle": "Produce",
            "image": "red-chili.jpg",
            "consistency": "SOLID",
            "name": "red chilies",
            "nameClean": "chili pepper",
            "original": "4 dried whole red chilies, crumbled",
            "originalName": "dried whole red chilies, crumbled",
            "amount": 4.0,
            "unit": "",
            "meta": [
                "dried",
                "whole",
                "red",
                "crumbled"
            ],
            "measures": {
                "us": {
                    "amount": 4.0,
                    "unitShort": "",
                    "unitLong": ""
                },
                "metric": {
                    "amount": 4.0,
                    "unitShort": "",
                    "unitLong": ""
                }
            }
        },
        {
            "id": 1012047,
            "aisle": "Spices and Seasonings",
            "image": "salt.jpg",
            "consistency": "SOLID",
            "name": "sea salt",
            "nameClean": "coarse sea salt",
            "original": "1/2 teaspoon sea salt",
            "originalName": "sea salt",
            "amount": 0.5,
            "unit": "teaspoon",
            "meta": [],
            "measures": {
                "us": {
                    "amount": 0.5,
                    "unitShort": "tsps",
                    "unitLong": "teaspoons"
                },
                "metric": {
                    "amount": 0.5,
                    "unitShort": "tsps",
                    "unitLong": "teaspoons"
                }
            }
        },
        {
            "id": 11529,
            "aisle": "Produce",
            "image": "tomato.png",
            "consistency": "SOLID",
            "name": "tomato",
            "nameClean": "tomato",
            "original": "1 medium tomato, seeded and finely chopped",
            "originalName": "tomato, seeded and finely chopped",
            "amount": 1.0,
            "unit": "medium",
            "meta": [
                "seeded",
                "finely chopped"
            ],
            "measures": {
                "us": {
                    "amount": 1.0,
                    "unitShort": "medium",
                    "unitLong": "medium"
                },
                "metric": {
                    "amount": 1.0,
                    "unitShort": "medium",
                    "unitLong": "medium"
                }
            }
        },
        {
            "id": 6615,
            "aisle": "Canned and Jarred",
            "image": "chicken-broth.png",
            "consistency": "LIQUID",
            "name": "vegetable stock",
            "nameClean": "vegetable stock",
            "original": "2 cups vegetable stock",
            "originalName": "vegetable stock",
            "amount": 2.0,
            "unit": "cups",
            "meta": [],
            "measures": {
                "us": {
                    "amount": 2.0,
                    "unitShort": "cups",
                    "unitLong": "cups"
                },
                "metric": {
                    "amount": 473.176,
                    "unitShort": "ml",
                    "unitLong": "milliliters"
                }
            }
        }
    ],
    "id": 716220,
    "title": "Italian White Bean and Kale Soup",
    "readyInMinutes": 45,
    "servings": 6,
    "sourceUrl": "http://foodandspice.blogspot.com/2008/02/italian-white-bean-and-kale-soup.html",
    "image": "https://spoonacular.com/recipeImages/716220-556x370.jpg",
    "imageType": "jpg",
    "summary": "The recipe Italian White Bean and Kale Soup is ready <b>in around 45 minutes</b> and is definitely a great <b>vegan</b> option for lovers of Mediterranean food. For <b>${'$'}1.79 per serving</b>, you get a main course that serves 6. One portion of this dish contains around <b>34g of protein</b>, <b>14g of fat</b>, and a total of <b>619 calories</b>. It will be a hit at your <b>Autumn</b> event. 156 people have tried and liked this recipe. Head to the store and pick up cannellini beans, onions, ground pepper, and a few other things to make it today. To use up the sea salt you could follow this main course with the <a href=\"https://spoonacular.com/recipes/raspberry-sea-salt-brownies-494161\">Raspberry Sea Salt Brownies</a> as a dessert. All things considered, we decided this recipe <b>deserves a spoonacular score of 99%</b>. This score is great. Try <a href=\"https://spoonacular.com/recipes/italian-white-bean-and-kale-soup-757399\">Italian White Bean and Kale Soup</a>, <a href=\"https://spoonacular.com/recipes/white-bean-soup-with-kale-and-turkey-italian-sausage-497270\">White Bean Soup with Kale and Turkey Italian Sausage</a>, and <a href=\"https://spoonacular.com/recipes/kale-and-white-bean-soup-15225\">Kale And White Bean Soup</a> for similar recipes.",
    "cuisines": [
        "Mediterranean",
        "Italian",
        "European"
    ],
    "dishTypes": [
        "lunch",
        "main course",
        "main dish",
        "dinner"
    ],
    "diets": [
        "dairy free",
        "lacto ovo vegetarian",
        "vegan"
    ],
    "occasions": [
        "fall",
        "winter"
    ],
    "winePairing": {
        "pairedWines": [
            "chianti",
            "trebbiano",
            "verdicchio"
        ],
        "pairingText": "Italian on the menu? Try pairing with Chianti, Trebbiano, and Verdicchio. Italians know food and they know wine. Trebbiano and Verdicchio are Italian white wines that pair well with fish and white meat, while Chianti is a great Italian red for heavier, bolder dishes. The Ricasoli Castello di Brolio Chianti Classico with a 4.3 out of 5 star rating seems like a good match. It costs about 46 dollars per bottle.",
        "productMatches": [
            {
                "id": 433641,
                "title": "Ricasoli Castello di Brolio Chianti Classico",
                "description": "Dark ruby color, with lots of chocolate, berry and vanilla aromas, this is full-bodied and velvety, with lots of fruit and a long, succulent finish. A beauty from a great vintage.",
                "price": "${'$'}45.99",
                "imageUrl": "https://spoonacular.com/productImages/433641-312x231.jpg",
                "averageRating": 0.86,
                "ratingCount": 8.0,
                "score": 0.82,
                "link": "https://click.linksynergy.com/deeplink?id=*QCiIS6t4gA&mid=2025&murl=https%3A%2F%2Fwww.wine.com%2Fproduct%2Fricasoli-castello-di-brolio-chianti-classico-1997%2F28225"
            }
        ]
    },
    "instructions": "Soak the beans overnight in a medium saucepan covered with 2 inches of water and with a little yogurt whey or lemon juice added. Drain and rinse, then transfer to a medium or large saucepan and cover with several inches of fresh water.  Bring to a boil, then reduce the heat to low, cover, and simmer for 40 to 60 minutes until the beans are tender but still firm. Drain, reserving 1 cup of the cooking liquid.Meanwhile, prepare an ice bath in a large bowl. Bring a large saucepan of water to a boil. Add the kale and cook for just 3 minutes. Drain, reserving 1 cup of the cooking liquid. Plunge the cooked kale into the ice bath for a few moments, then drain and set aside.Once the beans are cooked and set aside along with some of their cooking liquid, heat the olive oil in a large saucepan or soup pot over medium heat. Add the onion and saut for 5 minutes until soft. Add the garlic, chilies and fennel seeds and cook, stirring occasionally, for 2 more minutes.Stir in the vegetable stock, tomato and beans along with the reserved cooking liquids from the beans and kale. Bring to a boil, then reduce the heat to a simmer. Simmer for 30 to 40 minutes until the beans are soft.Stir in the salt and fresh ground black pepper and taste for seasoning. Remove the soup from the heat and stir in the kale.Serve hot or warm in wide shallow soup bowls with a piece of toasted Italian bread on top",
    "analyzedInstructions": [
        {
            "name": "",
            "steps": [
                {
                    "number": 1,
                    "step": "Soak the beans overnight in a medium saucepan covered with 2 inches of water and with a little yogurt whey or lemon juice added.",
                    "ingredients": [
                        {
                            "id": 9152,
                            "name": "lemon juice",
                            "localizedName": "lemon juice",
                            "image": "lemon-juice.jpg"
                        },
                        {
                            "id": 1116,
                            "name": "yogurt",
                            "localizedName": "yogurt",
                            "image": "plain-yogurt.jpg"
                        },
                        {
                            "id": 0,
                            "name": "beans",
                            "localizedName": "beans",
                            "image": "kidney-beans.jpg"
                        },
                        {
                            "id": 14412,
                            "name": "water",
                            "localizedName": "water",
                            "image": "water.png"
                        }
                    ],
                    "equipment": [
                        {
                            "id": 404669,
                            "name": "sauce pan",
                            "localizedName": "sauce pan",
                            "image": "sauce-pan.jpg"
                        }
                    ]
                },
                {
                    "number": 2,
                    "step": "Drain and rinse, then transfer to a medium or large saucepan and cover with several inches of fresh water.  Bring to a boil, then reduce the heat to low, cover, and simmer for 40 to 60 minutes until the beans are tender but still firm.",
                    "ingredients": [
                        {
                            "id": 0,
                            "name": "beans",
                            "localizedName": "beans",
                            "image": "kidney-beans.jpg"
                        },
                        {
                            "id": 14412,
                            "name": "water",
                            "localizedName": "water",
                            "image": "water.png"
                        }
                    ],
                    "equipment": [
                        {
                            "id": 404669,
                            "name": "sauce pan",
                            "localizedName": "sauce pan",
                            "image": "sauce-pan.jpg"
                        }
                    ],
                    "length": {
                        "number": 40,
                        "unit": "minutes"
                    }
                },
                {
                    "number": 3,
                    "step": "Drain, reserving 1 cup of the cooking liquid.Meanwhile, prepare an ice bath in a large bowl. Bring a large saucepan of water to a boil.",
                    "ingredients": [
                        {
                            "id": 14412,
                            "name": "water",
                            "localizedName": "water",
                            "image": "water.png"
                        },
                        {
                            "id": 10014412,
                            "name": "ice",
                            "localizedName": "ice",
                            "image": "ice-cubes.png"
                        }
                    ],
                    "equipment": [
                        {
                            "id": 404669,
                            "name": "sauce pan",
                            "localizedName": "sauce pan",
                            "image": "sauce-pan.jpg"
                        },
                        {
                            "id": 404783,
                            "name": "bowl",
                            "localizedName": "bowl",
                            "image": "bowl.jpg"
                        }
                    ]
                },
                {
                    "number": 4,
                    "step": "Add the kale and cook for just 3 minutes.",
                    "ingredients": [
                        {
                            "id": 11233,
                            "name": "kale",
                            "localizedName": "kale",
                            "image": "kale.jpg"
                        }
                    ],
                    "equipment": [],
                    "length": {
                        "number": 3,
                        "unit": "minutes"
                    }
                },
                {
                    "number": 5,
                    "step": "Drain, reserving 1 cup of the cooking liquid. Plunge the cooked kale into the ice bath for a few moments, then drain and set aside.Once the beans are cooked and set aside along with some of their cooking liquid, heat the olive oil in a large saucepan or soup pot over medium heat.",
                    "ingredients": [
                        {
                            "id": 4053,
                            "name": "olive oil",
                            "localizedName": "olive oil",
                            "image": "olive-oil.jpg"
                        },
                        {
                            "id": 0,
                            "name": "beans",
                            "localizedName": "beans",
                            "image": "kidney-beans.jpg"
                        },
                        {
                            "id": 11233,
                            "name": "kale",
                            "localizedName": "kale",
                            "image": "kale.jpg"
                        },
                        {
                            "id": 0,
                            "name": "soup",
                            "localizedName": "soup",
                            "image": ""
                        },
                        {
                            "id": 10014412,
                            "name": "ice",
                            "localizedName": "ice",
                            "image": "ice-cubes.png"
                        }
                    ],
                    "equipment": [
                        {
                            "id": 404669,
                            "name": "sauce pan",
                            "localizedName": "sauce pan",
                            "image": "sauce-pan.jpg"
                        },
                        {
                            "id": 404752,
                            "name": "pot",
                            "localizedName": "pot",
                            "image": "stock-pot.jpg"
                        }
                    ]
                },
                {
                    "number": 6,
                    "step": "Add the onion and saut for 5 minutes until soft.",
                    "ingredients": [
                        {
                            "id": 11282,
                            "name": "onion",
                            "localizedName": "onion",
                            "image": "brown-onion.png"
                        }
                    ],
                    "equipment": [],
                    "length": {
                        "number": 5,
                        "unit": "minutes"
                    }
                },
                {
                    "number": 7,
                    "step": "Add the garlic, chilies and fennel seeds and cook, stirring occasionally, for 2 more minutes.Stir in the vegetable stock, tomato and beans along with the reserved cooking liquids from the beans and kale. Bring to a boil, then reduce the heat to a simmer. Simmer for 30 to 40 minutes until the beans are soft.Stir in the salt and fresh ground black pepper and taste for seasoning.",
                    "ingredients": [
                        {
                            "id": 1002030,
                            "name": "ground black pepper",
                            "localizedName": "ground black pepper",
                            "image": "pepper.jpg"
                        },
                        {
                            "id": 6615,
                            "name": "vegetable stock",
                            "localizedName": "vegetable stock",
                            "image": "chicken-broth.png"
                        },
                        {
                            "id": 2018,
                            "name": "fennel seeds",
                            "localizedName": "fennel seeds",
                            "image": "fennel-seeds.jpg"
                        },
                        {
                            "id": 1042027,
                            "name": "seasoning",
                            "localizedName": "seasoning",
                            "image": "seasoning.png"
                        },
                        {
                            "id": 11819,
                            "name": "chili pepper",
                            "localizedName": "chili pepper",
                            "image": "red-chili.jpg"
                        },
                        {
                            "id": 11215,
                            "name": "garlic",
                            "localizedName": "garlic",
                            "image": "garlic.png"
                        },
                        {
                            "id": 11529,
                            "name": "tomato",
                            "localizedName": "tomato",
                            "image": "tomato.png"
                        },
                        {
                            "id": 0,
                            "name": "beans",
                            "localizedName": "beans",
                            "image": "kidney-beans.jpg"
                        },
                        {
                            "id": 11233,
                            "name": "kale",
                            "localizedName": "kale",
                            "image": "kale.jpg"
                        },
                        {
                            "id": 2047,
                            "name": "salt",
                            "localizedName": "salt",
                            "image": "salt.jpg"
                        }
                    ],
                    "equipment": [],
                    "length": {
                        "number": 32,
                        "unit": "minutes"
                    }
                },
                {
                    "number": 8,
                    "step": "Remove the soup from the heat and stir in the kale.",
                    "ingredients": [
                        {
                            "id": 11233,
                            "name": "kale",
                            "localizedName": "kale",
                            "image": "kale.jpg"
                        },
                        {
                            "id": 0,
                            "name": "soup",
                            "localizedName": "soup",
                            "image": ""
                        }
                    ],
                    "equipment": []
                },
                {
                    "number": 9,
                    "step": "Serve hot or warm in wide shallow soup bowls with a piece of toasted Italian bread on top",
                    "ingredients": [
                        {
                            "id": 10028033,
                            "name": "italian bread",
                            "localizedName": "italian bread",
                            "image": "italian-bread.jpg"
                        },
                        {
                            "id": 0,
                            "name": "soup",
                            "localizedName": "soup",
                            "image": ""
                        }
                    ],
                    "equipment": [
                        {
                            "id": 404783,
                            "name": "bowl",
                            "localizedName": "bowl",
                            "image": "bowl.jpg"
                        }
                    ]
                }
            ]
        }
    ],
    "originalId": null,
    "spoonacularSourceUrl": "https://spoonacular.com/italian-white-bean-and-kale-soup-716220"
}
"""