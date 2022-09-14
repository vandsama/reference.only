package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsInWoods = 3;
		int raccoonsGoHome = 2;
		int raccoonsLeftInWoods = raccoonsInWoods - raccoonsGoHome;


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int difference = flowers - bees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int pigeonsEatingBreadcrumbs = 1;
		pigeonsEatingBreadcrumbs +=1;

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsSitting = 3;
		owlsSitting += 2;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		beaversWorking -=1;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 2;
		toucansSitting += 1;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInATree = 4;
		int nutsInATree = 2;
		int differenceOfSquirrelsAndNuts = squirrelsInATree - nutsInATree;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quartersFound = .25;
		double dimesFound = .1;
		double nickelsFound = .05 * 2;
		double moneyFound = quartersFound + dimesFound + nickelsFound;

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brierMuffins = 18;
		int macAdamsMuffins = 20;
		int flanneryMuffins = 17;
		int firstGradeMuffins = brierMuffins + macAdamsMuffins + flanneryMuffins;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoPrice = .24;
		double whistlePrice = .14;
		double toysPriceTotal = yoyoPrice + whistlePrice;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallowsUsed = 8;
		int miniMarshmallowsUsed = 10;
		int totalMarshmallowsUsed = largeMarshmallowsUsed + miniMarshmallowsUsed;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHiltHouse = 29;
		int snowAtBrecknockSchool = 17;
		int differenceOfSnow = snowAtHiltHouse - snowAtBrecknockSchool;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double moneyOfMrsHilt = 10.0;
		double moneySpentOnToyTruck = 3.0;
		double moneySpentOnPencilCase = 2.0;
		double moneySpentOnToys = moneySpentOnToyTruck + moneySpentOnPencilCase;
		double moneyRemainingAfterPurchases = moneyOfMrsHilt - moneySpentOnToys;

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marblesOfJosh = 16;
		int marblesLostByJosh = 7;
		int marblesRemaining = marblesOfJosh - marblesLostByJosh;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seashellsOfMegan = 19;
		int seashellsGoal = 25;
		int seashellsToFind = seashellsGoal - seashellsOfMegan;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloonsOfBrad = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloonsOfBrad - redBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int booksAddedByMarta = 10;
		int booksOnShelfAfterAdding = booksOnShelf + booksAddedByMarta;
		// booksOnShelf += booksAddedByMarta;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfLegsOnABee = 6;
		int numberOfBees = 8;
		int totalBeeLegs = numberOfLegsOnABee * numberOfBees;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfIceCreamCone = .99;
		int numberOfIceCreamCones = 2;
		double totalCostOfIceCreamCones = numberOfIceCreamCones * costOfIceCreamCone;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNecessary = 125;
		int rocksInSupply = 64;
		int rocksNeeded = rocksNecessary - rocksInSupply;

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int totalMarblesOfMrsHilt = 38;
		int marblesLostByMrsHilt = 15;
		int marblesLeftForMrsHilt = totalMarblesOfMrsHilt - marblesLostByMrsHilt;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMilesAway = 78;
		int milesDriven = 32;
		int milesRemaining = totalMilesAway - milesDriven;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int timeShovelingSnowOnSaturdayMorning = 90;
		int timeShovelingSnowOnSaturdayAfternoon = 45;
		int totalTimeShovelingSnow = timeShovelingSnowOnSaturdayMorning + timeShovelingSnowOnSaturdayAfternoon;

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hotDogsBought = 6;
		double costOfHotDog = .5;
		double totalCostOfHotDogs = hotDogsBought * costOfHotDog;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int centsAvailable = 50;
		int centsPencilCosts = 7;
		int numberPencilsCanBeBought = centsAvailable / centsPencilCosts;

