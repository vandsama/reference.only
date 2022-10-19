import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

//Step 1.
public class MovieRental {
//Step 2.
    String title;
    String format;
    boolean isPremiumMovie = false;

//Step 3.
    public MovieRental(String title, String format, boolean isPremiumMovie) {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;
    }

    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public boolean isPremiumMovie() {
        return isPremiumMovie;
    }

    public BigDecimal getRentalPrice() {
        BigDecimal rentalPrice = new BigDecimal(0.00);
        rentalPrice = rentalPrice.setScale(2, RoundingMode.HALF_UP);

        BigDecimal premiumPrice = new BigDecimal(1.00);
        premiumPrice = premiumPrice.setScale(2, RoundingMode.HALF_UP);

        BigDecimal VHSPrice = new BigDecimal(0.99);
        VHSPrice = VHSPrice.setScale(2, RoundingMode.HALF_UP);

        BigDecimal DVDPrice = new BigDecimal(1.99);
        DVDPrice = DVDPrice.setScale(2, RoundingMode.HALF_UP);

        BigDecimal bluRayPrice = new BigDecimal(2.99);
        bluRayPrice = bluRayPrice.setScale(2, RoundingMode.HALF_UP);


        if (isPremiumMovie) {
            rentalPrice = rentalPrice.add(premiumPrice);
        }

        if (format.equals("VHS")) {
            rentalPrice = rentalPrice.add(VHSPrice);
        } else if (format.equals("DVD")) {
            rentalPrice = rentalPrice.add(DVDPrice);
        } else if (format.equals("Blu-ray")) {
            rentalPrice = rentalPrice.add(bluRayPrice);
        }

        return rentalPrice;
    }

//Step 5.
    public BigDecimal lateFee(int daysLate) {
        if (daysLate == 0) {
            return BigDecimal.valueOf(0.00);
        }
        else if (daysLate == 1) {
            return BigDecimal.valueOf(1.99);
        } else if (daysLate == 2) {
            return BigDecimal.valueOf(3.99);
        } else if (daysLate >= 3) {
            return BigDecimal.valueOf(19.99);
        } else {
            return BigDecimal.valueOf(0.00);
        }
    }

//Step 6.
    @Override
    public String toString() {
        return String.format("MOVIE - {" + title + "} - {" + format + "} {" + getRentalPrice() + "}");
    }

//Step 4.
    public static void main(String[] args) {
        MovieRental movieRental = new MovieRental("There's Something About Mary","DVD",true);
/////// File Reading////////////////////////////////////////////////////////////////////////////////////////////////////

        Scanner userInput = new Scanner(System.in);
        // Prompt the user for a file path - path should look like "MovieInput.csv"
        System.out.print("Enter path to the Movie Input file: ");
        String filePath = userInput.nextLine();

        // Create a File object using the path
        File movieFile = new File(filePath);
        // Setup some variables used in the loop
        BigDecimal totalRentalPrice = BigDecimal.valueOf(0.00);
        ArrayList<MovieRental> movieRentalArrayList = new ArrayList<>();

        // Open the file
        try (Scanner fileInput = new Scanner(movieFile)) {
            // Loop until the end of file is reached
            while (fileInput.hasNextLine()) {
                // Read the next line into 'lineOfText'
                String lineOfText = fileInput.nextLine();

/////////////////// Add the movie rental prices/////////////////////////////////////////////////////////////////////////
                    String[] lineArray = lineOfText.split(",");

                    String movieTitle = lineArray[0];
                    String movieFormat = lineArray[1];
                    Boolean movieIsPremiumMovie = Boolean.valueOf(lineArray[2]);

                    MovieRental movieRentalFromFile = new MovieRental(movieTitle,movieFormat,movieIsPremiumMovie);

                    movieRentalArrayList.add(movieRentalFromFile);
            }
        }
        catch (FileNotFoundException e) {
            // Could not find the file at the specified path.
            System.out.println("The file was not found: " + movieFile.getAbsolutePath());
        }
        // Tell the user how many lines of content were found.

        System.out.println("");
        for (MovieRental movieRentalEnum : movieRentalArrayList) {
            totalRentalPrice = totalRentalPrice.add(movieRentalEnum.getRentalPrice());
            System.out.println(movieRentalEnum.toString());
        }
        System.out.println("\nTotal Rental Price is: " + totalRentalPrice);
    }

}
