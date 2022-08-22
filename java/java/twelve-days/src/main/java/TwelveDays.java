import java.util.Arrays;
class TwelveDays {
    
    String[] song = {
        "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n",
        "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
        "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
            "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" };

    
     String[] giftGiven = {
        "a Partridge in a Pear Tree.\n", "two Turtle Doves, ",
        "three French Hens, ", "four Calling Birds, ",
        "five Gold Rings, ", "six Geese-a-Laying, ",
        "seven Swans-a-Swimming, ", "eight Maids-a-Milking, ",
        "nine Ladies Dancing, ", "ten Lords-a-Leaping, ",
        "eleven Pipers Piping, ", "twelve Drummers Drumming, ",
        
    };
     String[] day = {
        "first", "second", "third", "fourth", "fifth", "sixth", "seventh",
        "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };

    String getGifts(int verseNumber)
    {
        String giftLine="";
        for(int i =0;i<verseNumber;i++)
            {
                if(i==0 && verseNumber>1)
                    giftLine = "and "+ giftGiven[i]+giftLine;
                else
                    giftLine = ""+ giftGiven[i]+giftLine;
            }
        return giftLine;
    }
    String verse(int verseNumber) {
         //return song[verseNumber-1];
         return ("On the " + day[verseNumber-1] + " day of Christmas my true love gave to me: " + getGifts(verseNumber));

    }

    String verses(int startVerse, int endVerse) {
         String result = "";
        /*
        for (int i = startVerse; i < endVerse ; i++) {
            result += song[i-1] + "\n";
        }
        result += song[endVerse-1];
        return result;*/

        for (int i = startVerse; i < endVerse; i++) {
         result += verse(i) + "\n";
        }
      return result + verse(endVerse);
    
    }
    
    String sing() {
 return verses(1, song.length);
    }
}