//		int x = (int) 10D;
//		double moneyMrsHiltHas = .50D;
//		double costOfPencil = .07D;
//		double pencilsCanBePurchased = (moneyMrsHiltHas / costOfPencil) - (moneyMrsHiltHas%costOfPencil);
//

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterfliesSeen = 33;
		int orangeButterfliesSeen = 20;
		int redButterfliesSeen = butterfliesSeen - orangeButterfliesSeen;

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyGivenToClerk = 1;
		double costOfCandy = .54;
		double changeExpected = moneyGivenToClerk - costOfCandy;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesInBackyard = 13;
		int treesPlantedInAddition = 12;
		int totalTreesInBackyard = treesInBackyard + treesPlantedInAddition;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysRemainingToSeeGrandma = 2;
		int hoursInADay = 24;
		int hoursRemainingToSeeGrandma = daysRemainingToSeeGrandma * hoursInADay;

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int piecesOfGumPerCousin = 5;
		int totalGumNeeded = numberOfCousins * piecesOfGumPerCousin;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double moneyDanHas = 3;
		double moneySpentOnCandyBar = 1;
		double moneyRemainingForDan = moneyDanHas - moneySpentOnCandyBar;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peoplePerBoat = 3;
		int totalPeopleInBoats = boatsInLake * peoplePerBoat;

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legosEllenHas = 380;
		int legosEllenLost = 57;
		int legosRemaining = legosEllenHas - legosEllenLost;
		//legosEllenHas -= legosEllenLost;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsArthurBaked = 35;
		int muffinsGoal = 83;
		int muffinsNeededInAddition = muffinsGoal - muffinsArthurBaked;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int crayonsWillyHas = 1400;
		int crayonsLucyHas = 290;
		int crayonsWillyHasInExcessOfLucy = crayonsWillyHas - crayonsLucyHas;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int totalStickers = stickersPerPage * pagesOfStickers;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakes = 100.0;
		int children = 8;
		double cupcakesPerChild = cupcakes / children;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int cookiesMade = 47;
		int cookiesPerJar = 6;
		int cookiesLeftover = cookiesMade % cookiesPerJar;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissantsMade = 59;
		int neighborsWhoGetCroissants = 8;
		int croissantsRemaining = croissantsMade % neighborsWhoGetCroissants;

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerTray = 12;
		int cookies = 276;
		int traysNeeded = cookies / cookiesPerTray;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzelsMade = 480;
		int pretzelServingSize = 12;
		int totalServingsMade = pretzelsMade / pretzelServingSize;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int cupcakesMadeForOrphanage = 53;
		int cupcakesLeftAtHome = 2;
		int cupcakesPerBox = 3;
		int boxesGivenAwayToOrphanage = (cupcakesMadeForOrphanage - cupcakesLeftAtHome) / cupcakesPerBox;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticksPrepared = 74;
		int peopleServed = 12;
		int carrotsRemaining = carrotSticksPrepared % peopleServed;

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98;
		int teddyBearsPerShelf = 7;
		int shelvesFilled = teddyBears / teddyBearsPerShelf;

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picturesPerAlbum = 20;
		int totalPictures = 480;
		int albumsNeeded = totalPictures / picturesPerAlbum;

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalTradingCards = 94;
		int cardsPerBox = 8;
		int boxesFilled = totalTradingCards / cardsPerBox;
		int remainingNumberOfCards = totalTradingCards % cardsPerBox;

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int numberOfBooks = 210;
		int numberOfShelves = 10;
		int booksPerShelf = numberOfBooks / numberOfShelves;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double croissants = 17.0;
		int guests = 7;
		double croissantsPerGuest = croissants / guests;

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates,
	    and then divide the total number of rooms to be painted by the combined rate.
	    */

		double billRoomsPaintedPerHour = 1 / 2.15;
		double jillRoomsPaintedPerHour = 1/1.9;
		double combinedRoomsPaintedPerHour = billRoomsPaintedPerHour + jillRoomsPaintedPerHour;
		int numberOfRooms = 5;
		double totalTimeToPaintFiveRooms = 5 / combinedRoomsPaintedPerHour;

//		double timeRequiredByBillToPaintRoom = 2.15;
//		double billRoomsPaintedPerHour = 60 / timeRequiredByBillToPaintRoom;
//		double timeRequiredByJillToPaintRoom = 1.9;
//		double jillRoomsPaintedPerHour = 60 / timeRequiredByJillToPaintRoom;
//		int numberOfRoomsToPaint = 5;
//		double combinedRate = billRoomsPaintedPerHour + jillRoomsPaintedPerHour;
//		double timeRequiredToPaint = numberOfRoomsToPaint / combinedRate;


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distanceOfTrip = 800d;
		double distanceTravelled = 537d;
		int percentageDistanceTravelled = (int) ((distanceTravelled / distanceOfTrip) * 100);
	}

}
